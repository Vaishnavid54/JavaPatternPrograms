package com.pattern;

public class DiamondPattern {
	public static void main(String[] args) {
		int n=4;
		//for Above part
		for(int i=1;i<=n;i++) {
			//spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//for first half
			for(int j=i;j>=1;j--) {
				System.out.print("*");
			}
			//for second  half
			for(int j=2;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		//for below part
		for(int i=n;i>=1;i--) {
			//spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//for first half
			for(int j=i;j>=1;j--) {
				System.out.print("*");
			}
			//for second  half
			for(int j=2;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
	}

}
