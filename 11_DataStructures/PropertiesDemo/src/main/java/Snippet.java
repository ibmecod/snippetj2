import java.util.*;

public class Snippet {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		prop.setProperty("sayantan", "guha");
		prop.setProperty("priyanka", "majumder");
		prop.setProperty("shaan", "sharma");
		
		System.out.println("Printing propoerties: "+prop);
		Set s = prop.keySet();
		Iterator ir = s.iterator();
		System.out.println("Iterating Properties: ");
		while(ir.hasNext())
		{
			String str = (String)ir.next();
			System.out.println(str+" "+prop.getProperty(str));
		}

	}

}
