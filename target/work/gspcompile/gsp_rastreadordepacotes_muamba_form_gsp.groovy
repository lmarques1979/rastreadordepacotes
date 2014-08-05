import rastreadordepacotes.Muamba
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_rastreadordepacotes_muamba_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/muamba/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: muambaInstance, field: 'codigo', 'error'))
printHtmlPart(1)
invokeTag('message','g',5,['code':("muamba.codigo.label"),'default':("Codigo")],-1)
printHtmlPart(2)
invokeTag('textField','g',8,['name':("codigo"),'size':("14"),'maxlength':("13"),'required':(""),'value':(muambaInstance?.codigo)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: muambaInstance, field: 'descricao', 'error'))
printHtmlPart(4)
invokeTag('message','g',14,['code':("muamba.descricao.label"),'default':("Descricao")],-1)
printHtmlPart(2)
invokeTag('textField','g',17,['name':("descricao"),'size':("40"),'maxlength':("50"),'required':(""),'value':(muambaInstance?.descricao)],-1)
printHtmlPart(5)
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
