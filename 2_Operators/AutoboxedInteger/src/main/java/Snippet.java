
//In Java, values from -128 to 127 are cached, so the same objects are returned.
//The implementation of valueOf() uses cached objects if the value is between -128 to 127.
public class Snippet {

	public static void main(String[] args) {
		int a = 40;
		int b = 40;
		Integer c = 200;
		Integer d = 200;
		if(c==d)
			System.out.println("Equal");
		else
			System.out.println("Not equal");
	}

}
