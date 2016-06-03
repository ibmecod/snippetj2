import java.util.*;
public class Snippet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();
		char sex = sc.next().charAt(0);
		double salary = sc.nextDouble();
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Sex:"+sex);
		System.out.println("Salary:"+salary);
	}

}
