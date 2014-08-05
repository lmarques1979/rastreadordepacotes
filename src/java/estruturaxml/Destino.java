package estruturaxml;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name="destino")
@XmlAccessorType(XmlAccessType.FIELD)
public class Destino {
	@XmlElement(name="local")
	String local;
	@XmlElement(name="codigo")
	String codigo;
	@XmlElement(name="cidade")
	String cidade;
	@XmlElement(name="bairro")
	String bairro;
	@XmlElement(name="uf")
	String uf;
}
