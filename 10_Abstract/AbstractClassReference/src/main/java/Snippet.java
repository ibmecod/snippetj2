abstract class Test{
	abstract void fun();
}
class Derive extends Test{
	void fun()
	{
		System.out.println("inside derive");
	}
}
public class Snippet {

	public static void main(String[] args) {
		Derive dev = new Derive();
		dev.fun();

	}

}
