package org.logical_program;

import java.util.Scanner;

public class Find_last_middle_and_first_number_given 
{
     public static void main(String[] args) 
     {   
    	 Scanner sc=new Scanner(System.in);
    	 System.out.print("Enter Number is :- ");
    	 int a=sc.nextInt();
         int sum=0;
         for(int i=a; i>0; i=i/10)
         {
         	int rem=i%10;
         	sum=sum+rem*rem*rem;  //
         }
         
         
         if(a==sum)
         {
         	System.out.println("Given number is armstrong");
         }
         else
         {
         	System.out.println("Given number is not armstrong");
         }
         
        
	}
}
