package com.numberPattern;

public class O {
	
	public static void main(String[] args) {
		
		for(int i=5;i>=1;i--)
		{
			//for spaces
			for(int j=2*5-i;j>i;j--)
			{
				System.out.print(" ");
			}
			//for no pattern
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
