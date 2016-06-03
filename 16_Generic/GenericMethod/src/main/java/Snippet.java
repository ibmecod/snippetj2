
public class Snippet {
	
	public static <E> void printArray(E[] input)
	{
		for(E item: input)
		{
			System.out.printf("%s", item + " ");
		}
		System.out.println(" ");
	}
	
	public static void main(String[] args) {
		Integer[] intarr = {1, 2, 3, 4, 5};
		Double[] doublearr = {1.0, 2.0, 3.0, 4.0};
		Character[] chararr = {'H', 'E', 'L', 'L', 'O'};
		
		System.out.println("Integer Array: ");
		printArray(intarr);
		
		System.out.println("Double Array: ");
		printArray(doublearr);
		
		System.out.println("Character Array: ");
		printArray(chararr);
	}

}
