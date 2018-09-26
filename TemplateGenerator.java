/**
* Template generator class generates the html file and load everything to the html files
* @author  Anele Chila
* @version 1.0
* @since   2018 - 09 - 07
*/

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.PrintWriter;
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

public class TemplateGenerator
{
  public static List<Image> myImages = new ArrayList<Image>();
  public static List<PDF> mypdfs = new ArrayList<PDF>();
  
  public TemplateGenerator(){
      myImages =  null;
      mypdfs = null ;
  }
  
  public TemplateGenerator( List<Image> images, List<PDF> pdfs){
   myImages = images;
   mypdfs = pdfs;
  }
  
  
  
  public void paintImage(String file) throws IOException,FileNotFoundException, ParserConfigurationException, SAXException{
      
      //Album album = new Album();
      //XMLReader xmlreader = new XMLReader();
      //xmlreader.ReadXML();    
      //List<Image> myImages = album.getImage();
     String myfile = "Template.html";
     XMLReader xmlreader = new XMLReader();
     xmlreader.ReadXML();
     
     try{
     BufferedReader inputStream = new BufferedReader(new FileReader(myfile));
     PrintWriter outputStream = new PrintWriter(new FileOutputStream(file));
	   
    
     String line = inputStream.readLine();
     while(line != null){
        if(line.contains("$documents")){
            int count = 0;
                for(Image image : myImages){
                   outputStream.println(myImages.get(count).toString());
                   
                   count++;

                }                                
         }
         else if(line.contains("$links")){
            outputStream.println("<li><a href=\"Images.html\" class=\"active\">Images</a></li>\r\n" + 
"<li><a href=\"PDF.html\">PDF</a></li>\r\n" + 
"<li><a href=\"#\">Audio</a></li>\r\n" + 
"<li><a href=\"#\" >Video</a></li>");
         }
         else if(line.contains("&heading")){
            outputStream.println("<h2>"+"Images"+"<"+"/"+"h2>");
         }
         else{outputStream.println(line);}
         line = inputStream.readLine();
     }
     outputStream.close();
     inputStream.close();
    
    }
    catch(FileNotFoundException e)
    {
      System.out.println("Problem opening files.");
    }
    catch(IOException e)
    {
      System.out.println("Error reading from original.txt."); 
    }
     
     
  }
  
  public static void paintPdf(String file) throws IOException,FileNotFoundException, ParserConfigurationException, SAXException{
      
      //Album album = new Album();
      //XMLReader xmlreader = new XMLReader();
      //xmlreader.ReadXML();    
      //List<Image> myImages = album.getImage();
     String myfile = "Template.html";
     XMLReaderPDF xmlreader2 = new XMLReaderPDF();
     xmlreader2.ReadXML();
     
     try{
     BufferedReader inputStream = new BufferedReader(new FileReader(myfile));
     PrintWriter outputStream = new PrintWriter(new FileOutputStream(file));
	   
    System.out.println("luvo");
     String line = inputStream.readLine();
     while(line != null){
        if(line.contains("$documents")){
           
                int count = 0;
                for(PDF pdf : mypdfs){
                   outputStream.println(mypdfs.get(count).toString());
                   
                   count++;

                }                                                
         }
         else if(line.contains("$links")){
            outputStream.println("<li><a href=\"Images.html\">Images</a></li>\r\n" + 
"<li><a href=\"PDF.html\" class=\"active\">PDF</a></li>\r\n" + 
"<li><a href=\"#\">Audio</a></li>\r\n" + 
"<li><a href=\"#\" >Video</a></li>");
         }
         else if(line.contains("&heading")){
            outputStream.println("<h2>"+"PDF Files"+"<"+"/"+"h2>");
         }
         else{outputStream.println(line);}
         line = inputStream.readLine();
     }
     outputStream.close();
     inputStream.close();
    
    }
    catch(FileNotFoundException e)
    {
      System.out.println("Problem opening files.");
    }
    catch(IOException e)
    {
      System.out.println("Error reading from original.txt."); 
    }
     
     
  }

  
 
}