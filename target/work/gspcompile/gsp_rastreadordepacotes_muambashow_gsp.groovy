import rastreadordepacotes.Muamba
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_rastreadordepacotes_muambashow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/muamba/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'muamba.label', default: 'Muamba'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("list.muamba.label")],-1)
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
invokeTag('message','g',14,['code':("list.muamba.label")],-1)
printHtmlPart(6)
loop:{
int i = 0
for( muambaInstance in (muambaInstanceList) ) {
printHtmlPart(7)
invokeTag('set','g',16,['var':("muambaInstance"),'value':(muambaInstance)],-1)
printHtmlPart(7)
invokeTag('set','g',17,['var':("id"),'value':(muambaInstance?.id)],-1)
printHtmlPart(8)
expressionOut.print(muambaInstance?.codigo)
printHtmlPart(9)
expressionOut.print(muambaInstance?.descricao)
printHtmlPart(10)
invokeTag('image','asset',19,['src':("flags/24/${muambaInstance?.pais.imagem}"),'title':(fieldValue(bean: muambaInstance?.pais, field: "descricao"))],-1)
printHtmlPart(11)
expressionOut.print(fieldValue(bean: muambaInstance, field: 'codigo'))
printHtmlPart(12)
invokeTag('image','asset',22,['src':("icon.jpg")],-1)
printHtmlPart(13)
i++
}
}
printHtmlPart(14)
if(true && (flash.message)) {
printHtmlPart(15)
expressionOut.print(flash.message)
printHtmlPart(16)
}
printHtmlPart(17)
loop:{
int i = 0
for( muambaInstance in (muambaInstanceList) ) {
printHtmlPart(18)
loop:{
int j = 0
for( historicoInstance in (muambaInstance?.historico) ) {
printHtmlPart(19)
expressionOut.print((j % 2) == 0 ? 'even' : 'odd')
printHtmlPart(20)
invokeTag('formatDate','g',44,['date':(historicoInstance?.dataevento),'format':("dd/MM/yyyy HH:mm")],-1)
printHtmlPart(21)
expressionOut.print(historicoInstance?.local)
printHtmlPart(22)
if(true && (historicoInstance?.localdestino)) {
printHtmlPart(23)
expressionOut.print(historicoInstance?.localdestino)
printHtmlPart(24)
}
printHtmlPart(25)
invokeTag('image','asset',51,['src':("status/${historicoInstance?.classe}.png"),'title':(historicoInstance?.descricao)],-1)
printHtmlPart(26)
expressionOut.print(historicoInstance?.descricao)
printHtmlPart(27)
j++
}
}
printHtmlPart(28)
i++
}
}
printHtmlPart(29)
createTagBody(2, {->
printHtmlPart(30)
createTagBody(3, {->
invokeTag('message','g',61,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',61,['class':("edit"),'action':("edit"),'id':(id)],3)
printHtmlPart(31)
invokeTag('actionSubmit','g',62,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(32)
})
invokeTag('form','g',64,['url':([resource:muambaInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(33)
})
invokeTag('captureBody','sitemesh',66,[:],1)
printHtmlPart(34)
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
