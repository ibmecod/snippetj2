
public class Snippet {

	public static void main(String[] args) {
		Object o1 = true ? new Integer(20): new Float(2.0);
		System.out.println(o1);
		Object o2;
		if(true)
			o2 = new Integer(20);
		else
			o2 = new Float(2.0);
		System.out.println(o2);
	}
}
