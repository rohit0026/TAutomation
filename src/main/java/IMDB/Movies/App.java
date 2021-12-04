package IMDB.Movies;

import org.apache.logging.log4j.core.pattern.RegexReplacement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String s = "i";
    	String name = "Rohit";
    	s = s.replaceAll("i", "iiiiiiiiiii");
    	s = s.replaceAll("i", name+ "\n");
    	System.out.println(s);
    	
    	
        System.out.println( "Hello World!" );
    }
}
