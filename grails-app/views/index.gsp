<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Rastreador de Pacotes</title>
		
	</head>
	<body>
		<a href="#page-body" class="skip"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		
		 <div id="page-body" role="main">
				
				<h3 class="titulo">
					Para que serve o rastreador de pacotes?
				</h3>
				
				<ul class="home">
					<li class="home">Receba por e-mail as notificações quando sua encomenda mudar de status no site dos correios.</li>
					<li class="home">Receba por SMS as notificações quando sua encomenda mudar de status no site dos correios.</li>
					<li class="home">Acompanhe em tempo real o status de todas as suas encomendas no menu Visualizar Pacotes.</li>
					<li class="home">Faça consultas dos seus pacotes no site dos correios diretamente caso prefira.</li>
					<li class="home">Filtre seus pacotes pelo status ENTREGUE, PENDENTE ou TODOS.</li>
					<li class="home">Centralize todas as suas encomendas em um único lugar.</li>
					<li class="home">Cadastre pacotes ilimitados.</li>
					<li class="home">Informações recebidas diretamente do webservice dos Correios.</li>
					<li class="home">Acompanhe o status segundo legenda abaixo:<br>
						<div class="visualiza"> 
							
										<table cellspacing='0' class="home"> <!-- cellspacing='0' is important, must stay -->
							
											<!-- Table Header -->
											<thead>
												<tr>
													<th colspan="2">Legenda Status Pedidos</th>
												</tr>
												
											</thead>
											<!-- Table Header -->
										
											<!-- Table Body -->
											<tbody>
							
												<tr>			
													<td>
														<asset:image src="status/verde.png" title="Entregue"/>
													</td>
													<td>
															Entregue
													</td>
												
												</tr><!-- Table Row -->
												
												<tr>			
													<td>
														<asset:image src="status/azul.png" title="Saiu para entrega ao destinatário"/>
													</td>
													<td>
															Saiu para entrega ao destinatário
													</td>
												
												</tr><!-- Table Row -->
												
												<tr>			
													<td>
														<asset:image src="status/amarelo.png" title="Conferido"/>
													</td>
													<td>
															Conferido (Encomendas Internacionais)
													</td>
												
												</tr><!-- Table Row -->
												
												<tr>			
													<td>
														<asset:image src="status/laranja.png" title="Encaminhado"/>
													</td>
													<td>
															Encaminhado
													</td>
												
												</tr><!-- Table Row -->
												
												<tr>			
													<td>
														<asset:image src="status/branco.png" title="Postado"/>
													</td>
													<td>
															Postado
													</td>
												
												</tr><!-- Table Row -->
												
												<tr>			
													<td>
														<asset:image src="status/indisponivel.png" title="Indisponível"/>
													</td>
													<td>
															Indisponível
													</td>
												
												</tr><!-- Table Row -->
												
												
							    
							   				</tbody>
											<!-- Table Body -->
						 			</table>   
			 
						 </div>
						
					</li>
					<g:if test="${sec.loggedInUserInfo(field:'username')==null || sec.loggedInUserInfo(field:'username')==''}">
						<li class="home">
							<g:link class="create" controller="Usuario" action="create">Faça logo o seu cadastro aqui...</g:link>
						</li>
					</g:if>
				</ul>
		</div>
	</body>
</html>
