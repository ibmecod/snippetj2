
import java.lang.reflect.Array;
import java.util.Arrays;

public class Snippet {

	public static void main(String[] args) {
		int arr1[] = {1, 2, 3};
		int arr2[] = {1, 2, 3};
		if(arr1==arr2)
			System.out.println("Equal");
		else
			System.out.println("Not equal");
		
		//Equal
		if(arr1.equals(arr2))
				System.out.println("Equal");
			else
				System.out.println("Not equal");
		
		//Array.equal
		if(Arrays.equals(arr1, arr2))
			System.out.println("Equal");
		else
			System.out.println("Not equal");
		//deepArray
		Object[] x = {arr1};
		Object[] y = {arr2};
		if(Arrays.equals(x, y))
			System.out.println("Equal");
		else
			System.out.println("Not equal");
		//deepEqual
		if(Arrays.deepEquals(x, y))
			System.out.println("Equal");
		else
			System.out.println("Not equal");
	}

}
