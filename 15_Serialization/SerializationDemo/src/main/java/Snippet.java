
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	int id;
	public String name;
	public String address;
	public transient int ssn;
	public void mailCheck()
	{
		System.out.println("Mailing a check to " + name + " " + address);
	}
}
public class Snippet {

	public static void main(String[] args) {
		Employee e= new Employee();
		e.id = 123;
		e.name = "Sayantan";
		e.address ="Tempe";
		e.ssn = 9879;
		try
		{
			FileOutputStream fileOut =
					new FileOutputStream("/tmp/employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in /tmp/employee.ser");
		}catch(IOException i)
		{
			i.printStackTrace();
		}
		try
		{
			FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (Employee) in.readObject();
			in.close();
			fileIn.close();
		}catch(IOException i)
		{
			i.printStackTrace();
			return;
		}catch(ClassNotFoundException c)
		{
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}
		System.out.println();
		System.out.println("Deserialized Employee...");
		System.out.println("Name: " + e.name);
		System.out.println("Address: " + e.address);
		System.out.println("SSN: " + e.ssn);
		System.out.println("Number: " + e.id);
	}

}
