class SG{
	int i;
	SG(){
		i =0;
	}
	SG(int i){
		this.i =i;
	}
}
public class Snippet {

	public static void main(String[] args) {
		SG sg = new SG(5);
		change(sg);
		System.out.println(sg.i);
	}
	public static void change(SG t){
		t.i=10;
	}

}
