package org.logical_program;

public class Multiplication_without_multiplication_operator1 
{
  public static void main(String[] args) 
  {
	int a=4;  //5*3*5
	int b=3;
	int c=5;
	int sum=0; int sum1=0;
	  for(int i=1; i<=b; i++)
	  {
		  sum=sum+a;
		  if(i>=b)
			  for(int j=1; j<=c; j++)
			  {
				    sum1 =sum1+sum;
			  }
		  
	  }
	  System.out.println(sum1);
  }
}
