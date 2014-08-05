package rastreadordepacotes

import seguranca.Usuario;
import grails.plugin.springsecurity.annotation.Secured
import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
@Secured("isAuthenticated()")
class BaseController{ 
   
	def configurationService
	def springSecurityService
	
    def getPaginacaoParams(){
		
			def resultado = Usuario.findAllById(getUsuarioLogado().id)
			resultado.each() {
			params.max = Math.min(it.itensporpagina, 100)
      }
    params
  }
	
  def getUsuarioLogado(){
	  	springSecurityService.currentUser
  }
 
} 