package org.logical_program;

import java.util.Arrays;

public class Compare_two_array_eqauls_or_not 
{
   public static void main(String[] args) 
   {
	  //Compare two array equals or not
	  int ar1[]= {10,20,30};
	  int ar2[]= {40,50,60};
	  int ar3[]= {40,50,90};
	  int ar4[]= {40,50,90};
	  
	  int ar5[]= {10,20,30,40,50};
	  
	  
	  System.out.println(Arrays.equals(ar1, ar2));
	  System.out.println(Arrays.equals(ar2, ar3));
	  System.out.println(Arrays.equals(ar4, ar3));
	  System.out.println(Arrays.equals(ar3, ar3));
	  System.out.println(Arrays.equals(ar5, ar1));



   }
}
