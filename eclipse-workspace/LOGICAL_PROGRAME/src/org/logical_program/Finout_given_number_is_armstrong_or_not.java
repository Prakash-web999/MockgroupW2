package org.logical_program;


public class Finout_given_number_is_armstrong_or_not 
{   
	public static void main(String[] args) 

    {
        int a=153;
        int sum=0;
        for(int i=a; i>=0; i=i/10)
        {
        	int rem=i%10;
        	sum=rem*rem*rem;  //
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
