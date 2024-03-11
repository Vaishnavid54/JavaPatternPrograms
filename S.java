package com.numberPattern;

public class S {
	
	public static void main(String[] args) {
		
		int n= 5;
		
		//printing pattern
		
		for(int i=1;i<=5;i++)
		{
			//printing space
			
			for(int j=1; j<n-i;j++)
			{
				System.out.print(" ");
			}
			//print numbers
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();//next line
		}
	}
}
