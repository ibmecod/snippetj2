
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Snippet {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("greek");
		Matcher match = pattern.matcher("greekforgreek");
		while(match.find())
			System.out.println("start: "+match.start() + " end: "+match.end());
	}

}
