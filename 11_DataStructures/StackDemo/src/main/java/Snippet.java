import java.util.*;

public class Snippet {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		
		System.out.println("After push" + stack);
		System.out.println("The top element is : " + stack.peek());
		System.out.println("Is the stack empty: " + stack.isEmpty());
		
		stack.pop();
		System.out.println("After pop" + stack);
		System.out.println("Size of stack:" + stack.size());

	}

}
