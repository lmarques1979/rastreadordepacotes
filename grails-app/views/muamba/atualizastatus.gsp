<%@ page import="rastreadordepacotes.Muamba" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<title><g:message code="atualiza.muamba.label" /></title>
	</head>
	<body>
		
		<div id="list-muamba" class="content scaffold-list" role="main">
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			
		</div>
		
	</body>
</html>
