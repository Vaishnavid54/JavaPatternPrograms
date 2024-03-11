package com.numberPattern;

public class M {
	
	public static void main(String[] args) {
		
		int row=5;
		for(int i=5;i>=1;i--)
		{
			//for spaces
			for(int j=2*row-i;j>i;j--)
			{
				System.out.print(" ");
			}
			//for no pattern
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();//next line
		}
	}
}
