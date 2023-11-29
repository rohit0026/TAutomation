package IMDB.Movies;

public class StringMorganStanley {

	public static void main(String[] args) {
		 String Source = "eat";
	     String Target = "ate";
	     int matchcount = 0;

	     for (int i=0;i<Source.length();i++)
	     {
	         char ch = Source.charAt(i);
	         
	         for (int j=0;j<Target.length();j++)
	         {
	             char ch2 = Target.charAt(j);
	             if(ch==ch2)
	             {
	                 System.out.println("matching");
	                 matchcount++;
	                 
	             }
	             else
	             {
	                  System.out.println("not matching");
	             }
	             
	             if(matchcount==Source.length())
	             {
	            	 System.out.println("Its possible to make word");
	             }
	             
	             
	         }
	         
	         
	     }

	}

}
