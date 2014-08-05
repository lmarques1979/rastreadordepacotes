package rastreadordepacotes

import java.util.Date;

class HistoricoMuamba {

	String tipo
	String status
	Date   dataevento
	String descricao
	String local
	String localdestino
	String classe
	Date dateCreated
	Date lastUpdated
	
	static belongsTo = [muamba:Muamba]
    static constraints = {
    
		tipo(nullable: true , blank: true)
		status(nullable: true , blank: true)
		dataevento(nullable: true , blank: true)
		descricao(nullable: true , blank: true)
		local(nullable: true , blank: true)
		localdestino(nullable: true , blank: true)
		classe(nullable: true , blank: true)
	}
	
	static mapping = {
		autoTimestamp true
	}
}
