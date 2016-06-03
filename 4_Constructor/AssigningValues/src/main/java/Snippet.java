class Temp{
	public final int i;
	static final int j = 100; 
	
	
	public Temp() {
		i =10;
	}
}
public class Snippet {

	public  static void  main(String[] args) {
		Temp tmp = new Temp();
		System.out.println(tmp.i);
		System.out.println(tmp.j);
	}

}
