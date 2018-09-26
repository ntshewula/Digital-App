/**
* Parent class for image and pdf
* @author  Anele Chila
* @version 1.0
* @since   2018 - 09 - 07
*/
import java.util.*;

public interface Document
{
   //get methods
   public String getName();
   public String getSize();
   public Date getDate();

   //set methods
   public void setName();
   public void setSize();
   public void setDate();
   

}