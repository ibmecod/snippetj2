
public class Snippet {
	
	public static void fun(){
		System.out.println("Overload 1");
	}
	public static void fun(int a){
		System.out.println(a);
		System.out.println("Overload 2");
	}
	public static void main(String[] args) {
		OverloadStaticMethod.fun();
		OverloadStaticMethod.fun(10);

	}

}
