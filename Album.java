/**
* Album stores the documents in an arrayList and passes them to temeplateGenerator class
* @author  Anele Chila
* @version 1.0
* @since   2018 - 09 - 07
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Date;


public class Album
{
   private List<Image> images = new ArrayList<Image>();
   private List<PDF> pdfs = new ArrayList<PDF>();
   
   
   public void setImage(String name, String size, Date date){
      images.add(new Image(name, size, date)); 
   }
   
   public void setPDF(String name, String type, Date date){
      pdfs.add(new PDF(name, type, date));
   }
   
   public List<Image> getImage(){
      return images;
   }
   
   public List<PDF> getPDF(){
      return pdfs;
   }
   
   public void arrayGenerator(){
      TemplateGenerator tg = new TemplateGenerator(getImage(),getPDF());   
   }
}