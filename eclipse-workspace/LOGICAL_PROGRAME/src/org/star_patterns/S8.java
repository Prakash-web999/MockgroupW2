package org.star_patterns;

public class S8 
{
	public static void main(String[] args) 
	{  
		//*****
		//****
	    //***
	    //**
	    //*
		int Star=5;
		for(int i=1; i<=5; i++ )
		{
			for(int j=1; j<=Star; j++)
			{	
				System.out.print("*");
			}
		     System.out.println();
	        	Star--;
	    }
	System.out.println("-----------------");
          	//*******
			//*****
		    //***
		    //*
	
	int Star1=7;
	for(int i=1; i<=5; i++ )
	{
		for(int j=1; j<=Star1; j++)
		{	
			System.out.print("*");
		}
	    
		System.out.println();
        	Star1=Star1-2;
        	
	}
	System.out.println("--------------");
	//*
	//***
	//*****
	//*******
	int Star2 = 1; 
	for(int i=1; i<=5; i++ )
	{
		for(int j=1; j<=Star2; j++)
		{	
			System.out.print("*");
		}
	    
		System.out.println();
        	Star2=Star2+2;
	 }
	
	}	
}

	
