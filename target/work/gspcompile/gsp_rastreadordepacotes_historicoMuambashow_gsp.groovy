import rastreadordepacotes.HistoricoMuamba
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_rastreadordepacotes_historicoMuambashow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/historicoMuamba/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'historicoMuamba.label', default: 'HistoricoMuamba'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (historicoMuambaInstance?.numero)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("historicoMuamba.numero.label"),'default':("Numero")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(historicoMuambaInstance),'field':("numero")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (historicoMuambaInstance?.tipo)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("historicoMuamba.tipo.label"),'default':("Tipo")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(historicoMuambaInstance),'field':("tipo")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (historicoMuambaInstance?.status)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("historicoMuamba.status.label"),'default':("Status")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(historicoMuambaInstance),'field':("status")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (historicoMuambaInstance?.data)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("historicoMuamba.data.label"),'default':("Data")],-1)
printHtmlPart(23)
invokeTag('formatDate','g',57,['date':(historicoMuambaInstance?.data)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (historicoMuambaInstance?.hora)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("historicoMuamba.hora.label"),'default':("Hora")],-1)
printHtmlPart(25)
invokeTag('formatDate','g',66,['date':(historicoMuambaInstance?.hora)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (historicoMuambaInstance?.descricao)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("historicoMuamba.descricao.label"),'default':("Descricao")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(historicoMuambaInstance),'field':("descricao")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (historicoMuambaInstance?.local)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("historicoMuamba.local.label"),'default':("Local")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(historicoMuambaInstance),'field':("local")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (historicoMuambaInstance?.codigo)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("historicoMuamba.codigo.label"),'default':("Codigo")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',93,['bean':(historicoMuambaInstance),'field':("codigo")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (historicoMuambaInstance?.cidade)) {
printHtmlPart(32)
invokeTag('message','g',100,['code':("historicoMuamba.cidade.label"),'default':("Cidade")],-1)
printHtmlPart(33)
invokeTag('fieldValue','g',102,['bean':(historicoMuambaInstance),'field':("cidade")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (historicoMuambaInstance?.uf)) {
printHtmlPart(34)
invokeTag('message','g',109,['code':("historicoMuamba.uf.label"),'default':("Uf")],-1)
printHtmlPart(35)
invokeTag('fieldValue','g',111,['bean':(historicoMuambaInstance),'field':("uf")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (historicoMuambaInstance?.destinolocal)) {
printHtmlPart(36)
invokeTag('message','g',118,['code':("historicoMuamba.destinolocal.label"),'default':("Destinolocal")],-1)
printHtmlPart(37)
invokeTag('fieldValue','g',120,['bean':(historicoMuambaInstance),'field':("destinolocal")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (historicoMuambaInstance?.destinocidade)) {
printHtmlPart(38)
invokeTag('message','g',127,['code':("historicoMuamba.destinocidade.label"),'default':("Destinocidade")],-1)
printHtmlPart(39)
invokeTag('fieldValue','g',129,['bean':(historicoMuambaInstance),'field':("destinocidade")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (historicoMuambaInstance?.destinobairro)) {
printHtmlPart(40)
invokeTag('message','g',136,['code':("historicoMuamba.destinobairro.label"),'default':("Destinobairro")],-1)
printHtmlPart(41)
invokeTag('fieldValue','g',138,['bean':(historicoMuambaInstance),'field':("destinobairro")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (historicoMuambaInstance?.destinouf)) {
printHtmlPart(42)
invokeTag('message','g',145,['code':("historicoMuamba.destinouf.label"),'default':("Destinouf")],-1)
printHtmlPart(43)
invokeTag('fieldValue','g',147,['bean':(historicoMuambaInstance),'field':("destinouf")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (historicoMuambaInstance?.destinocodigo)) {
printHtmlPart(44)
invokeTag('message','g',154,['code':("historicoMuamba.destinocodigo.label"),'default':("Destinocodigo")],-1)
printHtmlPart(45)
invokeTag('fieldValue','g',156,['bean':(historicoMuambaInstance),'field':("destinocodigo")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (historicoMuambaInstance?.muamba)) {
printHtmlPart(46)
invokeTag('message','g',163,['code':("historicoMuamba.muamba.label"),'default':("Muamba")],-1)
printHtmlPart(47)
createTagBody(3, {->
expressionOut.print(historicoMuambaInstance?.muamba?.encodeAsHTML())
})
invokeTag('link','g',165,['controller':("muamba"),'action':("show"),'id':(historicoMuambaInstance?.muamba?.id)],3)
printHtmlPart(16)
}
printHtmlPart(48)
createTagBody(2, {->
printHtmlPart(49)
createTagBody(3, {->
invokeTag('message','g',173,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',173,['class':("edit"),'action':("edit"),'resource':(historicoMuambaInstance)],3)
printHtmlPart(50)
invokeTag('actionSubmit','g',174,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(51)
})
invokeTag('form','g',176,['url':([resource:historicoMuambaInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(52)
})
invokeTag('captureBody','sitemesh',178,[:],1)
printHtmlPart(53)
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
