
import java.io.*;

public class Snippet {

	public static void main(String[] args) {
		try {
			PrintStream file = new PrintStream(new File("a.txt"));
			PrintStream console = System.out;
			System.setOut(file);
			System.out.println("File output");
			System.setOut(console);
			System.out.println("Console output");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
