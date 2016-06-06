public class Snippet {
	public static void main( String[] args ) {
		
		String helloString = "HELLO";
		System.out.println( helloString );

		int len = helloString.length( );
		System.out.println( len );
		
	    System.out.println( helloString.toLowerCase( ) );
		System.out.println( helloString.indexOf('L', 3 ) );

	
		String helloWorldString = helloString.concat( " WORLD" );
		System.out.println( helloWorldString );
		

	}
}