package org.star_patterns;

public class S12 {

	public static void main(String[] args) 
	{
		//*
		//***
		//*****
		//*******
		int Star=1;
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=Star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			Star=Star+2;
		}
		System.out.println("------------");
		
		int Star1=1; int Space=3;
		for(int i=1; i<=4; i++)
		{    for(int l=1; l<=Space; l++)
		       {
			System.out.print(" ");
         		}
			for(int j=1; j<=Star1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			Star1=Star1+2; Space--;
		}
	}

}
