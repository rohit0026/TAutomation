package IMDB.Movies;

public class ReverseNo {

	public static void main(String[] args) {
		
		int no = 2345;
		int rev=0;
		int lastdigit;
		
		while(no>0)
		{
			lastdigit= no%10;
			rev = rev*10+lastdigit;
			no=no/10;
		}
		
		System.out.println(rev);

	}

}
