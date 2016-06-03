class Base{
	Base()
	{
		System.out.println("Base:Constructor");
	}
	int i=10;
	void display()
	{
		System.out.println("Base:Display");
	}
}
class Derived extends Base{
	int i =100;
	public Derived() {
		super();
	}
	void display(){
		super.display();
		System.out.println(super.i);
	}
}
public class Snippet {

	public static void main(String[] args) {
		Derived der = new Derived();
		der.display();

	}

}
