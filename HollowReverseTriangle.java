package com.pattern;

public class HollowReverseTriangle {
	
	public static void main(String[] args) {
		
		for(int i=5;i>=1;i--)
		{
			//for spaces
			for(int j=i;j<5;j++)
			{
				System.out.print(" ");
			}
			//for stars
			 for(int j=1;j<=(2*i-1);j++)
			 {
				 if(j==1||i==5||j==(2*i-1))
				 {
					 System.out.print("*");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();//next line
		}
	}
}
