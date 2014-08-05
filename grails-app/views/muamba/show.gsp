
<%@ page import="rastreadordepacotes.Muamba" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'muamba.label', default: 'Muamba')}" />
		<title><g:message code="list.muamba.label" /></title>
	</head>
	<body>
		<a href="#list-muamba" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>

		<div id="list-muamba" class="content scaffold-list" role="main">
			<h1><g:message code="list.muamba.label"/> - 
			 	<g:each in="${muambaInstanceList}" status="i" var="muambaInstance">
			 			<g:set var="muambaInstance" value="${muambaInstance}" />
			 			<g:set var="id" value="${muambaInstance?.id}" />
						${muambaInstance?.codigo} - ${muambaInstance?.descricao}  
						- Pais Origem: <asset:image src="flags/24/${muambaInstance?.pais.imagem}" title="${fieldValue(bean: muambaInstance?.pais, field: "descricao")}"/>
										
						<a class="correios" title="Visualizar no site dos correios" target="_blank" href="http://websro.correios.com.br/sro_bin/txect01$.QueryList?P_LINGUA=001&P_TIPO=001&P_COD_UNI=${fieldValue(bean: muambaInstance, field: 'codigo')}">
						<asset:image src="icon.jpg"/></a>
				</g:each>
				
			</h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
						<th>Data Último Evento</th>
						<th>Último Local</th>
						<th>Último Status</th>
						<th>Descrição</th>
						
					</tr>
					
				</thead>
				<tbody>
				<g:each in="${muambaInstanceList}" status="i" var="muambaInstance">
							<g:each in="${muambaInstance?.historico}" status="j" var="historicoInstance">
								<tr class="${(j % 2) == 0 ? 'even' : 'odd'}">
								 		<td><g:formatDate date="${historicoInstance?.dataevento}" format="dd/MM/yyyy HH:mm"/></td>
									    <td class="esquerda">${historicoInstance?.local}
									    	<g:if test="${historicoInstance?.localdestino}">
											     <hr>${historicoInstance?.localdestino}
											</g:if>
									    </td>
									    <td>
									    	<asset:image src="status/${historicoInstance?.classe}.png" title="${historicoInstance?.descricao}"/>
									    <td>${historicoInstance?.descricao}</td>
								</tr>
							</g:each>
				</g:each>
				</tbody>
			</table>
			
			<g:form url="[resource:muambaInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" id="${id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
