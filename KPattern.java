package com.pattern;

public class KPattern {
	
	public static void main(String[] args) {
		
		//upper part of k 
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();//next line
		}
		//lower part of k
		
		for(int i=2;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
