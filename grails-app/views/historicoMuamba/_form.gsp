<%@ page import="rastreadordepacotes.HistoricoMuamba" %>



<div class="fieldcontain ${hasErrors(bean: historicoMuambaInstance, field: 'numero', 'error')} required">
	<label for="numero">
		<g:message code="historicoMuamba.numero.label" default="Numero" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="numero" maxlength="13" required="" value="${historicoMuambaInstance?.numero}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: historicoMuambaInstance, field: 'tipo', 'error')} required">
	<label for="tipo">
		<g:message code="historicoMuamba.tipo.label" default="Tipo" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="tipo" required="" value="${historicoMuambaInstance?.tipo}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: historicoMuambaInstance, field: 'status', 'error')} required">
	<label for="status">
		<g:message code="historicoMuamba.status.label" default="Status" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="status" required="" value="${historicoMuambaInstance?.status}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: historicoMuambaInstance, field: 'data', 'error')} ">
	<label for="data">
		<g:message code="historicoMuamba.data.label" default="Data" />
		
	</label>
	<g:datePicker name="data" precision="day"  value="${historicoMuambaInstance?.data}" default="none" noSelection="['': '']" />

</div>

<div class="fieldcontain ${hasErrors(bean: historicoMuambaInstance, field: 'hora', 'error')} ">
	<label for="hora">
		<g:message code="historicoMuamba.hora.label" default="Hora" />
		
	</label>
	<g:datePicker name="hora" precision="minute"  value="${historicoMuambaInstance?.hora}" default="none" noSelection="['': '']" />

</div>

<div class="fieldcontain ${hasErrors(bean: historicoMuambaInstance, field: 'descricao', 'error')} ">
	<label for="descricao">
		<g:message code="historicoMuamba.descricao.label" default="Descricao" />
		
	</label>
	<g:textField name="descricao" value="${historicoMuambaInstance?.descricao}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: historicoMuambaInstance, field: 'local', 'error')} ">
	<label for="local">
		<g:message code="historicoMuamba.local.label" default="Local" />
		
	</label>
	<g:textField name="local" value="${historicoMuambaInstance?.local}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: historicoMuambaInstance, field: 'codigo', 'error')} ">
	<label for="codigo">
		<g:message code="historicoMuamba.codigo.label" default="Codigo" />
		
	</label>
	<g:textField name="codigo" value="${historicoMuambaInstance?.codigo}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: historicoMuambaInstance, field: 'cidade', 'error')} ">
	<label for="cidade">
		<g:message code="historicoMuamba.cidade.label" default="Cidade" />
		
	</label>
	<g:textField name="cidade" value="${historicoMuambaInstance?.cidade}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: historicoMuambaInstance, field: 'uf', 'error')} ">
	<label for="uf">
		<g:message code="historicoMuamba.uf.label" default="Uf" />
		
	</label>
	<g:textField name="uf" value="${historicoMuambaInstance?.uf}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: historicoMuambaInstance, field: 'destinolocal', 'error')} ">
	<label for="destinolocal">
		<g:message code="historicoMuamba.destinolocal.label" default="Destinolocal" />
		
	</label>
	<g:textField name="destinolocal" value="${historicoMuambaInstance?.destinolocal}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: historicoMuambaInstance, field: 'destinocidade', 'error')} ">
	<label for="destinocidade">
		<g:message code="historicoMuamba.destinocidade.label" default="Destinocidade" />
		
	</label>
	<g:textField name="destinocidade" value="${historicoMuambaInstance?.destinocidade}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: historicoMuambaInstance, field: 'destinobairro', 'error')} ">
	<label for="destinobairro">
		<g:message code="historicoMuamba.destinobairro.label" default="Destinobairro" />
		
	</label>
	<g:textField name="destinobairro" value="${historicoMuambaInstance?.destinobairro}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: historicoMuambaInstance, field: 'destinouf', 'error')} ">
	<label for="destinouf">
		<g:message code="historicoMuamba.destinouf.label" default="Destinouf" />
		
	</label>
	<g:textField name="destinouf" value="${historicoMuambaInstance?.destinouf}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: historicoMuambaInstance, field: 'destinocodigo', 'error')} ">
	<label for="destinocodigo">
		<g:message code="historicoMuamba.destinocodigo.label" default="Destinocodigo" />
		
	</label>
	<g:textField name="destinocodigo" value="${historicoMuambaInstance?.destinocodigo}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: historicoMuambaInstance, field: 'muamba', 'error')} required">
	<label for="muamba">
		<g:message code="historicoMuamba.muamba.label" default="Muamba" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="muamba" name="muamba.id" from="${rastreadordepacotes.Muamba.list()}" optionKey="id" required="" value="${historicoMuambaInstance?.muamba?.id}" class="many-to-one"/>

</div>

