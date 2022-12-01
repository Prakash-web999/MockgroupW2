package org.star_patterns;

public class S4 {

	public static void main(String[] args) {
		for (int n=1; n<10; n += 2)
		{
		    for (int p=0; p < (4 - n / 2); p++)
		    {
		        System.out.print(" ");
		    }
		    for (int j=0; j<n; j++)
		    {
		        System.out.print("*");
		    }
		    System.out.println("");
		}

	}

}
