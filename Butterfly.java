package com.pattern;

public class Butterfly {
	public static void main(String[] args) {
		int n=5;
		//UPPER PART
		for(int i=1;i<=n;i++) {
			//for first part stars
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			//for spaces
			int spaces=2*(n-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			//for second part stars
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//LOWER PART
				for(int i=n;i>=1;i--) {
					//for first part stars
					for(int j=1;j<=i;j++) {
						System.out.print("*");
					}
					//for spaces
					int spaces=2*(n-i);
					for(int j=1;j<=spaces;j++) {
						System.out.print(" ");
					}
					//for second part stars
					for(int j=1;j<=i;j++) {
						System.out.print("*");
					}
					System.out.println();
				}
	}
}

