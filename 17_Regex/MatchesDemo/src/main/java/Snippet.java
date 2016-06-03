
import java.util.regex.Pattern;

public class Snippet {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("sayantan", "sayantan"));
		System.out.println(Pattern.matches("sayantan", "sayant^n"));

	}

}
