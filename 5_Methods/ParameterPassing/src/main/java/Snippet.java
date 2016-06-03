
public class Snippet {
	public void swap(int a, int b){
		int temp;
		temp=a;
		b=a;
		a=temp;
	}
	public static void main(String[] args) {
		ParameterPassing prt = new ParameterPassing();
		int i =20, j =30;
		prt.swap(i, j);
		System.out.println("i: "+i + " j: "+j);

	}

}
