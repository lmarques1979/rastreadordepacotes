<%@ page import="rastreadordepacotes.Muamba" %>

<div class="fieldcontain ${hasErrors(bean: muambaInstance, field: 'codigo', 'error')} required">
	<label for="codigo">
		<g:message code="muamba.codigo.label" default="Codigo" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="codigo" size="14" maxlength="13" required="" value="${muambaInstance?.codigo}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: muambaInstance, field: 'descricao', 'error')} required">
	<label for="descricao">
		<g:message code="muamba.descricao.label" default="Descricao" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="descricao" size="40" maxlength="50" required="" value="${muambaInstance?.descricao}"/>

</div>



