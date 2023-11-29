package IMDB.Movies;

public class StarPattern {

	public StarPattern() {
		System.out.println("constructor called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StarPattern s =new StarPattern();
		
		for(int i=1;i<5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				
				System.out.print("*");
				
				
			}
			System.out.println("");
		}
		

	}

}
