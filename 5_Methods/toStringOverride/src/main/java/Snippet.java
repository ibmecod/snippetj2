
class Complex {  
    private double re, im;
 
    public Complex(int re, int im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public String toString() {
        return String.format(re + " + i " + im);
    }
}
 

public class Snippet {
	
	public static void main(String[] args) {
		Complex comp = new Complex(10, 20);
		System.out.println(comp);

	}

}
