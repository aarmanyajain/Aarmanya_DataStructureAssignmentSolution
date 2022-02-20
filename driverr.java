package aarmanyaa;
import java.util.Scanner;

	public class driverr {
		
		
		int size = 5;
		static int[] floorsize =new int[size];
		
		for(int i=0;i < size; i++) 
		{
			System.out.println("day one"+(i+1)); //2,4,5
			floorsize(i);
			
		}
		
		int max=0; static int day=1;
		for(int i1=0;i<length-1;i++) 
		{
			if(floorsize[i]<floorsize[i+1]) {
				max=floorsize[i=1];
			}else{
				day=i+1;break;
			}
		}
		

			public static  void calculate(					)
			{
				int max=0;
				for (int i=day; i< day-1; i++)
				{
					if (floorsize[i]<(i+1))
					{
						max= floorsize(i+1);
						System.out.println("day 1"+i);					
					}else {
						day=i +1;
						break;
					}
						
						
				}
			}

			private static int floorsize(int j) {
				// TODO Auto-generated method stub
				return 0;
			}


		
	}}
