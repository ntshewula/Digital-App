/**
* PDF class stores pdf data and a .html code of the pdf.
* @author  Anele Chila
* @version 1.0
* @since   2018 - 09 - 07
*/

import java.util.Date;

public class PDF
{
  
  private String name;
  private String type;
  private Date date;
  
  
  public PDF(String name, String type, Date date){
      this.name = name;
      this.type = type;
      this.date = date;    
  }
  
  public String getName(){
   return name;
  }
  
  public String getType(){
   return type;
  }
  
  /**
   * toString returns .html text of pdf
   * @return returns string as pdf html text
   */
  
  public Date getDate(){
   return date;
  }
  
  /**
   * toString returns .html text of image
   * @return returns string as pdf html text
   */

  public String toString(){
   return "<a target=\"_blank\" href=\"" + name + ".pdf\" >\r\n" + 
				"			<img src=\""+"pdf"+".png\" alt=\"pdf\" width=\"110\" height=\"110\">\r\n" + 
				"			<p><p>" + "Name: " + name +"\r\n"+"</p><p> Type: "+ type + "\r\n"+"</p><p> Date :" + date +"</p></p>\r\n" + 
				"		</a>\r\n" ;
  }

 
  
}