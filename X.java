package com.numberPattern;

public class X {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			//prints space
			
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			//prints number pattern
			
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();  //next line
		}
	}
}
