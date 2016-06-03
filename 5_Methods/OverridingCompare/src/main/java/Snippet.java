class Test{
	int x, y;
	Test(int a, int b){
		this.x = a;
		this.y = b;
	}
}

public class Snippet {

	public static void main(String[] args) {
		Test t1 = new Test(10, 20);
		Test t2 = new Test(10, 20);
		if(t1==t2)
			System.out.println("Equal"); 
		else
			System.out.println("Not equal"); // Not eqaul result as it refer to diff obj
	}

}
