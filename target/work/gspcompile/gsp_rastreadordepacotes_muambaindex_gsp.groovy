import rastreadordepacotes.Muamba
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_rastreadordepacotes_muambaindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/muamba/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'muamba.label', default: 'Muamba'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',9,['code':("list.muamba.label")],-1)
})
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(2)
invokeTag('stylesheet','asset',10,['src':("datepicker.css")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',11,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',15,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
invokeTag('message','g',17,['code':("list.muamba.label")],-1)
printHtmlPart(6)
expressionOut.print(muambaInstanceCount)
printHtmlPart(7)
if(true && (flash.message)) {
printHtmlPart(8)
expressionOut.print(flash.message)
printHtmlPart(9)
}
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(11)
invokeTag('select','g',41,['value':(params.status),'name':("status"),'from':(['Pendente', 'Entregue', 'Todos']),'keys':(['1','2','3'])],-1)
printHtmlPart(12)
invokeTag('textField','g',42,['name':("codigo"),'size':("14"),'maxlength':("13"),'value':(params.codigo)],-1)
printHtmlPart(12)
invokeTag('select','g',43,['value':(params.pais),'noSelection':(['-1':'Selecionar País...']),'name':("pais"),'from':(rastreadordepacotes.Pais.list()),'optionKey':("id"),'optionValue':("descricao")],-1)
printHtmlPart(12)
invokeTag('textField','g',44,['value':(params.datainicial),'class':("w8em format-d-m-y"),'name':("datainicial"),'size':("12"),'maxlength':("10")],-1)
printHtmlPart(12)
invokeTag('textField','g',45,['value':(params.datafinal),'class':("w8em format-d-m-y"),'name':("datafinal"),'size':("12"),'maxlength':("10")],-1)
printHtmlPart(13)
createTagBody(3, {->
invokeTag('image','asset',46,['src':("limpar.png"),'id':("limparfiltro"),'title':("Limpar Filtro")],-1)
})
invokeTag('link','g',46,['controller':("muamba"),'action':("index")],3)
invokeTag('submitButton','g',46,['name':("create"),'class':("filtro"),'value':("Filtrar")],-1)
printHtmlPart(14)
})
invokeTag('form','g',51,['url':([resource:muambaInstance, action:'filtro'])],2)
printHtmlPart(15)
invokeTag('sortableColumn','g',57,['property':("codigo"),'title':(message(code: 'muamba.codigo.label', default: 'Codigo Rastreio'))],-1)
printHtmlPart(16)
invokeTag('sortableColumn','g',58,['property':("pais"),'title':(message(code: 'muamba.pais.label', default: 'País'))],-1)
printHtmlPart(16)
invokeTag('sortableColumn','g',59,['property':("descricao"),'title':(message(code: 'muamba.descricao.label', default: 'Descricao'))],-1)
printHtmlPart(17)
loop:{
int i = 0
for( muambaInstance in (muambaInstanceList) ) {
printHtmlPart(18)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(19)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: muambaInstance, field: "codigo"))
})
invokeTag('link','g',73,['action':("show"),'id':(muambaInstance.id)],3)
printHtmlPart(20)
invokeTag('image','asset',74,['src':("flags/24/${muambaInstance?.pais.imagem}"),'title':(fieldValue(bean: muambaInstance?.pais, field: "descricao"))],-1)
printHtmlPart(21)
if(true && (muambaInstance?.descricao)) {
printHtmlPart(22)
expressionOut.print(muambaInstance?.descricao)
printHtmlPart(23)
}
printHtmlPart(24)
if(true && (muambaInstance?.historico[0])) {
printHtmlPart(25)
if(true && (muambaInstance?.historico[0].dataevento)) {
printHtmlPart(26)
invokeTag('formatDate','g',84,['format':("dd/MM/yyyy HH:mm"),'date':(muambaInstance?.historico[0].dataevento)],-1)
printHtmlPart(27)
}
printHtmlPart(23)
}
printHtmlPart(28)
if(true && (muambaInstance?.historico[0])) {
printHtmlPart(27)
if(true && (muambaInstance?.historico[0].local)) {
printHtmlPart(26)
expressionOut.print(muambaInstance?.historico[0].local)
printHtmlPart(27)
}
printHtmlPart(25)
if(true && (muambaInstance?.historico[0].localdestino)) {
printHtmlPart(29)
expressionOut.print(muambaInstance?.historico[0].localdestino)
printHtmlPart(27)
}
printHtmlPart(23)
}
printHtmlPart(30)
if(true && (muambaInstance?.historico[0])) {
printHtmlPart(31)
invokeTag('image','asset',100,['src':("status/${muambaInstance?.historico[0].classe}.png"),'title':(muambaInstance?.historico[0].descricao)],-1)
printHtmlPart(32)
}
else {
printHtmlPart(31)
invokeTag('image','asset',103,['src':("status/indisponivel.png"),'title':("Status Indísponível no momento")],-1)
printHtmlPart(23)
}
printHtmlPart(33)
if(true && (muambaInstance?.historico[0])) {
printHtmlPart(25)
if(true && (muambaInstance?.historico[0].descricao)) {
printHtmlPart(26)
expressionOut.print(muambaInstance?.historico[0].descricao)
printHtmlPart(25)
}
printHtmlPart(34)
}
else {
printHtmlPart(35)
}
printHtmlPart(36)
i++
}
}
printHtmlPart(37)
if(true && (muambaInstanceCount > 0)) {
printHtmlPart(38)
invokeTag('paginate','g',126,['total':(muambaInstanceCount ?: 0),'params':(params)],-1)
printHtmlPart(39)
}
printHtmlPart(40)
})
invokeTag('captureBody','sitemesh',130,[:],1)
printHtmlPart(41)
invokeTag('javascript','asset',132,['src':("datepicker.js")],-1)
printHtmlPart(0)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1412171577000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
