package xml;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javax.xml.bind.JAXBContext
import javax.xml.bind.Unmarshaller
import estruturaxml.Sroxml
import org.codehaus.groovy.grails.web.context.ServletContextHolder

class GeraXML {

	def xml(String codigo, String tipo="T") {

		def serveletContext = ServletContextHolder.servletContext
        def storagePath = serveletContext.getRealPath("/")
		def caminhoxml = storagePath + (new Date()).getTime() + "_" + "resultado.xml"
		def fileXML = new File(caminhoxml)
		
		try {
			
			def url = new URL("http://websro.correios.com.br/sro_bin/sroii_xml.eventos");
			def connection = url.openConnection();
			connection.setDoOutput(true);
			connection.setUseCaches(false);
			connection.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
			connection.setAllowUserInteraction(false);
			def outStream = new PrintStream(connection.getOutputStream());
			outStream.println("usuario=ECT&senha=SRO&tipo=L&resultado=" + tipo + "&objetos=" + codigo);
			outStream.close();
			def inBuffered = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			def inputLine;
			def f = new FileWriter(fileXML);
			while ((inputLine = inBuffered.readLine()) != null) {
				f.write(inputLine);
			}
			f.close();
			inBuffered.close();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			def jaxbContext = JAXBContext.newInstance(Sroxml.class);
			def jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			def sroxml = (Sroxml) jaxbUnmarshaller.unmarshal(new File(caminhoxml));
			boolean fileSuccessfullyDeleted =  fileXML.delete()
			sroxml
	}
}
