package com.numberPattern;

public class R {
	
	public static void main(String[] args) {
		
		int n= 5;
		
		for(int i=1;i<=5;i++)
		{
			//printing space
			
			for(int j=1;j<n-i;j++)
			{
				System.out.print(" ");
			}
			//printing numbers
			
			for(int j=i;j<2*i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();//next line
		}
	}
}
