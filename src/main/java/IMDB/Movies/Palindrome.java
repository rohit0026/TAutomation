package IMDB.Movies;

public class Palindrome {

	public static void main(String[] args) {
		
		String text =  "abcdcba";
		int i=0;
		int j = text.length()-1;
		System.out.println(j);
		
		while(i<j)
		{
			if(text.charAt(i)!=text.charAt(j))
			{
				System.out.println("not palendrome");
			}
			i++;
			j--;
		}
		System.out.println("palindrome hai");
		
		//Integer Palendrome
		
		int num = 123;
		int rev=0;
		int temp=0;
		
		
		while(num>0)
		{
			temp = num%10;
			rev= (rev*10)+temp;
			num = num/10;
			
		}
		
//		if(num==temp)
//		{}
		System.out.println(temp);
		System.out.println(rev);
	}

}
