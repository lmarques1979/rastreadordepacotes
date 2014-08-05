package rastreadordepacotes

import java.util.Date;

import seguranca.Usuario;

class Muamba {

	String codigo
	String descricao
	boolean entregue=false
	Date dateCreated
    Date lastUpdated
	Date dataultimostatus
	Date dataultimoenvioemail
	Date dataultimoenviosms
	Date dataultimaatualizacao
	static belongsTo = [usuario:Usuario, pais:Pais]
	static hasMany   = [historico: HistoricoMuamba]
		
    static constraints = {
		
		codigo(unique: ['usuario'])
		codigo(nullable: false , size: 13..13, blank: false, matches:"[A-Z]{2}[0-9]{9}[A-Z]{2}")
		descricao(nullable: false, size: 0..50) 
		entregue(nullable: true , blank: true)
		dataultimostatus(nullable: true , blank: true)
		dataultimoenvioemail(nullable: true , blank: true)
		dataultimoenviosms(nullable: true , blank: true)
		dataultimaatualizacao(nullable: true , blank: true)
	}
	
	static mapping = {
		sort dataultimostatus:"desc"
		historico cascade: 'all-delete-orphan', sort:"dataevento", order:"desc"
		autoTimestamp true
	}

}
