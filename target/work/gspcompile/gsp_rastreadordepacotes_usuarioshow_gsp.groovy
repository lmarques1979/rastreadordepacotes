import seguranca.Usuario
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_rastreadordepacotes_usuarioshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/usuario/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("entityName"),'value':(message(code: 'usuario.label', default: 'Usuario'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',7,['code':("list.usuario.label")],-1)
})
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('message','g',10,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(4)
invokeTag('message','g',13,['code':("list.usuario.label")],-1)
printHtmlPart(5)
if(true && (flash.message)) {
printHtmlPart(6)
expressionOut.print(flash.message)
printHtmlPart(7)
}
printHtmlPart(8)
if(true && (usuarioInstance?.username)) {
printHtmlPart(9)
invokeTag('message','g',21,['code':("usuario.username.label"),'default':("Username")],-1)
printHtmlPart(10)
invokeTag('fieldValue','g',23,['bean':(usuarioInstance),'field':("username")],-1)
printHtmlPart(11)
}
printHtmlPart(12)
if(true && (usuarioInstance?.email)) {
printHtmlPart(13)
invokeTag('message','g',30,['code':("usuario.email.label"),'default':("Email")],-1)
printHtmlPart(14)
invokeTag('fieldValue','g',32,['bean':(usuarioInstance),'field':("email")],-1)
printHtmlPart(11)
}
printHtmlPart(12)
if(true && (usuarioInstance?.primeironome)) {
printHtmlPart(15)
invokeTag('message','g',39,['code':("usuario.primeironome.label"),'default':("Primeironome")],-1)
printHtmlPart(16)
invokeTag('fieldValue','g',41,['bean':(usuarioInstance),'field':("primeironome")],-1)
printHtmlPart(11)
}
printHtmlPart(12)
if(true && (usuarioInstance?.sobrenome)) {
printHtmlPart(17)
invokeTag('message','g',48,['code':("usuario.sobrenome.label"),'default':("Sobrenome")],-1)
printHtmlPart(18)
invokeTag('fieldValue','g',50,['bean':(usuarioInstance),'field':("sobrenome")],-1)
printHtmlPart(11)
}
printHtmlPart(12)
if(true && (usuarioInstance?.accountExpired)) {
printHtmlPart(19)
invokeTag('message','g',57,['code':("usuario.accountExpired.label"),'default':("Account Expired")],-1)
printHtmlPart(20)
invokeTag('formatBoolean','g',59,['boolean':(usuarioInstance?.accountExpired)],-1)
printHtmlPart(11)
}
printHtmlPart(12)
if(true && (usuarioInstance?.accountLocked)) {
printHtmlPart(21)
invokeTag('message','g',66,['code':("usuario.accountLocked.label"),'default':("Account Locked")],-1)
printHtmlPart(22)
invokeTag('formatBoolean','g',68,['boolean':(usuarioInstance?.accountLocked)],-1)
printHtmlPart(11)
}
printHtmlPart(12)
if(true && (usuarioInstance?.enabled)) {
printHtmlPart(23)
invokeTag('message','g',75,['code':("usuario.enabled.label"),'default':("Enabled")],-1)
printHtmlPart(24)
invokeTag('formatBoolean','g',77,['boolean':(usuarioInstance?.enabled)],-1)
printHtmlPart(11)
}
printHtmlPart(25)
if(true && (usuarioInstance?.muambas)) {
printHtmlPart(26)
invokeTag('message','g',84,['code':("usuario.muambas.label"),'default':("Muambas")],-1)
printHtmlPart(27)
for( m in (usuarioInstance.muambas) ) {
printHtmlPart(28)
createTagBody(4, {->
expressionOut.print(m.descricao)
})
invokeTag('link','g',87,['controller':("muamba"),'action':("show"),'id':(m.id)],4)
printHtmlPart(29)
}
printHtmlPart(30)
}
printHtmlPart(31)
if(true && (usuarioInstance?.passwordExpired)) {
printHtmlPart(32)
invokeTag('message','g',95,['code':("usuario.passwordExpired.label"),'default':("Password Expired")],-1)
printHtmlPart(33)
invokeTag('formatBoolean','g',97,['boolean':(usuarioInstance?.passwordExpired)],-1)
printHtmlPart(11)
}
printHtmlPart(34)
if(true && (usuarioInstance?.enviaremail)) {
printHtmlPart(35)
invokeTag('message','g',104,['code':("usuario.enviaremail.label"),'default':("Enviar E-mail")],-1)
printHtmlPart(36)
invokeTag('formatBoolean','g',106,['boolean':(usuarioInstance?.enviaremail)],-1)
printHtmlPart(11)
}
printHtmlPart(34)
if(true && (usuarioInstance?.enviarsms)) {
printHtmlPart(37)
invokeTag('message','g',113,['code':("usuario.enviarsms.label"),'default':("Enviar SMS")],-1)
printHtmlPart(38)
invokeTag('formatBoolean','g',115,['boolean':(usuarioInstance?.enviarsms)],-1)
printHtmlPart(11)
}
printHtmlPart(34)
if(true && (usuarioInstance?.itensporpagina)) {
printHtmlPart(39)
invokeTag('message','g',122,['code':("usuario.itensporpagina.label"),'default':("Itens por Página")],-1)
printHtmlPart(40)
invokeTag('fieldValue','g',124,['bean':(usuarioInstance),'field':("itensporpagina")],-1)
printHtmlPart(11)
}
printHtmlPart(41)
createTagBody(2, {->
printHtmlPart(42)
createTagBody(3, {->
invokeTag('message','g',133,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',133,['class':("edit"),'action':("edit"),'resource':(usuarioInstance)],3)
printHtmlPart(43)
invokeTag('actionSubmit','g',134,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(44)
})
invokeTag('form','g',136,['url':([resource:usuarioInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(45)
})
invokeTag('captureBody','sitemesh',138,[:],1)
printHtmlPart(46)
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
