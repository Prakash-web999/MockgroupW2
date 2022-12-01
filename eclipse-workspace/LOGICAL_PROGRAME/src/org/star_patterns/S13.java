package org.star_patterns;

public class S13 {

	public static void main(String[] args) 
	{   
		//*
		//***
		//*****
		//*******
		int Star=1;
		for(int i=1; i<=4; i++) // outerloop
		{                  //4<=3
			for(int j=1; j<=Star; j++) //inner loop
			{
				System.out.print("*");
			}
			System.out.println();
				Star=Star+2;
		}

	}

}
