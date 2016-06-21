import java.util.ArrayList;
import java.util.Iterator;
 
public class Snippet {
 
  public static void main(String args[]){
    ArrayList<String> names = new ArrayList<String>();
    names.add("Chaitanya");
    names.add("Steve");
    names.add("Jack");
 
    Iterator<String> it = names.iterator();
 
    while(it.hasNext()) {
      String obj = (String)it.next();
      System.out.println(obj);
    }
  }
 
}