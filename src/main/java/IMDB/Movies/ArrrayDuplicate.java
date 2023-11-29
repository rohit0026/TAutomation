package IMDB.Movies;

public class ArrrayDuplicate {

	public static void main(String[] args) {
		int[] a = new int[5];
		a[0]=10;  
		a[1]=20;  
		a[2]=70;  
		a[3]=40;  
		a[4]=50; 
		
		//another way
		int b[]= {1,2,3,4,5};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				if(a[i]==b[j])
				{
					System.out.println("duplicate" +i);
				}
			}
		}
		
		

	}

}
