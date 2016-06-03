class CC{
	int i , j;
	CC(int a){
		this.i = a;
	}
	CC(CC c){
		System.out.println("Inside Copy constructor");
	}
}
public class Snippet {

	public static void main(String[] args) {
		
		CC c = new CC(10);
		CC cc = new CC(c);
	}

}
