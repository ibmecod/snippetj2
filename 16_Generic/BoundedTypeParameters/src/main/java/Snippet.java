
public class Snippet {
	
	public static <T extends Comparable<T>> T maximum(T x, T y, T z)
	{
		T max = x;
		if(y.compareTo(max)>0)
			max = y;
		if(z.compareTo(max)>0)
			max=z;
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("The maxium value of 2, 3, 6 is: "+ maximum(2, 3, 6));

	}

}
	