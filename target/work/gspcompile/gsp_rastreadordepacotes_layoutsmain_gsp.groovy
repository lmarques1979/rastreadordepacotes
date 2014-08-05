import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_rastreadordepacotes_layoutsmain_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/main.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge,chrome=1")],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',10,['default':("Grails")],-1)
})
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(2)
expressionOut.print(assetPath(src: 'favicon.ico'))
printHtmlPart(3)
invokeTag('stylesheet','asset',13,['src':("application.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',14,['src':("application.js")],-1)
printHtmlPart(1)
invokeTag('layoutHead','g',15,[:],-1)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',16,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('image','asset',20,['src':("logo/logo.png"),'alt':("Rastreador de Pacotes")],-1)
printHtmlPart(7)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',23,['code':("default.home.label")],-1)
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(9)
if(true && (sec.loggedInUserInfo(field: 'username') == 'admin')) {
printHtmlPart(10)
createTagBody(4, {->
invokeTag('message','g',27,['code':("usuario.label")],-1)
})
invokeTag('link','g',27,['class':("list"),'controller':("Usuario"),'action':("index")],4)
printHtmlPart(11)
createTagBody(4, {->
invokeTag('message','g',28,['code':("pais.label")],-1)
})
invokeTag('link','g',28,['class':("list"),'controller':("Pais"),'action':("index")],4)
printHtmlPart(11)
createTagBody(4, {->
invokeTag('message','g',29,['code':("atualizastatus.label")],-1)
})
invokeTag('link','g',29,['class':("atualiza"),'controller':("Muamba"),'action':("atualizastatus"),'name':("atualiza")],4)
printHtmlPart(11)
createTagBody(4, {->
invokeTag('message','g',30,['code':("regra.label")],-1)
})
invokeTag('link','g',30,['class':("create"),'controller':("Regra"),'action':("index")],4)
printHtmlPart(12)
createTagBody(4, {->
invokeTag('message','g',31,['code':("usuarioregra.label")],-1)
})
invokeTag('link','g',31,['class':("create"),'controller':("UsuarioRegra"),'action':("index")],4)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (sec.loggedInUserInfo(field: 'username') != 'admin')) {
printHtmlPart(10)
createTagBody(4, {->
invokeTag('message','g',35,['code':("adicionarpacote.label")],-1)
})
invokeTag('link','g',35,['class':("create"),'controller':("Muamba"),'action':("create")],4)
printHtmlPart(11)
createTagBody(4, {->
invokeTag('message','g',36,['code':("verpacote.label")],-1)
})
invokeTag('link','g',36,['class':("list"),'controller':("Muamba"),'action':("index")],4)
printHtmlPart(11)
createTagBody(4, {->
invokeTag('message','g',37,['code':("dadosusuario.label")],-1)
})
invokeTag('link','g',37,['class':("usuario"),'controller':("Usuario"),'action':("show"),'id':(sec.loggedInUserInfo(field:"id"))],4)
printHtmlPart(15)
}
printHtmlPart(16)
createTagBody(3, {->
invokeTag('message','g',41,['code':("dataultimaatualizacao.label")],-1)
})
invokeTag('link','g',41,['class':("list"),'controller':("Muamba"),'action':("dataultimaatualizacao")],3)
printHtmlPart(17)
createTagBody(3, {->
invokeTag('message','g',43,['code':("logout.usuario.label")],-1)
})
invokeTag('link','g',43,['class':("logout"),'controller':("logout"),'action':("index"),'name':("sair")],3)
printHtmlPart(18)
if(true && (sec.loggedInUserInfo(field: 'primeironome'))) {
printHtmlPart(19)
invokeTag('set','g',47,['var':("usuario"),'value':(sec.loggedInUserInfo(field: 'primeironome'))],-1)
printHtmlPart(20)
}
printHtmlPart(20)
if(true && (sec.loggedInUserInfo(field: 'sobrenome'))) {
printHtmlPart(19)
invokeTag('set','g',50,['var':("usuario"),'value':(usuario + ' ' + sec.loggedInUserInfo(field: 'sobrenome'))],-1)
printHtmlPart(20)
}
printHtmlPart(21)
expressionOut.print(usuario)
printHtmlPart(22)
})
invokeTag('ifLoggedIn','sec',53,[:],2)
printHtmlPart(23)
createTagBody(2, {->
printHtmlPart(24)
createTagBody(3, {->
invokeTag('message','g',56,['code':("criar.usuario.label")],-1)
})
invokeTag('link','g',56,['class':("create"),'controller':("Usuario"),'action':("create")],3)
printHtmlPart(25)
createTagBody(3, {->
invokeTag('message','g',57,['code':("dataultimaatualizacao.label")],-1)
})
invokeTag('link','g',57,['class':("list"),'controller':("Muamba"),'action':("dataultimaatualizacao")],3)
printHtmlPart(25)
createTagBody(3, {->
invokeTag('message','g',58,['code':("login.usuario.label")],-1)
})
invokeTag('link','g',58,['class':("login"),'controller':("login"),'action':("auth")],3)
printHtmlPart(26)
})
invokeTag('ifNotLoggedIn','sec',59,[:],2)
printHtmlPart(27)
invokeTag('layoutBody','g',64,[:],-1)
printHtmlPart(28)
invokeTag('message','g',66,['code':("spinner.alt"),'default':("Loading&hellip;")],-1)
printHtmlPart(29)
})
invokeTag('captureBody','sitemesh',67,[:],1)
printHtmlPart(30)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1406738653000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
