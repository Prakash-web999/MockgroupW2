package org.logical_program;

public class Multiplication_without_multiplication_operator 
{
   public static void main(String[] args) 
   {
	
	   int a=2;  //2*3*2=12
	   int b=3;
	   int c=2;
	  int sum=0;
	  
	  for(int i=1; i<=b; i++)
	  {
		  sum=sum+a;
		  if(sum==6)
			  for(int j=1; j<=b; j++)
			  {
				  sum=sum+c;
			  }
	  }
	  System.out.println(sum);
  }
}
