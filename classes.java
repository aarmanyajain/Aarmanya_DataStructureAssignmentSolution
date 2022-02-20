package aarmanyaa;
import java.util.Scanner;
public class classes {
	
	

	public class driver {
		
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);


			System.out.println("Enter the total no of floors in the building");
			int totalCompanies = scan.nextInt();
			
			Distinct[] d = new Distinct[totalCompanies];
			for(int i = 0; i< totalCompanies; ++i) {
				
				int price;
			//	Boolean isPriceRose;
					
				System.out.println("Enter the floor size given on day : " + (i+1));
				price = scan.nextInt();
			}
			
		
			
				
			
			System.out.println("The order of construction is as follows ");
	}
	}
	class Distinct{
		
	    public Double price;
	//	public Boolean isPriceRose;
	}

}

