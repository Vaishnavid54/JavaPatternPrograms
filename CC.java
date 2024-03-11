package com.numberPattern;

public class CC {
	
	public static void main(String[] args) {
		
		//printing pattern
		
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(i==j)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(0);
				}
			}
			System.out.println();//next line
		}
	}

}
