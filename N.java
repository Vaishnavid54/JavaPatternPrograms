package com.numberPattern;

public class N {
	
	public static void main(String[] args) {
		int row=5;
		for(int i=1;i<=5;i++)
		{
			//for spaces
			for(int j=2*row-i;j>i;j--)
			{
				System.out.print(" ");
			}
			//for number pattern
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();//next line
		}
	}
}
