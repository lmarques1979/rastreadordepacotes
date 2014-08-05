package estruturaxml;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name="objeto")
@XmlAccessorType(XmlAccessType.FIELD)
public class Objeto {
	
	@XmlElement(name="numero")
	String numero;
	
	@XmlElement(name="evento")
	List<Evento> eventos = new ArrayList<Evento>();
}
