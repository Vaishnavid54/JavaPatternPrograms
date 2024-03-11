package com.numberPattern;

public class EE {
	
	public static void main(String[] args) {
		
		//initialize variable with 1
		
		int n= 1;
		
		//printing pattern
		
		for(int i=1;i<=5;i++)
		{
			//printing numbers
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(n+" ");
				n++;
			}
			System.out.println();//next line
		}
	}
}
