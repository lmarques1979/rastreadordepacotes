package seguranca

import rastreadordepacotes.Muamba;

class Usuario {

	transient springSecurityService

	String username
	String password
	String email
	String primeironome
	String sobrenome
	boolean enabled = true
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired
	boolean enviaremail=true
	boolean enviarsms=false
	int		itensporpagina
	
	static hasMany = [muambas: Muamba , usuarioregras: UsuarioRegra]
	
	static transients = ['springSecurityService']

	static constraints = {
		username blank: false, unique: true , nullable:false
		password blank: false , nullable:false
		email email: true , blank: false , nullable:false
		primeironome blank: false , nullable:false
		sobrenome blank: true , nullable:true
		enviaremail blank: true , nullable:true
		enviarsms blank: true , nullable:true
		itensporpagina blank: true , nullable:true
	}
	
	static mapping = {
		usuarioregras cascade: 'all-delete-orphan'
		muambas cascade: 'all-delete-orphan'
		configuracao cascade: 'all-delete-orphan'
		password column: '`password`'
	}

	Set<Regra> getAuthorities() {
		UsuarioRegra.findAllByUsuario(this).collect { it.regra } as Set
	}

	def beforeInsert() {
		encodePassword()
	}

	def beforeUpdate() {
		if (isDirty('password')) {
			encodePassword()
		}
	}

	protected void encodePassword() {
		password = springSecurityService.encodePassword(password)
	}
}
