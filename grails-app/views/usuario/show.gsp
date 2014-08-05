<%@ page import="seguranca.Usuario" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'usuario.label', default: 'Usuario')}" />
		<title><g:message code="list.usuario.label"/></title>
	</head>
	<body>
		<a href="#show-usuario" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		
		<div id="show-usuario" class="content scaffold-show" role="main">
			<h1><g:message code="list.usuario.label"/></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list usuario">
			
				<g:if test="${usuarioInstance?.username}">
				<li class="fieldcontain">
					<span id="username-label" class="property-label"><g:message code="usuario.username.label" default="Username" /></span>
					
						<span class="property-value" aria-labelledby="username-label"><g:fieldValue bean="${usuarioInstance}" field="username"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${usuarioInstance?.email}">
				<li class="fieldcontain">
					<span id="email-label" class="property-label"><g:message code="usuario.email.label" default="Email" /></span>
					
						<span class="property-value" aria-labelledby="email-label"><g:fieldValue bean="${usuarioInstance}" field="email"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${usuarioInstance?.primeironome}">
				<li class="fieldcontain">
					<span id="primeironome-label" class="property-label"><g:message code="usuario.primeironome.label" default="Primeironome" /></span>
					
						<span class="property-value" aria-labelledby="primeironome-label"><g:fieldValue bean="${usuarioInstance}" field="primeironome"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${usuarioInstance?.sobrenome}">
				<li class="fieldcontain">
					<span id="sobrenome-label" class="property-label"><g:message code="usuario.sobrenome.label" default="Sobrenome" /></span>
					
						<span class="property-value" aria-labelledby="sobrenome-label"><g:fieldValue bean="${usuarioInstance}" field="sobrenome"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${usuarioInstance?.accountExpired}">
				<li class="fieldcontain">
					<span id="accountExpired-label" class="property-label"><g:message code="usuario.accountExpired.label" default="Account Expired" /></span>
					
						<span class="property-value" aria-labelledby="accountExpired-label"><g:formatBoolean boolean="${usuarioInstance?.accountExpired}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${usuarioInstance?.accountLocked}">
				<li class="fieldcontain">
					<span id="accountLocked-label" class="property-label"><g:message code="usuario.accountLocked.label" default="Account Locked" /></span>
					
						<span class="property-value" aria-labelledby="accountLocked-label"><g:formatBoolean boolean="${usuarioInstance?.accountLocked}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${usuarioInstance?.enabled}">
				<li class="fieldcontain">
					<span id="enabled-label" class="property-label"><g:message code="usuario.enabled.label" default="Enabled" /></span>
					
						<span class="property-value" aria-labelledby="enabled-label"><g:formatBoolean boolean="${usuarioInstance?.enabled}" /></span>
					
				</li>
				</g:if>
			
				<!--<g:if test="${usuarioInstance?.muambas}">
				<li class="fieldcontain">
					<span id="muambas-label" class="property-label"><g:message code="usuario.muambas.label" default="Muambas" /></span>
					
						<g:each in="${usuarioInstance.muambas}" var="m">
						<span class="property-value" aria-labelledby="muambas-label"><g:link controller="muamba" action="show" id="${m.id}">${m.descricao}</g:link></span>
						</g:each>
					
				</li>
				</g:if>-->
			
				<g:if test="${usuarioInstance?.passwordExpired}">
				<li class="fieldcontain">
					<span id="passwordExpired-label" class="property-label"><g:message code="usuario.passwordExpired.label" default="Password Expired" /></span>
					
						<span class="property-value" aria-labelledby="passwordExpired-label"><g:formatBoolean boolean="${usuarioInstance?.passwordExpired}" /></span>
					
				</li>
				</g:if>
				
				<g:if test="${usuarioInstance?.enviaremail}">
				<li class="fieldcontain">
					<span id="enviaremail-label" class="property-label"><g:message code="usuario.enviaremail.label" default="Enviar E-mail" /></span>
					
						<span class="property-value" aria-labelledby="enviaremail-label"><g:formatBoolean boolean="${usuarioInstance?.enviaremail}" /></span>
					
				</li>
				</g:if>
				
				<g:if test="${usuarioInstance?.enviarsms}">
				<li class="fieldcontain">
					<span id="enviarsms-label" class="property-label"><g:message code="usuario.enviarsms.label" default="Enviar SMS" /></span>
					
						<span class="property-value" aria-labelledby="enviarsms-label"><g:formatBoolean boolean="${usuarioInstance?.enviarsms}" /></span>
					
				</li>
				</g:if>
				
				<g:if test="${usuarioInstance?.itensporpagina}">
				<li class="fieldcontain">
					<span id="itensporpagina-label" class="property-label"><g:message code="usuario.itensporpagina.label" default="Itens por Página" /></span>
					
						<span class="property-value" aria-labelledby="itensporpagina-label"><g:fieldValue bean="${usuarioInstance}" field="itensporpagina"/></span>
					
				</li>
				</g:if>
				
			
			</ol>
			<g:form url="[resource:usuarioInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${usuarioInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
