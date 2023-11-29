package IMDB.Movies;

public class NoToString {

	public static void main(String[] args) {
		//int arr[]= {1,2,3,4,5};
		String arr1[] = new String[5]; //given limit is 5 but we just added 3 values
		arr1[0]="1st ele";//so it was printing next 2 values as Null
		arr1[1]="2nd ele";
		arr1[2]="3rd ele";
		arr1[3]="4rd ele";
		arr1[4]="5rd ele";
		
		for(int i=0;i<arr1.length;i++)
		{
			
			for(int j=i;j<arr1.length;j++) {
				
				//System.out.println(arr1[j]);
				System.out.print("*");
			}
			System.out.println("break-----------");
		}
	

	}

}
