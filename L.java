package com.numberPattern;

public class L {
	
	public static void main(String[] args) {
		
		int row=5;
		
		for(int i=1;i<=5;i++)
		{
			//for spaces
			for(int j=2*row-i;j>i;j--)
			{
				System.out.print(" ");
			}
			//number pattern
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();//next line
		}
	}
}
