package com.numberPattern;

public class Q {
	
	public static void main(String[] args) {
		
		int n=5;
		//printing pattern
		
		for(int i=1;i<=5;i++)
		{
			//printing spaces
			
			for(int j=1;j<n-i;j++)
			{
				System.out.print(" ");
			}
			//print numbers 
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();//next line
		}
	}
}
