
public class Snippet<T> {
	
	private T t;
	public void set(T t)
	{
		this.t=t;
	}
	public T get()
	{
		return t;
	}
	
	public static void main(String[] args) {
		
		GenericClass<Integer> intclass = new GenericClass<Integer>();
		intclass.set(4);
		System.out.println(intclass.get());
	}

}
