
import java.util.BitSet;

public class Snippet {

	public static void main(String[] args) {
		
		BitSet bit1 = new BitSet(16);
		BitSet bit2 = new BitSet(16);
		
		for(int i = 0 ; i < 16; i++)
		{
			if(i%2==0)
				bit1.set(i);
			if(i%2!=5)
				bit2.set(i);
		}
		System.out.println("Intial bit1: " + bit1);
		System.out.println("Intial bit2: " + bit2);
		bit2.and(bit1);
		System.out.println("AND: " + bit2);
		bit2.xor(bit1);
		System.out.println("XOR: " + bit2);
		bit2.or(bit1);
		System.out.println("OR: " + bit2);

	}

}
