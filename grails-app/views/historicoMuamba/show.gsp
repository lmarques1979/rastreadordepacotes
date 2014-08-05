
<%@ page import="rastreadordepacotes.HistoricoMuamba" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'historicoMuamba.label', default: 'HistoricoMuamba')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-historicoMuamba" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-historicoMuamba" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list historicoMuamba">
			
				<g:if test="${historicoMuambaInstance?.numero}">
				<li class="fieldcontain">
					<span id="numero-label" class="property-label"><g:message code="historicoMuamba.numero.label" default="Numero" /></span>
					
						<span class="property-value" aria-labelledby="numero-label"><g:fieldValue bean="${historicoMuambaInstance}" field="numero"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${historicoMuambaInstance?.tipo}">
				<li class="fieldcontain">
					<span id="tipo-label" class="property-label"><g:message code="historicoMuamba.tipo.label" default="Tipo" /></span>
					
						<span class="property-value" aria-labelledby="tipo-label"><g:fieldValue bean="${historicoMuambaInstance}" field="tipo"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${historicoMuambaInstance?.status}">
				<li class="fieldcontain">
					<span id="status-label" class="property-label"><g:message code="historicoMuamba.status.label" default="Status" /></span>
					
						<span class="property-value" aria-labelledby="status-label"><g:fieldValue bean="${historicoMuambaInstance}" field="status"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${historicoMuambaInstance?.data}">
				<li class="fieldcontain">
					<span id="data-label" class="property-label"><g:message code="historicoMuamba.data.label" default="Data" /></span>
					
						<span class="property-value" aria-labelledby="data-label"><g:formatDate date="${historicoMuambaInstance?.data}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${historicoMuambaInstance?.hora}">
				<li class="fieldcontain">
					<span id="hora-label" class="property-label"><g:message code="historicoMuamba.hora.label" default="Hora" /></span>
					
						<span class="property-value" aria-labelledby="hora-label"><g:formatDate date="${historicoMuambaInstance?.hora}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${historicoMuambaInstance?.descricao}">
				<li class="fieldcontain">
					<span id="descricao-label" class="property-label"><g:message code="historicoMuamba.descricao.label" default="Descricao" /></span>
					
						<span class="property-value" aria-labelledby="descricao-label"><g:fieldValue bean="${historicoMuambaInstance}" field="descricao"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${historicoMuambaInstance?.local}">
				<li class="fieldcontain">
					<span id="local-label" class="property-label"><g:message code="historicoMuamba.local.label" default="Local" /></span>
					
						<span class="property-value" aria-labelledby="local-label"><g:fieldValue bean="${historicoMuambaInstance}" field="local"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${historicoMuambaInstance?.codigo}">
				<li class="fieldcontain">
					<span id="codigo-label" class="property-label"><g:message code="historicoMuamba.codigo.label" default="Codigo" /></span>
					
						<span class="property-value" aria-labelledby="codigo-label"><g:fieldValue bean="${historicoMuambaInstance}" field="codigo"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${historicoMuambaInstance?.cidade}">
				<li class="fieldcontain">
					<span id="cidade-label" class="property-label"><g:message code="historicoMuamba.cidade.label" default="Cidade" /></span>
					
						<span class="property-value" aria-labelledby="cidade-label"><g:fieldValue bean="${historicoMuambaInstance}" field="cidade"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${historicoMuambaInstance?.uf}">
				<li class="fieldcontain">
					<span id="uf-label" class="property-label"><g:message code="historicoMuamba.uf.label" default="Uf" /></span>
					
						<span class="property-value" aria-labelledby="uf-label"><g:fieldValue bean="${historicoMuambaInstance}" field="uf"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${historicoMuambaInstance?.destinolocal}">
				<li class="fieldcontain">
					<span id="destinolocal-label" class="property-label"><g:message code="historicoMuamba.destinolocal.label" default="Destinolocal" /></span>
					
						<span class="property-value" aria-labelledby="destinolocal-label"><g:fieldValue bean="${historicoMuambaInstance}" field="destinolocal"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${historicoMuambaInstance?.destinocidade}">
				<li class="fieldcontain">
					<span id="destinocidade-label" class="property-label"><g:message code="historicoMuamba.destinocidade.label" default="Destinocidade" /></span>
					
						<span class="property-value" aria-labelledby="destinocidade-label"><g:fieldValue bean="${historicoMuambaInstance}" field="destinocidade"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${historicoMuambaInstance?.destinobairro}">
				<li class="fieldcontain">
					<span id="destinobairro-label" class="property-label"><g:message code="historicoMuamba.destinobairro.label" default="Destinobairro" /></span>
					
						<span class="property-value" aria-labelledby="destinobairro-label"><g:fieldValue bean="${historicoMuambaInstance}" field="destinobairro"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${historicoMuambaInstance?.destinouf}">
				<li class="fieldcontain">
					<span id="destinouf-label" class="property-label"><g:message code="historicoMuamba.destinouf.label" default="Destinouf" /></span>
					
						<span class="property-value" aria-labelledby="destinouf-label"><g:fieldValue bean="${historicoMuambaInstance}" field="destinouf"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${historicoMuambaInstance?.destinocodigo}">
				<li class="fieldcontain">
					<span id="destinocodigo-label" class="property-label"><g:message code="historicoMuamba.destinocodigo.label" default="Destinocodigo" /></span>
					
						<span class="property-value" aria-labelledby="destinocodigo-label"><g:fieldValue bean="${historicoMuambaInstance}" field="destinocodigo"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${historicoMuambaInstance?.muamba}">
				<li class="fieldcontain">
					<span id="muamba-label" class="property-label"><g:message code="historicoMuamba.muamba.label" default="Muamba" /></span>
					
						<span class="property-value" aria-labelledby="muamba-label"><g:link controller="muamba" action="show" id="${historicoMuambaInstance?.muamba?.id}">${historicoMuambaInstance?.muamba?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:historicoMuambaInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${historicoMuambaInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
