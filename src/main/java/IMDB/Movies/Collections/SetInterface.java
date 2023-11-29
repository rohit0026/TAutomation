package IMDB.Movies.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		s.add("ggg");
		s.add("ggg");
		s.add("ggg");
		
	    for (String string : s) {
		 
	    	System.out.println(string);
		}
		

	}

}
