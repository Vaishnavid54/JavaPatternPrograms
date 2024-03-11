package com.numberPattern;

public class FF {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==j)
				{
					System.out.print(j+" ");
				}
				else
				{
					System.out.print("*"+" ");
				}
			}
			System.out.println();//next line
		}
	}
}
