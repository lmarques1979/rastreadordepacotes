import rastreadordepacotes.Muamba
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_rastreadordepacotes_muambafiltro_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/muamba/filtro.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("entityName"),'value':(message(code: 'muamba.label', default: 'Muamba'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',7,['code':("list.muamba.label")],-1)
})
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(1)
invokeTag('stylesheet','asset',8,['src':("datepicker.css")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('message','g',12,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(4)
invokeTag('message','g',15,['code':("list.muamba.label")],-1)
printHtmlPart(5)
expressionOut.print(muambaInstanceCount)
printHtmlPart(6)
if(true && (flash.message)) {
printHtmlPart(7)
expressionOut.print(flash.message)
printHtmlPart(8)
}
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
invokeTag('select','g',39,['value':(params.status),'name':("status"),'from':(['Pendente', 'Entregue', 'Todos']),'keys':(['1','2','3'])],-1)
printHtmlPart(11)
invokeTag('textField','g',40,['name':("codigo"),'size':("14"),'maxlength':("13"),'value':(params.codigo)],-1)
printHtmlPart(11)
invokeTag('select','g',41,['value':(params.pais),'noSelection':(['-1':'Selecionar País...']),'name':("pais"),'from':(rastreadordepacotes.Pais.list()),'optionKey':("id"),'optionValue':("descricao")],-1)
printHtmlPart(11)
invokeTag('textField','g',42,['value':(params.datainicial),'class':("w8em format-d-m-y"),'name':("datainicial"),'size':("12"),'maxlength':("10")],-1)
printHtmlPart(11)
invokeTag('textField','g',43,['value':(params.datafinal),'class':("w8em format-d-m-y"),'name':("datafinal"),'size':("12"),'maxlength':("10")],-1)
printHtmlPart(12)
createTagBody(3, {->
invokeTag('image','asset',44,['src':("limpar.png"),'id':("limparfiltro"),'title':("Limpar Filtro")],-1)
})
invokeTag('link','g',44,['controller':("muamba"),'action':("index")],3)
invokeTag('submitButton','g',44,['name':("create"),'class':("filtro"),'value':("Filtrar")],-1)
printHtmlPart(13)
})
invokeTag('form','g',49,['url':([resource:muambaInstance, action:'filtro'])],2)
printHtmlPart(14)
loop:{
int i = 0
for( muambaInstance in (muambaInstanceList) ) {
printHtmlPart(15)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(16)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: muambaInstance, field: "codigo"))
})
invokeTag('link','g',71,['action':("show"),'id':(muambaInstance.id)],3)
printHtmlPart(17)
invokeTag('image','asset',72,['src':("flags/24/${muambaInstance?.pais.imagem}"),'title':(fieldValue(bean: muambaInstance?.pais, field: "descricao"))],-1)
printHtmlPart(18)
if(true && (muambaInstance?.descricao)) {
printHtmlPart(19)
expressionOut.print(muambaInstance?.descricao)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (muambaInstance?.historico[0])) {
printHtmlPart(22)
if(true && (muambaInstance?.historico[0].dataevento)) {
printHtmlPart(23)
invokeTag('formatDate','g',82,['format':("dd/MM/yyyy HH:mm"),'date':(muambaInstance?.historico[0].dataevento)],-1)
printHtmlPart(24)
}
printHtmlPart(20)
}
printHtmlPart(25)
if(true && (muambaInstance?.historico[0])) {
printHtmlPart(24)
if(true && (muambaInstance?.historico[0].local)) {
printHtmlPart(23)
expressionOut.print(muambaInstance?.historico[0].local)
printHtmlPart(24)
}
printHtmlPart(22)
if(true && (muambaInstance?.historico[0].localdestino)) {
printHtmlPart(26)
expressionOut.print(muambaInstance?.historico[0].localdestino)
printHtmlPart(24)
}
printHtmlPart(20)
}
printHtmlPart(27)
if(true && (muambaInstance?.historico[0])) {
printHtmlPart(28)
invokeTag('image','asset',98,['src':("status/${muambaInstance?.historico[0].classe}.png"),'title':(muambaInstance?.historico[0].descricao)],-1)
printHtmlPart(29)
}
else {
printHtmlPart(28)
invokeTag('image','asset',101,['src':("status/indisponivel.png"),'title':("Status Indísponível no momento")],-1)
printHtmlPart(20)
}
printHtmlPart(30)
if(true && (muambaInstance?.historico[0])) {
printHtmlPart(22)
if(true && (muambaInstance?.historico[0].descricao)) {
printHtmlPart(23)
expressionOut.print(muambaInstance?.historico[0].descricao)
printHtmlPart(22)
}
printHtmlPart(31)
}
else {
printHtmlPart(32)
}
printHtmlPart(33)
i++
}
}
printHtmlPart(34)
invokeTag('paginate','g',124,['total':(muambaInstanceCount ?: 0),'params':(params)],-1)
printHtmlPart(35)
})
invokeTag('captureBody','sitemesh',128,[:],1)
printHtmlPart(36)
invokeTag('javascript','asset',130,['src':("datepicker.js")],-1)
printHtmlPart(37)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1405131952000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
