
import java.util.Enumeration;
import java.util.Hashtable;

public class Snippet {

	public static void main(String[] args) {
		
		Hashtable hashtable = new Hashtable();
		hashtable.put("Sayantan", 1);
		hashtable.put("Shaan", 2);
		hashtable.put("Priyanka", 3);
		hashtable.put("Dolly", 4.0);
		
		
		System.out.println("Printing hashtable: " + hashtable);
		
		Enumeration enumeration = hashtable.keys();
		System.out.println("Iterating hashtable: ");
		while(enumeration.hasMoreElements())
		{
			System.out.println(enumeration.nextElement());
		}
	}

}
