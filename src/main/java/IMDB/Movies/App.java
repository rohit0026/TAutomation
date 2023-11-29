package IMDB.Movies;

public class App 
{
	
	 
	
	App() {
		System.out.println("constructor");
	}
	
	static { System.out.println("static block");}
	
    public static void main( String[] args )
    {
//    	String s = "i";
//    	String name = "Rohit";
//    	s = s.replaceAll("i", "iiiiiiiiiii");
//    	s = s.replaceAll("i", name+ "\n");
//    	System.out.println(s);
    	App a = new App();
   	    System.out.println( "Hello World! Manin" );
    }
}
