package correios

class Diversos {

	def verificaImagem(status , tipo) { 
		
				def classe = "indisponivel"
				
				//Entregue
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='01'){
					classe = "verde"
				}
				//Destinatário Ausente
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='02'){
					classe = "indisponivel"
				}
				//Não procurado
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='03'){
					classe = "indisponivel"
				}
				//Recusado
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='04'){
					classe = "indisponivel"
				}
				//Em devolução
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='05'){
					classe = "indisponivel"
				}
				//Destinatário desconhecido no endereço
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='06'){
					classe = "indisponivel"
				}
				//Endereço insuficiente para entrega
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='07'){
					classe = "indisponivel"
				}
				//Não existe o número indicado
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='08'){
					classe = "indisponivel"
				}
				//Extraviado
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='09'){
					classe = "indisponivel"
				}
				//Destinatário mudou-se
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='10'){
					classe = "indisponivel"
				}
				//Outros
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='11'){
					classe = "indisponivel"
				}
				//Refugado
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='12'){
					classe = "indisponivel"
				}
				//Endereço inc||reto
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='19'){
					classe = "indisponivel"
				}
				//Destinatário ausente
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='20'){
					classe = "indisponivel"
				}
				//Destinatário ausente
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='21'){
					classe = "indisponivel"
				}
				//Reintegrado
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='22'){
					classe = "indisponivel"
				}
				//Distribuído ao remetente
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='23'){
					classe = "indisponivel"
				}
				//Disponível em Caixa Postal
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='24'){
					classe = "indisponivel"
				}
				//Empresa sem Expediente
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='25'){
					classe = "indisponivel"
				}
				//Não procurado
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='26'){
					classe = "indisponivel"
				}
				//Pedido não solicitado
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='27'){
					classe = "indisponivel"
				}
				//Mercad||ia avariada
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='28'){
					classe = "indisponivel"
				}
				//Extraviado
				if ( (tipo == 'BDE' || tipo == 'BDR') && status =='31'){
					classe = "indisponivel"
				}
				//Entrega programada
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='32'){
					classe = "indisponivel"
				}
				//Documentação não f||necida pelo destinatário
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='33'){
					classe = "indisponivel"
				}
				//Logradouro com numeração irregular - Em Pesquisa
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='34'){
					classe = "indisponivel"
				}
				//Log. Reversa Simultânea
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='35'){
					classe = "indisponivel"
				}
				//Log. Reversa Simultânea
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='36'){
					classe = "indisponivel"
				}
				//Devolvido ao Remetente
				if ( (tipo == 'BDI') && status =='40'){
					classe = "indisponivel"
				}
				//Aguardando parte do lote
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='41'){
					classe = "indisponivel"
				}
				//Devolvido ao remetente
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='42'){
					classe = "indisponivel"
				}
				//Objeto apreendido p|| aut||idade competente
				if ( (tipo == 'BDE' || tipo == 'BDR') && status =='43'){
					classe = "indisponivel"
				}
				//Falta documento para liberação para retirada interna
				if ( (tipo == 'BDI' || tipo == 'BDR') && status =='44'){
					classe = "indisponivel"
				}
				//Resíduo de Mesa
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='45'){
					classe = "indisponivel"
				}
				//Entrega não efetuada
				if ( (tipo == 'BDE' || tipo == 'BDR') && status =='46'){
					classe = "vermelho"
				}
				//Erro de lançamento
				if ( (tipo == 'BDE' || tipo == 'BDR') && status =='47'){
					classe = "indisponivel"
				}
				//Posta Restante não Aut||izada
				if ( (tipo == 'BDI' || tipo == 'BDR') && status =='48'){
					classe = "indisponivel"
				}
				//Roubo a Carteiro
				if ( (tipo == 'BDE' || tipo == 'BDR') && status =='50'){
					classe = "indisponivel"
				}
				//Roubo a Veículo
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='51'){
					classe = "indisponivel"
				}
				//Roubo a Unidade
				if ( (tipo == 'BDI' || tipo == 'BDR') && status =='52'){
					classe = "indisponivel"
				}
				//Extraviado
				if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='69'){
					classe = "indisponivel"
				}
				
				//Conferido
				if ( (tipo == 'CAR' || tipo == 'CD' || tipo == 'CMR' || tipo == 'CO' || tipo == 'CUN') && status =='01'){
					classe = "amarelo"
				}
				
						
				//Encaminhado
				if ( (tipo == 'DO') && status =='01'){
					classe = "laranja"
				}
				
				//Encaminhado
				if ( (tipo == 'EST') && status =='01'){
					classe = "indisponivel"
				}
				
				//Devolvido a pedido do Cliente
				if ( (tipo == 'FC') && status =='01'){
					classe = "indisponivel"
				}
				//Com entrega agendada
				if ( (tipo == 'FC') && status =='02'){
					classe = "indisponivel"
				}
				//Mal encaminhado
				if ( (tipo == 'FC') && status =='03'){
					classe = "indisponivel"
				}
				//Mal endereçado
				if ( (tipo == 'FC') && status =='04'){
					classe = "indisponivel"
				}
				//Reintegrado
				if ( (tipo == 'FC') && status =='05'){
					classe = "indisponivel"
				}
				//Restrição Lançamento Externo
				if ( (tipo == 'FC') && status =='06'){
					classe = "indisponivel"
				}
				//Empresa sem Expediente
				if ( (tipo == 'FC') && status =='07'){
					classe = "indisponivel"
				}
				//Indenizado
				if ( (tipo == 'IDC') && status =='01'){
					classe = "indisponivel"
				}
				//Irregularidade na expedição
				if ( (tipo == 'IE') && status =='01'){
					classe = "indisponivel"
				}
				//Passagem interna
				if ( (tipo == 'IT') && status =='01'){
					classe = "indisponivel"
				}
				//Aguardando retirada
				if ( (tipo == 'LDI') && status =='01'){
					classe = "indisponivel"
				}
				//Caixa Postal
				if ( (tipo == 'LDI') && status =='02'){
					classe = "indisponivel"
				}
				//Fiscalização
				if ( (tipo == 'LDI') && status =='08'){
					classe = "indisponivel"
				}
				//Saiu para entrega
				if ( (tipo == 'OEC') && status =='01'){
					classe = "azul"
				}
				//Conferido
				if ( (tipo == 'PAR') && (status =='15' || status =='16' ||  status =='17' ||  status =='18')){
					classe = "amarelo"
				}
				//Partiu em meio de transp||te
				if ( (tipo == 'PMT') && status =='01'){
					classe = "indisponivel"
				}
				//Postado
				if ( (tipo == 'PO') && (status =='00' || status =='01') ){
					classe = "branco"
				}
				//Postado - dh
				if ( (tipo == 'PO') && status =='09'){
					classe = "branco"
				}
				//Encaminhado
				if ( (tipo == 'RO') && status =='01'){
					classe = "laranja"
				}
				//Encaminhado(est||nado)
				if ( (tipo == 'RO') && status =='99'){
					classe = "laranja"
				}
				//Em transito
				if ( (tipo == 'TR') && status =='01'){
					classe = "laranja"
				}
				
			classe
	}
	
	def retornaDescricaoStatus(status , tipo) {
		
			def descricao = "Indisponível"
			 
			//Entregue
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='01'){
				descricao = "Entrega Efetuada"
			}
			//Destinatário Ausente
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='02'){
				descricao = "Destinatário Ausente"
			}
			//Não procurado
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='03'){
				descricao = "Não procurado"
			}
			//Recusado
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='04'){
				descricao = "Recusado"
			}
			//Em devolução
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='05'){
				descricao = "Em devolução"
			}
			//Destinatário desconhecido no endereço
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='06'){
				descricao = "Destinatário desconhecido no endereço"
			}
			//Endereço insuficiente para entrega
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='07'){
				descricao = "Endereço insuficiente para entrega"
			}
			//Não existe o número indicado
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='08'){
				descricao = "Não existe o número indicado"
			}
			//Extraviado
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='09'){
				descricao = "Extraviado"
			}
			//Destinatário mudou-se
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='10'){
				descricao = "Destinatário mudou-se"
			}
			//Outros
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='11'){
				descricao = "Outros"
			}
			//Refugado
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='12'){
				descricao = "Refugado"
			}
			//Endereço inc||reto
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='19'){
				descricao = "Endereço incorreto"
			}
			//Destinatário ausente
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='20'){
				descricao = "Destinatário ausente"
			}
			//Destinatário ausente
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='21'){
				descricao = "Destinatário ausente"
			}
			//Reintegrado
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='22'){
				descricao = "Reintegrado"
			}
			//Distribuído ao remetente
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='23'){
				descricao = "Distribuído ao remetente"
			}
			//Disponível em Caixa Postal
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='24'){
				descricao = "Disponível em Caixa Postal"
			}
			//Empresa sem Expediente
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='25'){
				descricao = "Empresa sem Expediente"
			}
			//Não procurado
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='26'){
				descricao = "Não procurado"
			}
			//Pedido não solicitado
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='27'){
				descricao = "Pedido não solicitado"
			}
			//Mercad||ia avariada
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='28'){
				descricao = "Mercad||ia avariada"
			}
			//Extraviado
			if ( (tipo == 'BDE' || tipo == 'BDR') && status =='31'){
				descricao = "Extraviado"
			}
			//Entrega programada
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='32'){
				descricao = "Entrega programada"
			}
			//Documentação não f||necida pelo destinatário
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='33'){
				descricao = "Documentação não f||necida pelo destinatário"
			}
			//Logradouro com numeração irregular - Em Pesquisa
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='34'){
				descricao = "Logradouro com numeração irregular - Em Pesquisa"
			}
			//Log. Reversa Simultânea
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='35'){
				descricao = "Log. Reversa Simultânea"
			}
			//Log. Reversa Simultânea
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='36'){
				descricao = "Log. Reversa Simultânea"
			}
			//Devolvido ao Remetente
			if ( (tipo == 'BDI') && status =='40'){
				descricao = "Devolvido ao Remetente"
			}
			//Aguardando parte do lote
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='41'){
				descricao = "Aguardando parte do lote"
			}
			//Devolvido ao remetente
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='42'){
				descricao = "Devolvido ao remetente"
			}
			//Objeto apreendido p|| aut||idade competente
			if ( (tipo == 'BDE' || tipo == 'BDR') && status =='43'){
				descricao = "Objeto apreendido por autoridade competente"
			}
			//Falta documento para liberação para retirada interna
			if ( (tipo == 'BDI' || tipo == 'BDR') && status =='44'){
				descricao = "Falta documento para liberação para retirada interna"
			}
			//Resíduo de Mesa
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='45'){
				descricao = "Resíduo de Mesa"
			}
			//Entrega não efetuada
			if ( (tipo == 'BDE' || tipo == 'BDR') && status =='46'){
				descricao = "Entrega não efetuada p|| motivos operacionais"
			}
			//Erro de lançamento
			if ( (tipo == 'BDE' || tipo == 'BDR') && status =='47'){
				descricao = "Erro de lançamento"
			}
			//Posta Restante não Aut||izada
			if ( (tipo == 'BDI' || tipo == 'BDR') && status =='48'){
				descricao = "Posta Restante não Aut||izada"
			}
			//Roubo a Carteiro
			if ( (tipo == 'BDE' || tipo == 'BDR') && status =='50'){
				descricao = "Roubo a Carteiro"
			}
			//Roubo a Veículo
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='51'){
				descricao = "Roubo a Veículo"
			}
			//Roubo a Unidade
			if ( (tipo == 'BDI' || tipo == 'BDR') && status =='52'){
				descricao = "Roubo a Unidade"
			}
			//Extraviado
			if ( (tipo == 'BDE' || tipo == 'BDI' || tipo == 'BDR') && status =='69'){
				descricao = "Extraviado"
			}
			 
			//Conferido
			if ( (tipo == 'CAR' || tipo == 'CD' || tipo == 'CMR' || tipo == 'CO' || tipo == 'CUN') && status =='01'){
				descricao = "Conferido"
			}
			 
			
			//Encaminhado
			if ( (tipo == 'DO') && status =='01'){
				descricao = "Encaminhado"
			}
			 
			//Encaminhado
			if ( (tipo == 'EST') && status =='01'){
				descricao = "Encaminhado"
			}
			 
			//Devolvido a pedido do Cliente
			if ( (tipo == 'FC') && status =='01'){
				descricao = "Devolvido a pedido do Cliente"
			}
			//Com entrega agendada
			if ( (tipo == 'FC') && status =='02'){
				descricao = "Com entrega agendada"
			}
			//Mal encaminhado
			if ( (tipo == 'FC') && status =='03'){
				descricao = "Mal encaminhado"
			}
			//Mal endereçado
			if ( (tipo == 'FC') && status =='04'){
				descricao = "Mal endereçado"
			}
			//Reintegrado
			if ( (tipo == 'FC') && status =='05'){
				descricao = "Reintegrado"
			}
			//Restrição Lançamento Externo
			if ( (tipo == 'FC') && status =='06'){
				descricao = "Restrição Lançamento Externo"
			}
			//Empresa sem Expediente
			if ( (tipo == 'FC') && status =='07'){
				descricao = "Empresa sem Expediente"
			}
			//Indenizado
			if ( (tipo == 'IDC') && status =='01'){
				descricao = "Indenizado"
			}
			//Irregularidade na expedição
			if ( (tipo == 'IE') && status =='01'){
				descricao = "Irregularidade na expedição"
			}
			//Passagem interna
			if ( (tipo == 'IT') && status =='01'){
				descricao = "Passagem interna"
			}
			//Aguardando retirada
			if ( (tipo == 'LDI') && status =='01'){
				descricao = "Aguardando retirada"
			}
			//Caixa Postal
			if ( (tipo == 'LDI') && status =='02'){
				descricao = "Caixa Postal"
			}
			//Fiscalização
			if ( (tipo == 'LDI') && status =='08'){
				descricao = "Fiscalização"
			}
			//Saiu para entrega
			if ( (tipo == 'OEC') && status =='01'){
				descricao = "Saiu para entrega ao destinatário"
			}
			//Conferido
			if ( (tipo == 'PAR') && (status =='15' || status =='16' ||  status =='17' ||  status =='18')){
				descricao = "Conferido"
			}
			//Partiu em meio de transp||te
			if ( (tipo == 'PMT') && status =='01'){
				descricao = "Partiu em meio de transp||te"
			}
			//Postado
			if ( (tipo == 'PO') && (status =='00' || status =='01') ){
				descricao = "Postado"
			}
			//Postado - dh
			if ( (tipo == 'PO') && status =='09'){
				descricao = "Postado"
			}
			//Encaminhado
			if ( (tipo == 'RO') && status =='01'){
				descricao = "Encaminhado"
			}
			//Encaminhado(estornado)
			if ( (tipo == 'RO') && status =='99'){
				descricao = "Encaminhado"
			}
			//Em transito
			if ( (tipo == 'TR') && status =='01'){
				descricao = "Encaminhado"
			}
			 
			descricao
		}
	
	def retornaDestino(tipo, status, local, bairro , cidade, uf) {
		
		def destinofinal=''
		
		//Objeto Internacional - Recebido
		   if ( (tipo == 'PAR') && (status =='15' || status =='16' ||  status =='17' ||  status =='18')){
			destinofinal = destinofinal +  'Recebido/Brasil'
		   }
		   if((tipo == 'BDE' || tipo == 'BDR') && status =='46'){
			   destinofinal = destinofinal + 'Entrega prevista para o próximo dia útil '
		   }else{
					 
				   if(
					      (local!=null && local != '') ||
						  (cidade!=null && cidade != '') ||
						  (uf!=null && uf != '' ) ||
						  (bairro!=null && bairro!= '')
					 ){
						destinofinal = destinofinal + 'Em trânsito para '
					}
					
		}
				
		if(local!=null && local!= ''){
			destinofinal=destinofinal + local
		}
		if(cidade!=null && cidade != ''){
				destinofinal= destinofinal + ' - ' + cidade
		}
		if(uf!=null && uf!= '' ){
				destinofinal= destinofinal + '/' + uf
		}
		if(bairro!=null && bairro!= '' ){
				destinofinal= destinofinal + ' - ' + bairro
		}
		
		destinofinal
	}
	
	def retornaLocal(local , cidade , uf) {
		
			def localfinal=''
			
			localfinal = localfinal + local
			
			if(cidade!=null && cidade != ''){
				localfinal= localfinal + ' - ' + cidade
			}
			
			if(uf!=null && uf != ''){
				localfinal = localfinal +  '/' + uf 
			}
			
		localfinal
		}
}
