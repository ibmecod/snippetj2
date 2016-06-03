
public class Snippet {

	public static void main(String[] args) {
		final int[] arr1 = {1,2,3};
		System.out.println("value of (final)array changes");
		for(int i =0; i < arr1.length; i ++)
			System.out.println(arr1[i]*10);
		int[] arr2 = {3,4,5};
		System.out.println("Through Error as the reference can not be changed");
		//arr1= arr2;  this will throw error
	}

}
