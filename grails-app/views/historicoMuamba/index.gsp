
<%@ page import="rastreadordepacotes.HistoricoMuamba" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'historicoMuamba.label', default: 'HistoricoMuamba')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-historicoMuamba" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-historicoMuamba" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="numero" title="${message(code: 'historicoMuamba.numero.label', default: 'Numero')}" />
					
						<g:sortableColumn property="tipo" title="${message(code: 'historicoMuamba.tipo.label', default: 'Tipo')}" />
					
						<g:sortableColumn property="status" title="${message(code: 'historicoMuamba.status.label', default: 'Status')}" />
					
						<g:sortableColumn property="data" title="${message(code: 'historicoMuamba.data.label', default: 'Data')}" />
					
						<g:sortableColumn property="hora" title="${message(code: 'historicoMuamba.hora.label', default: 'Hora')}" />
					
						<g:sortableColumn property="descricao" title="${message(code: 'historicoMuamba.descricao.label', default: 'Descricao')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${historicoMuambaInstanceList}" status="i" var="historicoMuambaInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${historicoMuambaInstance.id}">${fieldValue(bean: historicoMuambaInstance, field: "numero")}</g:link></td>
					
						<td>${fieldValue(bean: historicoMuambaInstance, field: "tipo")}</td>
					
						<td>${fieldValue(bean: historicoMuambaInstance, field: "status")}</td>
					
						<td><g:formatDate date="${historicoMuambaInstance.data}" /></td>
					
						<td><g:formatDate date="${historicoMuambaInstance.hora}" /></td>
					
						<td>${fieldValue(bean: historicoMuambaInstance, field: "descricao")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${historicoMuambaInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
