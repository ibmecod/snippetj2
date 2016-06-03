//, static blocks are executed before constructors.
//static block is executed only once: the first time you make an object of that class
class Test{
	static int i;
	int j;
	static{
		i = 10;
		int j =20;
		System.out.println("Inside static block");
	}
	Test(){
		System.out.println("Inside constructor");
	}
}
public class Snippet {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(Test.i);
		

	}

}
