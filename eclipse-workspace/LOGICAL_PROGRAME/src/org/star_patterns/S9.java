package org.star_patterns;

public class S9 {

	public static void main(String[] args) 
	{
		
	   
		
		int Star=1; int Star1=4;
		for(int i=1; i<=5; i++ )
		{   
			for(int l=1; l<=Star1; l++)
			{  
				System.out.print(" ");
			}
			for(int j=1; j<=Star; j++)
			{	
				System.out.print("*");
			}
		     System.out.println();
	        	Star++;
	        	Star1--;
		}
}
}
