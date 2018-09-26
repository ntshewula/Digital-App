import java.util.Scanner;
import java.util.Date;

public class XMLGenerator
{
   private Image image;
   private String name;
   private double size;
   private Date date; 
     
   public void assignValues(){
      this.name = image.getName();
      this.size = image.getSize();
      this.date = image.getDate();   
   }

   public void ReadXML(String DefaultFile ){
      //Implement ReadXML assign values
   }
   
   
   
}