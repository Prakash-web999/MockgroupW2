package org.logical_program;

import java.util.Scanner;

public class find_factoral_user_given_number 
{    
	public static void main(String[] args) 
	{
		
     /*find fact user given number
     * eg 5--->5*4*3*2*1=120
     */
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number ");
		int a=sc.nextInt();
		long b=1;
		for(int i=a; i>=1; i--)
		{
			b=b*i;
		}
		System.out.println(b);
		
	     
		 
		
		
	}
	
}
