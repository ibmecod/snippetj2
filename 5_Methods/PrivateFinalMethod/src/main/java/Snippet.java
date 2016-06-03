
class Base {
 private final void foo() {}
}

class Derived extends Base {
 public void foo() {} 
}
public class Snippet {

	public static void main(String[] args) {
		Base b = new Derived();
		//b.fun(); private and final are same as it is still not available to be override

	}

}
