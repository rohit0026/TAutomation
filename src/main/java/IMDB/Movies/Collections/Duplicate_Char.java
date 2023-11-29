package IMDB.Movies.Collections;

import java.util.Iterator;

public class Duplicate_Char {

	public static void main(String[] args) {
		
		String name= "abccafaosfgjdnsdckdsn";
		for(int i=0;i<name.length();i++)
		{
			for(int j=i+1;j<name.length();j++)
			{
				if(name.charAt(i)==name.charAt(j))
				{
					System.out.println("Duplicate "+name.charAt(i));
				}
			}
		}

	}

}
