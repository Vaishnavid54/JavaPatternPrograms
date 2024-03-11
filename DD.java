package com.numberPattern;

public class DD {
	
	public static void main(String[] args) {
	
		//printing pattern
		
		for(int i=1;i<=5;i++)
		{
			int n = i;
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(n+"   ");
				n++;   //incrementing n by 1 till loop
			}
			System.out.println();  //next line
		}
	}
}
