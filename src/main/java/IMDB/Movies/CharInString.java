package IMDB.Movies;

import java.util.HashSet;
import java.util.Set;

public class CharInString {

	public static void main(String[] args) {
		
		String name="Kairavkkkiiivvv";
		System.out.println(name.length());
		char[] ch = (name).toCharArray();
		char duplicate;
		
		System.out.println("char lenght " +ch.length);
		
		for(Character i=0;i<name.length();i++)
		{
			for(int j=i+1;j<name.length();j++)
			{
				if( name.charAt(i)==name.charAt(j))
				{
					 Set<Character> s = new HashSet<Character>();
					 s.add(i);
					 for (Character string : s) {
						 
					    	System.out.println(string);
						}
					 //System.out.println(s);
//					if(duplicate==name.charAt(i))
//					{
//						duplicate = name.charAt(i);
						//System.out.println("Its repepted "+name.charAt(i));
//					}
					
				}
			}
		}

		System.out.println("no repeted letter");
		

	}

}
