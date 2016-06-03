
import java.util.Enumeration;
import java.util.Vector;

public class Snippet {

	public static void main(String[] args) {

		Enumeration day;
		Vector days = new Vector();
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		days.add("Sunday");
		day = days.elements();
		while (day.hasMoreElements()){
			System.out.println(day.nextElement()); 
		}
	}

}
