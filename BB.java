package com.numberPattern;

public class BB {
	
	public static void main(String[] args) {
		
		//printing pattern
		
		for(int i=1;i<=5;i++)
		{
			//printing spaces
			
			for(int j=1;j<5-i;j++)
			{
				System.out.print(" ");
			}
			//printing numbers
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();//next line
		}
	}
}
