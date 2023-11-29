package IMDB.Movies;


public class ReverseStringTest {

	public static void main(String[] args) {
		
		int num1=0;
		int num2=1;
		int count =10;
		
		for (int i = 0; i < count; i++) {
			
			int num3 = num1+num2;
			num1=num2;
			num2=num3;
			System.out.println("the series is " + num3);
			
		}


	}

}
