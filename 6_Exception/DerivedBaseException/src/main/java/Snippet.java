class Base extends Exception{
	
}
class Derived extends Base{
	
}
public class Snippet {

	public static void main(String[] args) {
		try{
			throw new Base();
			//throw new Derived();
		}
		catch(Base b){
			
		}
//		catch(Derived d){
//			
//		}
	}

}
