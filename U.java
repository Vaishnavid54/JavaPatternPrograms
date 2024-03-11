package com.numberPattern;

public class U {
	
	public static void main(String[] args) {
		
		int n= 5;
		
		for(int i=5;i>=1;i--)
		{
			//printing spaces
			
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			//printing numbers
			
			for(int j=i;j<=5;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();//next line
		}
	}
}
