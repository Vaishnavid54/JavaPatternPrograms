package com.numberPattern;

public class K {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			//for first part
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			//for second part
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();//next line
		}
	}
}
