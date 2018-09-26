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
/**
* Driver drives everything, this class runs the entire website
* @author  Anele Chila
* @version 1.0
* @since   2018 - 09 - 07
*/

import java.util.Date;

public class Driver
{
   public static void main(String[] args) throws IOException,FileNotFoundException, ParserConfigurationException, SAXException{
   
      
     
     
     TemplateGenerator tg = new TemplateGenerator();
     
     tg.paintImage("Images.html");
     TemplateGenerator.paintPdf("PDF.html"); 
      
   }
}