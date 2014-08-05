package rastreadordepacotes
import grails.plugin.springsecurity.annotation.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
@Secured("isAuthenticated()")
class HistoricoMuambaController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond HistoricoMuamba.list(params), model:[historicoMuambaInstanceCount: HistoricoMuamba.count()]
    }

    def show(HistoricoMuamba historicoMuambaInstance) {
        respond historicoMuambaInstance
    }

    def create() {
        respond new HistoricoMuamba(params)
    }

    @Transactional
    def save(HistoricoMuamba historicoMuambaInstance) {
        if (historicoMuambaInstance == null) {
            notFound()
            return
        }

        historicoMuambaInstance.save flush:true
		
		if (historicoMuambaInstance.hasErrors()) {
			respond historicoMuambaInstance.errors, view:'create'
			return
		}
		
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'historicoMuamba.label', default: 'HistoricoMuamba'), historicoMuambaInstance.id])
                redirect historicoMuambaInstance
            }
            '*' { respond historicoMuambaInstance, [status: CREATED] }
        }
    }

    def edit(HistoricoMuamba historicoMuambaInstance) {
        respond historicoMuambaInstance
    }

    @Transactional
    def update(HistoricoMuamba historicoMuambaInstance) {
        if (historicoMuambaInstance == null) {
            notFound()
            return
        }

        historicoMuambaInstance.save flush:true
		
		if (historicoMuambaInstance.hasErrors()) {
			respond historicoMuambaInstance.errors, view:'edit'
			return
		}

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'HistoricoMuamba.label', default: 'HistoricoMuamba'), historicoMuambaInstance.id])
                redirect historicoMuambaInstance
            }
            '*'{ respond historicoMuambaInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(HistoricoMuamba historicoMuambaInstance) {

        if (historicoMuambaInstance == null) {
            notFound()
            return
        }

        historicoMuambaInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'HistoricoMuamba.label', default: 'HistoricoMuamba'), historicoMuambaInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'historicoMuamba.label', default: 'HistoricoMuamba'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
