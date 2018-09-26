/**
* Reads the xml for pdf
* @author  Anele Chila
* @version 1.0
* @since   2018 - 09 - 07
*/

import java.io.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.util.Scanner;
import java.util.ArrayList;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import java.util.Date;

public class XMLReaderPDF {
    
    private String Docname;
    private String Docsize;
    private String Docdate;
    private Album album = new Album();
    
    public void ReadXML() throws IOException,FileNotFoundException, ParserConfigurationException, SAXException{
    
        
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	     DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        
        ArrayList<String> names = new ArrayList<>();
        
        
        
        File xmlFile = new File("pdf_2.xml");
        Document doc = dBuilder.parse(xmlFile);
        
        
        doc.getDocumentElement().normalize();
        System.out.println("Root Name: "+doc.getDocumentElement().getNodeName());
        NodeList nList = doc.getElementsByTagName("pdf");
        
        for(int i = 0; i<nList.getLength(); i++){
        
            Node nNode = nList.item(i);
            
            if(nNode.getNodeType() == Node.ELEMENT_NODE){
            
                Element element = (Element)nNode;
                Docname = element.getElementsByTagName("name").item(0).getTextContent();
                Docsize = element.getElementsByTagName("type").item(0).getTextContent();
                Docdate = element.getElementsByTagName("date").item(0).getTextContent();
               
                album.setPDF(Docname, Docsize, new Date(Integer.parseInt(Docdate.substring(6,10)) , Integer.parseInt(Docdate.substring(3,5)), Integer.parseInt(Docdate.substring(0,2))));
                
            }
        }
        album.arrayGenerator();
        }
}
