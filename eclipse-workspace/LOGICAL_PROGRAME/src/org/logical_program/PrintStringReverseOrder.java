package org.logical_program;

public class PrintStringReverseOrder 
{
    public static void main(String[] args) 
    {
		String org="hsakarp";
		String rev="";
		
		for(int i=org.length()-1; i>=0; i--)
		{
			rev=rev+org.charAt(i);
		}
		System.out.println(rev);
		
	}
}
