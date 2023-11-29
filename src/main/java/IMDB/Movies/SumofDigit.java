package IMDB.Movies;

public class SumofDigit {

	public static void main(String[] args) {
		
    int no=123;
	int sum = 0,temp=0;
	while(no>0) {
		temp= no%10; // to get the last number 
		sum= sum+temp; // too add the last number to temp
		no=no/10; //to remove the last no.
		System.out.println(temp);
		
	}
	
	
	

	}

}
