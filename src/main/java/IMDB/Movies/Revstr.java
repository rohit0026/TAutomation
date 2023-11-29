package IMDB.Movies;

public class Revstr {

	public static void main(String[] args) {
		
		String name = "RrrrrO";
		String result = "";
		char c = 0;
		
		for (int i = 0; i < name.length(); i++) {
			
//			if(Character.toLowerCase(c))
//			{
//				System.out.println();
//			}\\
			
			
			c = name.charAt(i);
			
		    Boolean aa = Character.isUpperCase(c);
		   
		    	System.out.println(aa);
		   
			result =  c + result;

		}
		
		System.out.println(result);
		

	}

}
