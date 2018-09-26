// This class is responsile for searching through the metadata
/**
* Is the class that search a document name from xml data/pages
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

public class Search {
    
    public static void main(String[] args) throws IOException,FileNotFoundException, ParserConfigurationException, SAXException{
    
        Scanner input = new Scanner(System.in);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        
        ArrayList<String> names = new ArrayList<>();
        
        //System.out.println("Enter file name: ");
        
        //String file = input.nextLine();
        File xmlFile = new File("pictures.xml");
        Document doc = dBuilder.parse(xmlFile);
        //BufferedReader read = new BufferedReader(new FileReader(file));
        //String line;
        doc.getDocumentElement().normalize();
        System.out.println("Root Name: "+doc.getDocumentElement().getNodeName());
        NodeList nList = doc.getElementsByTagName("image");
        
        for(int i = 0; i<nList.getLength(); i++){
        
            Node nNode = nList.item(i);
            
            if(nNode.getNodeType() == Node.ELEMENT_NODE){
            
                Element element = (Element)nNode;
                System.out.println(element.getElementsByTagName("name").item(0).getTextContent());
            }
        }
        
        /*try{
            while((line = read.readLine()) != null){
                     names.add(line);
            }
            System.out.println("Enter word to search: ");
                     String sName = input.nextLine();
                     
                     for(String name : names){
                         
                         if(sName.equalsIgnoreCase(name)){
                         
                             System.out.println(name);
                             break;
                         }
                     }
            
        }
        
        catch(IOException e){
            System.err.println("File not found");
        }*/
    }
}
