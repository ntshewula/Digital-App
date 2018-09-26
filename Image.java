/**
* Image class stores image data and a .html code of the image.
* @author  Anele Chila
* @version 1.0
* @since   2018 - 09 - 07
*/

import java.util.Date;

public class Image
{
  private String name;
  private String size;
  private Date date;
  
  
  public Image(String name, String size, Date date){
      this.name = name;
      this.size = size;
      this.date = date;    
  }
  
  /**
   * getName returns name of image
   * @return return image name
   */
  public String getName(){
   return name;
  }
  
  /**
   * getSize returns size of image
   * @return return image name
   */

  public String getSize(){
   return size;
  }
  
  /**
   * getDate returns date of image
   * @return return image date
   */

  public Date getDate(){
   return date;
  }
  
  /**
   * toString returns .html text of image
   * @return returns string as image html text
   */

  public String toString(){
   return "<a target=\"_blank\" href=\"" +name + ".jpg\" >\r\n" + 
				"			<img src=\"" +name + ".jpg\" alt=\"france\" width=\"110\" height=\"110\">\r\n" + 
				"			<p><p>" + "Name: " + name +"\r\n"+"</p><p> Size "+size + "\r\n"+"</p><p> Date :" + date +"</p></p>\r\n" + 
				"		</a>\r\n" ;
  }
  
  
}