<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title><g:layoutTitle default="Grails"/></title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="shortcut icon" href="${assetPath(src: 'favicon.ico')}" type="image/x-icon">
		<asset:stylesheet src="application.css"/>
		<asset:javascript src="application.js"/>
		<g:layoutHead/>
	</head>
	<body>


		<div id="grailsLogo" role="banner"><a href="${createLink(uri: '/')}"><asset:image src="logo/logo.png" alt="Rastreador de Pacotes"/></a></div>
		<div class="nav" role="navigation">
			<ul>
			    <li><!--<a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>-->
				<!-- Usuarios Logados -->
				<sec:ifLoggedIn>
					<g:if test="${sec.loggedInUserInfo(field: 'username') == 'admin'}">
						 <li><g:link class="list" controller="Usuario" action="index"><g:message code="usuario.label"/></g:link></li>
						 <li><g:link class="list" controller="Pais" action="index"><g:message code="pais.label"/></g:link></li>
						 <li><g:link class="atualiza" controller="Muamba" action="atualizastatus" name="atualiza"><g:message code="atualizastatus.label"/></g:link></li>
						 <li><g:link class="create" controller="Regra" action="index"><g:message code="regra.label"/></g:link></li>
					     <li><g:link class="create" controller="UsuarioRegra" action="index" ><g:message code="usuarioregra.label"/></g:link></li>
					</g:if>
					<!-- Usuarios não admin -->
					<g:if test="${sec.loggedInUserInfo(field: 'username') != 'admin'}">
						 <li><g:link class="create" controller="Muamba" action="create"><g:message code="adicionarpacote.label"/></g:link></li>
						 <li><g:link class="list" controller="Muamba" action="index"><g:message code="verpacote.label"/></g:link></li>
						 <li><g:link class="usuario" controller="Usuario" action="show" id="${sec.loggedInUserInfo(field:"id")}"><g:message code="dadosusuario.label"/></g:link></li>
						
					</g:if>
					
					<li><g:link class="list" controller="Muamba" action="dataultimaatualizacao"><g:message code="dataultimaatualizacao.label"/></g:link></li>
						 
					<li><g:link class="logout" controller="logout" action="index" name="sair"><g:message code="logout.usuario.label"/></g:link></li>
					
					<li>
						<g:if test="${sec.loggedInUserInfo(field: 'primeironome')}">
							    <g:set var="usuario" value="${sec.loggedInUserInfo(field: 'primeironome')}" />
						</g:if>
						<g:if test="${sec.loggedInUserInfo(field: 'sobrenome')}">
							    <g:set var="usuario" value="${usuario + ' ' + sec.loggedInUserInfo(field: 'sobrenome')}" />
						</g:if>
					<span class="logout">[${usuario}]</span></li>
				</sec:ifLoggedIn>
				
				<sec:ifNotLoggedIn>
					<li><g:link class="create" controller="Usuario" action="create"><g:message code="criar.usuario.label"/></g:link></li>
					<li><g:link class="list" controller="Muamba" action="dataultimaatualizacao"><g:message code="dataultimaatualizacao.label"/></g:link></li>
					<li><g:link class="login" controller="login" action="auth"><g:message code="login.usuario.label"/></g:link></li>
				</sec:ifNotLoggedIn>
				
				
			</ul>
		</div>
		<g:layoutBody/>
		<div class="footer" role="contentinfo"></div>
		<div id="spinner" class="spinner" style="display:none;"><g:message code="spinner.alt" default="Loading&hellip;"/></div>
	</body>
</html>
