package estruturaxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="sroxml")
@XmlAccessorType(XmlAccessType.FIELD)
public class Sroxml {
	
	@XmlElement(name="versao")
	int versao;
	@XmlElement(name="qtd")
	int qtd;

	@XmlElement(name="TipoPesquisa")
	String TipoPesquisa;
	
	@XmlElement(name="TipoResultado")
	String TipoResultado;
 
	@XmlElement(name="objeto")
	Objeto objeto;
 
	
}