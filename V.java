package com.numberPattern;

public class V {
	
	public static void main(String[] args) {
		
		int n= 5;
		
		for(int i=5;i>=1;i--)
		{
			//for spaces
			
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			//print numbers
			
			for(int j=i;j<=5;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();  //next line
		}
	}

}
