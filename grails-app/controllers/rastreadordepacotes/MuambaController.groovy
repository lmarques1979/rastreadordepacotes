package rastreadordepacotes

import seguranca.Usuario;
import java.awt.event.ItemEvent;
import java.text.SimpleDateFormat
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import correios.*
import xml.*
import grails.plugin.springsecurity.annotation.Secured
import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional


@Transactional(readOnly = true)
@Secured("isFullyAuthenticated()")
class MuambaController extends BaseController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	
	@Transactional
	def index(Integer max) {    
		
		def resultado = Muamba.createCriteria().list(paginacaoParams) {
			if(usuarioLogado!=null){
				eq("usuario" , usuarioLogado)
			}
			eq("entregue", false)
		}	
		
		respond resultado, model:[muambaInstanceCount: resultado.totalCount]
    }
	
	def filtro(Integer max){
		
		def statusfiltro
		def datahoradtini, datahoradtfinal  , datahorafiltro , formatofiltro
		formatofiltro = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		if(params.datainicial!=null && params.datainicial!=''){
			datahorafiltro  = params.datainicial + ' ' + '00:00'
			datahoradtini 	= formatofiltro.parse(datahorafiltro);
			
		}else{
			datahoradtini 	= null;
			
		}
		if(params.datafinal!=null && params.datafinal!=''){
			datahorafiltro  = params.datafinal + ' ' + '23:59'
			datahoradtfinal	= formatofiltro.parse(datahorafiltro);
		}else{
			datahoradtfinal	= null;
		}

		def resultadofiltro = Muamba.createCriteria().list (paginacaoParams) {
			if(usuarioLogado!=null){
				eq("usuario" , usuarioLogado)
			}
			if(params.codigo!=null && params.codigo!=""){
				eq("codigo", params.codigo)
			}
			if(params.status=="1"){
				eq("entregue", false)
			}
			if(params.status=="2"){
				eq("entregue", true)
			}
			if(params.pais!=null && params.pais!='-1'){
				eq("pais.id", Long.valueOf(params.pais).longValue())
			}
			if(params.datainicial!=null && params.datainicial!=''){
				ge("dataultimostatus" , datahoradtini)
			}
			if(params.datafinal!=null && params.datafinal!=''){
				le("dataultimostatus" , datahoradtfinal)
			}
		}
		
		def total = resultadofiltro.totalCount
		respond resultadofiltro, model:[muambaInstanceCount: total]
	}

	@Secured('permitAll')
	def dataultimaatualizacao(){
		
		def dataatualizacao = Muamba.createCriteria().get {
			projections {
				max "dataultimaatualizacao"
			}
		} as Date
	
		respond dataatualizacao, model:[UltimaData: dataatualizacao]
		
	}
	
	@Transactional
	@Secured(["authentication.name=='admin'"])
	def atualizastatus() {
		
		def resultado = Usuario.findAll()
		
		resultado.each() {
			
				def enviaemail 	= it.enviaremail
				def enviasms   	= it.enviarsms
				def destinatario= it.email
				
				it.muambas.each(){
									
							Muamba muambaInstance = it
							
							def dataultimostatus  = muambaInstance.dataultimostatus
							
							muambaInstance.dataultimaatualizacao=new Date()
							muambaInstance.save flush:true
														
							if (muambaInstance.hasErrors()) {
									respond muambaInstance.errors, view:'atualizastatus'
									return
							}
							
							if(!muambaInstance.entregue){
								
									def geraxml = new GeraXML();
									def sroxml 	= geraxml.xml(muambaInstance.codigo , "T");
									
									sroxml.each(){
										it.objeto.each(){
											def int i=0
											it.eventos.each(){
												def tipo , status , data , hora, descricao, localfinal
												def destinofinal, datahora, classe, imagem
												def datahoradt
												def formato
												def existedestino=false
												def evento = new Diversos();
												tipo 			= it.tipo
												status 			= it.status
												data			= it.data
												hora			= it.hora
												datahora        = it.data + ' ' + it.hora
												formato 		= new SimpleDateFormat("dd/MM/yyyy HH:mm");
												datahoradt 		= formato.parse(datahora);
												descricao 		= evento.retornaDescricaoStatus(it.status, it.tipo)
												localfinal		= evento.retornaLocal(it.local , it.cidade , it.uf)
												classe			= evento.verificaImagem(it.status, it.tipo)
														
												//Leio destino
												it.destino.each(){
													existedestino = true
													def destino = new Diversos();
													destinofinal = destino.retornaDestino(tipo , status, it.local , it.bairro, it.cidade, it.uf)
												}
												
												//Objeto Internacional - Recebido
												if ( !existedestino && ((tipo == 'PAR') && (status =='15' || status =='16' ||  status =='17' ||  status =='18'))){
													destinofinal = 'Recebido/Brasil'
												}
												
												//Entregue
												if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='01'){
													muambaInstance.entregue = true
													muambaInstance.save flush:true
																			
													if (muambaInstance.hasErrors()) {
														respond muambaInstance.errors, view:'atualizastatus'
														return
													}
												}
												
												if(i==0){
													muambaInstance.dataultimostatus=datahoradt
													muambaInstance.save flush:true
														
													if (muambaInstance.hasErrors()) {
														respond muambaInstance.errors, view:'atualizastatus'
														return
													}
													
													i++
												}
												
												//Insiro as datas maiores da ultima inserida para nao repetir
												if(datahoradt > dataultimostatus || dataultimostatus==null){
													
													//Insiro Histórico do Pacotes Recuperado do XML dos correios
													def HistoricoMuamba historicomuamba = new HistoricoMuamba(
														tipo:tipo,status:status,descricao:descricao,
														local:localfinal,localdestino:destinofinal,
														muamba:muambaInstance , dataevento: datahoradt , classe:classe)
																					
													historicomuamba.save flush:true
													
													if (historicomuamba.hasErrors()) {
														respond historicomuamba.errors, view:'atualizastatus'
														return
													}
												}
												
												if(enviaemail || enviasms){
													def assunto
													def mensagem
													assunto  = "[Rastreador Pacote] - Movimentação do pacote " +  muambaInstance.codigo + "(" + muambaInstance.descricao + ")"
													mensagem = "Detalhes do rastreamento do código <b>" + muambaInstance.codigo + "</b><br>"
													mensagem = mensagem + "Descrição: <b>" + muambaInstance.descricao + "</b><br><br>"
													mensagem = mensagem + "Última(s) atualização(ões):<br>"
													mensagem = mensagem + "<b>" + datahora + " - " + localfinal
														  
												    if(destinofinal!=null && destinofinal!=""){
													  mensagem = mensagem + " - " + destinofinal
												    }
												    mensagem = mensagem + " - " + descricao
													  
													if (enviaemail)	{
														//Envio e-mail de alteração de status	
														if (datahoradt > muambaInstance.dataultimoenvioemail || muambaInstance.dataultimoenvioemail==null){
														 
															//Envio E-mail
															sendMail {
																to destinatario
																subject assunto
																html mensagem
															}
														
															muambaInstance.dataultimoenvioemail = datahoradt
															muambaInstance.save flush:true
																					
															if (muambaInstance.hasErrors()) {
																respond muambaInstance.errors, view:'atualizastatus'
																return
															}
														}
													}
												
													if (enviasms)	{
														//Envio SMS de alteração de status
														if (datahoradt > muambaInstance.dataultimoenviosms || muambaInstance.dataultimoenviosms==null){
															
														//Envio SMS
														/*=========
														 * EM BREVE
														 * ========
														
														//Entregue
														if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='01'){
															muambaInstance.entregue = true
															muambaInstance.save flush:true
																					
															if (muambaInstance.hasErrors()) {
																respond muambaInstance.errors, view:'index'
																return
															}
														}
														
														muambaInstance.dataultimoenviosms   = datahoradt
														muambaInstance.dataultimostatus 	= datahoradt
														
														muambaInstance.save flush:true
																					
														if (muambaInstance.hasErrors()) {
																respond muambaInstance.errors, view:'index'
																return
														}
														*/
														
													}
												}
											}
										}
									}
								}
							}
					}
		}
		
		flash.message = "Dados Atualizados com Sucesso."
		respond flash.message
	}
	
	def show(Muamba muambaInstance) {
		
		def resultado = Muamba.findAll("from Muamba as m where m.usuario=? and m.id=?", [usuarioLogado , muambaInstance.id])
        respond resultado 
    }
	def create() {
        respond new Muamba(params)
    }

    @Transactional
	def save(Muamba muambaInstance) {
        
		if (muambaInstance == null) {
            notFound()
            return
        }else{
		
				def  codigo 	= muambaInstance.codigo
				def  pais 		= codigo.substring(Math.max(codigo.length() - 2, 0));
				def  resultado 	= Pais.findByCodigo(pais)
				resultado.each() {
							muambaInstance.pais = it
				}
				
				muambaInstance.usuario = usuarioLogado
		}
		
        muambaInstance.save flush:true
		
		if (muambaInstance.hasErrors()) {
			respond muambaInstance.errors, view:'create'
			return
		}

		def dtultimostatus
		
		muambaInstance.each() {
				
				def datahoradt = new Date();
				def qtd
				def geraxml = new GeraXML();
				def sroxml 	= geraxml.xml(it.codigo, "T");
				qtd = sroxml.qtd;
				
				//Leio XML
				sroxml.each(){
					it.objeto.each(){
								def i = 0
								it.eventos.each(){
										
										def tipo , status , data , hora, descricao, localfinal
										def destinofinal, datahora, classe, imagem
										def existedestino=false
										def formato
										
										def evento = new Diversos();
										tipo 			= it.tipo
										status 			= it.status
										data			= it.data
										hora			= it.hora
										datahora        = it.data + ' ' + it.hora
										formato 		= new SimpleDateFormat("dd/MM/yyyy HH:mm");      
										datahoradt 		= formato.parse(datahora);   
										descricao 		= evento.retornaDescricaoStatus(it.status, it.tipo)
										localfinal		= evento.retornaLocal(it.local , it.cidade , it.uf)
										classe			= evento.verificaImagem(it.status, it.tipo)
										
										//Leio destino
										it.destino.each(){
											existedestino=true
											def destino = new Diversos();
											destinofinal = destino.retornaDestino(tipo , status, it.local , it.bairro, it.cidade, it.uf)
										}
										
										
										//Objeto Internacional - Recebido
										if ( !existedestino && ((tipo == 'PAR') && (status =='15' || status =='16' ||  status =='17' ||  status =='18'))){
											destinofinal = 'Recebido/Brasil'
										}
										
										//Insiro Histórico do Pacotes Recuperado do XML dos correios
										def HistoricoMuamba historicomuamba = new HistoricoMuamba(
												tipo:tipo,status:status,descricao:descricao,
												local:localfinal,localdestino:destinofinal,
												muamba:muambaInstance , dataevento: datahoradt , classe:classe)
																			
										historicomuamba.save flush:true
										
										if (historicomuamba.hasErrors()) {
											respond historicomuamba.errors, view:'index'
											return
										}										
										
										
										if(i==0){
											
											dtultimostatus=datahoradt
											
											//Entregue
											if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='01'){
												muambaInstance.entregue = true
												muambaInstance.save flush:true
																		
												if (muambaInstance.hasErrors()) {
													respond muambaInstance.errors, view:'index'
													return
												}
											}
											
											i++
										}
										
										
								}
								
					}
				}//sroxml
		}//each
		
		muambaInstance.dataultimoenviosms=dtultimostatus
		muambaInstance.dataultimoenvioemail=dtultimostatus
		muambaInstance.dataultimostatus=dtultimostatus
		muambaInstance.save flush:true
			
		if (muambaInstance.hasErrors()) {
			respond muambaInstance.errors, view:'create'
			return
		}
		
		request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'muamba.label', default: 'Muamba'), muambaInstance.id])
                redirect action:"create", method:"GET"
            }
            '*' { respond muambaInstance, [status: CREATED] }
        }
    }
	def edit(Muamba muambaInstance) {
        respond muambaInstance
    }

    @Transactional
	def update(Muamba muambaInstance) {
        if (muambaInstance == null) {
            notFound()
            return
        }

        muambaInstance.save flush:true
		
		if (muambaInstance.hasErrors()) {
			respond muambaInstance.errors, view:'edit'
			return
		}

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Muamba.label', default: 'Muamba'), muambaInstance.id])
                redirect muambaInstance
            }
            '*'{ respond muambaInstance, [status: OK] }
        }
    }

    @Transactional
	def delete(Muamba muambaInstance) {

        if (muambaInstance == null) {
            notFound()
            return
        }

        muambaInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Muamba.label', default: 'Muamba'), muambaInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'muamba.label', default: 'Muamba'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
