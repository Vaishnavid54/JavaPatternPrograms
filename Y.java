package com.numberPattern;

public class Y {
	
	public static void main(String[] args) {
		
		//for upper pattern 
		
		for(int i=1;i<=5;i++)
		{
			//prints space
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			//prints number pattern
			for(int j=i;j<=5;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println(); //next line
		}
		//lower pattern
		
		for(int i=5;i>=1;i--)
		{
			//spaces
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			//print number pattern 
			for(int j=i;j<=5;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();  //next line
		}
	}
}
