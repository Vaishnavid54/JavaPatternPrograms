package com.numberPattern;

public class W {
	
	public static void main(String[] args) {
		
		for(int i=5;i>=1;i--)
		{
			//print spaces
			
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			//printing number pattern
			
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();//next line
		}
	}
}
