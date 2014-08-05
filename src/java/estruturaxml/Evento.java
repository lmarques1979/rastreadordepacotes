package estruturaxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="evento")
@XmlAccessorType(XmlAccessType.FIELD)
public class Evento {
	
	@XmlElement(name="tipo")
	String tipo;
	
	@XmlElement(name="status")
	String status;
	
	@XmlElement(name="data")
	String data;
	
	@XmlElement(name="hora")
	String hora;
	
	@XmlElement(name="descricao")
	String descricao;
	
	@XmlElement(name="recebedor")
	String recebedor;
	
	@XmlElement(name="documento")
	String documento;
	
	@XmlElement(name="comentario")
	String comentario;
	
	@XmlElement(name="local")
	String local;
	
	@XmlElement(name="codigo")
	String codigo;
	
	@XmlElement(name="cidade")
	String cidade;
	
	@XmlElement(name="uf")
	String uf;
	
	@XmlElement(name="sto")
	String sto;
	
	@XmlElement(name="destino")
	Destino destino;
}
