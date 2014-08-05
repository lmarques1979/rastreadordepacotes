<%@ page import="rastreadordepacotes.Muamba" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'muamba.label', default: 'Muamba')}" />
		<title><g:message code="list.muamba.label" /></title>
		<asset:stylesheet src="datepicker.css"/>
	</head>
	<body>

		<a href="#list-muamba" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		
		<div id="list-muamba" class="content scaffold-list" role="main">
			<h1><g:message code="list.muamba.label"/> - Total: ${muambaInstanceCount}</h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			
			<table>
			<g:form url="[resource:muambaInstance, action:'filtro']" >
			<thead>
					<tr>
						<th colspan="7">Filtro</th>
					</tr>
					<tr>
						<th>Status</th>
						<th>Código Rastreio</th>
						<th>País Origem</th>
						<th>Data Inicial</th>
						<th>Data Final</th>
						<th colspan="2"></th>
					
					</tr>
					
				</thead>
				<tbody>
					<tr>
						<td><g:select value="${params.status}" name="status" from="${['Pendente', 'Entregue', 'Todos']}" keys="${['1','2','3']}"/></td>
						<td><g:textField name="codigo" size="14" maxlength="13" value="${params.codigo}"/></td>
						<td><g:select value="${params.pais}" noSelection="${['-1':'Selecionar País...']}" name="pais" from="${rastreadordepacotes.Pais.list()}" optionKey="id" optionValue="descricao"/></td>
						<td><g:textField value="${params.datainicial}" class="w8em format-d-m-y" name="datainicial" size="12" maxlength="10"/></td>
						<td><g:textField value="${params.datafinal}" class="w8em format-d-m-y" name="datafinal" size="12" maxlength="10"/></td>
						<td colspan="2"><g:link controller="muamba" action="index"><asset:image src="limpar.png" id="limparfiltro" title="Limpar Filtro"/></g:link><g:submitButton name="create" class="filtro" value="Filtrar" /></td>
	
					</tr>
					
				</tbody>
			</g:form>
			</table>
			<table>
			<thead>
					<tr>
					
						<th>Código</th>
						<th>País</th>
						<th>Descrição</th>
						<th>Data Último Evento</th>
						<th>Último Local</th>
						<th></th>
						<th>Último Status</th>

						
					</tr>
					
				</thead>
				<tbody>
				<g:each in="${muambaInstanceList}" status="i" var="muambaInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${muambaInstance.id}">${fieldValue(bean: muambaInstance, field: "codigo")}</g:link></td>
					    <td><asset:image src="flags/24/${muambaInstance?.pais.imagem}" title="${fieldValue(bean: muambaInstance?.pais, field: "descricao")}"/></td>
					    <td>
					    	<g:if test="${muambaInstance?.descricao}">
							     ${muambaInstance?.descricao}
							</g:if>
					    	
					    </td>
					    <td>
					    	<g:if test="${muambaInstance?.historico[0]}">
						    	<g:if test="${muambaInstance?.historico[0].dataevento}">
						    		<g:formatDate format="dd/MM/yyyy HH:mm" date="${muambaInstance?.historico[0].dataevento}"/>
								</g:if>
							</g:if>
					    </td>
					    <td class="esquerda">
					    	<g:if test="${muambaInstance?.historico[0]}">
								<g:if test="${muambaInstance?.historico[0].local}">
						    		${muambaInstance?.historico[0].local}
								</g:if>
						    	<g:if test="${muambaInstance?.historico[0].localdestino}">
								     <hr>${muambaInstance?.historico[0].localdestino}
								</g:if>
							</g:if>
					    </td>
					    <td>
					    	<g:if test="${muambaInstance?.historico[0]}">
					    		<asset:image src="status/${muambaInstance?.historico[0].classe}.png" title="${muambaInstance?.historico[0].descricao}"/>
					       	</g:if> 
					    	<g:else>
					    		<asset:image src="status/indisponivel.png" title="Status Indísponível no momento"/>
							</g:else>
					    </td>
					    
					    <td>
					    	<g:if test="${muambaInstance?.historico[0]}">
						    	<g:if test="${muambaInstance?.historico[0].descricao}">
						    		${muambaInstance?.historico[0].descricao}
						    	</g:if>
						    </g:if>
						    <g:else>
							    Status Indísponível
							</g:else>
							
					    </td>
	
					
					</tr>
				</g:each>
				</tbody>
			</table>
			
			<div class="pagination">
				<g:paginate total="${muambaInstanceCount ?: 0}" params="${params}" />
			</div>
	
		</div>
	</body>
</html>
<asset:javascript src="datepicker.js"/>
