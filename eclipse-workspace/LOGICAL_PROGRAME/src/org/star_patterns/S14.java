package org.star_patterns;

public class S14 {

	public static void main(String[] args) 
	{
		//****
		//***
		//**
		//*
		      //2
		int Star=4;    //2<=4
		for(int i = 1; i<=4; i++)
		{                  //4<=3
			for(int j = 1; j<=Star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			Star--;
		}
	}

}
