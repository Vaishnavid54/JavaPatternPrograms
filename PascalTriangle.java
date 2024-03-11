package com.pattern;

public class PascalTriangle {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<=5-i;j++)
			{
				System.out.print(" "); 
			}
			int k=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k=k*(i-j)/j;
			}
			System.out.println();
		}
	}
}
