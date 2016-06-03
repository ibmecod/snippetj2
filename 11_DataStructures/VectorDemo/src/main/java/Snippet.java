import java.util.Vector;
import java.util.*;
public class Snippet {

	public static void main(String[] args) {
		
		Vector vector = new Vector(3,2);
		
		System.out.println("Initial size: "+vector.size());
		System.out.println("Initial capacity: "+vector.capacity());
		
		vector.addElement(new Integer(1));
		vector.addElement(new Integer(2));
		vector.addElement(new Double(3.0));
		vector.addElement(new Double(4.0));
		
		System.out.println("Size after addition: "+vector.size());
		System.out.println("Capacity after addition: "+vector.capacity());
		
		Enumeration enumerator = vector.elements();
		System.out.println("The elements in the vectors are: ");
		while(enumerator.hasMoreElements())
			System.out.print(enumerator.nextElement() + " ");
	}

}
