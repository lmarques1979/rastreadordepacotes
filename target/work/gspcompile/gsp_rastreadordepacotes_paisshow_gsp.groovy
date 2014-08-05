import rastreadordepacotes.Pais
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_rastreadordepacotes_paisshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/pais/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'pais.label', default: 'Pais'))],-1)
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
createTagBody(2, {->
invokeTag('message','g',14,['code':("list.pais.label")],-1)
})
invokeTag('link','g',14,['class':("list"),'action':("index")],2)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',15,['code':("create.pais.label")],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(7)
invokeTag('message','g',19,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
expressionOut.print(flash.message)
printHtmlPart(10)
}
printHtmlPart(11)
if(true && (paisInstance?.codigo)) {
printHtmlPart(12)
invokeTag('message','g',27,['code':("pais.codigo.label"),'default':("Codigo")],-1)
printHtmlPart(13)
invokeTag('fieldValue','g',29,['bean':(paisInstance),'field':("codigo")],-1)
printHtmlPart(14)
}
printHtmlPart(15)
if(true && (paisInstance?.descricao)) {
printHtmlPart(16)
invokeTag('message','g',36,['code':("pais.descricao.label"),'default':("Descricao")],-1)
printHtmlPart(17)
invokeTag('fieldValue','g',38,['bean':(paisInstance),'field':("descricao")],-1)
printHtmlPart(14)
}
printHtmlPart(15)
if(true && (paisInstance?.imagem)) {
printHtmlPart(18)
invokeTag('message','g',45,['code':("pais.imagem.label"),'default':("Imagem")],-1)
printHtmlPart(19)
invokeTag('image','asset',47,['src':("flags/24/${paisInstance.imagem}"),'title':(paisInstance.descricao)],-1)
printHtmlPart(14)
}
printHtmlPart(20)
createTagBody(2, {->
printHtmlPart(21)
createTagBody(3, {->
invokeTag('message','g',57,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',57,['class':("edit"),'action':("edit"),'resource':(paisInstance)],3)
printHtmlPart(22)
invokeTag('actionSubmit','g',58,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(23)
})
invokeTag('form','g',60,['url':([resource:paisInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(24)
})
invokeTag('captureBody','sitemesh',62,[:],1)
printHtmlPart(25)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1406757043000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
