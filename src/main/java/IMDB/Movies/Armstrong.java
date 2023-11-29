package IMDB.Movies;

public class Armstrong {

	public static void main(String[] args) {
		int num = 242;
		int temp = num;
		int rev=0;
		int last;
		
		while(num>0) {
			last = num%10;
			rev = rev*10+last;
			num=num/10;
			System.out.println(rev);
		}
		if(rev==temp)
		{
			System.out.println("ddd");
		}
		else {
			System.out.println("bbbb");
		}
		

	}

}
