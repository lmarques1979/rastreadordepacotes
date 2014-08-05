import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_rastreadordepacotesindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('message','g',9,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(6)
invokeTag('image','asset',45,['src':("status/verde.png"),'title':("Entregue")],-1)
printHtmlPart(7)
invokeTag('image','asset',55,['src':("status/azul.png"),'title':("Saiu para entrega ao destinatário")],-1)
printHtmlPart(8)
invokeTag('image','asset',65,['src':("status/amarelo.png"),'title':("Conferido")],-1)
printHtmlPart(9)
invokeTag('image','asset',75,['src':("status/laranja.png"),'title':("Encaminhado")],-1)
printHtmlPart(10)
invokeTag('image','asset',85,['src':("status/branco.png"),'title':("Postado")],-1)
printHtmlPart(11)
invokeTag('image','asset',95,['src':("status/indisponivel.png"),'title':("Indisponível")],-1)
printHtmlPart(12)
if(true && (sec.loggedInUserInfo(field:'username')==null || sec.loggedInUserInfo(field:'username')=='')) {
printHtmlPart(13)
createClosureForHtmlPart(14, 3)
invokeTag('link','g',114,['class':("create"),'controller':("Usuario"),'action':("create")],3)
printHtmlPart(15)
}
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',119,[:],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1407169187000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
