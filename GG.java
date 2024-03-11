package com.numberPattern;

public class GG {
	
	public static void main(String[] args) {
		
		int n= 1;
		
		for(int i=1;i<=5;i++)
		{
			if(i%2==0)
			{
				int value = n+i-1;
				
				for(int j=1;j<=i;j++)
				{
					System.out.print(value+"  ");
					value--;
					n++;					
				}
			}
			else
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(n+"  ");
					n++;
				}
			}
			System.out.println();
		}

	}
}
