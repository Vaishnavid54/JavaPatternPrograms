package com.pattern;

public class SolidRectangle {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) { //i is row - horizontal
			for(int j=1;j<=5;j++) { //j is column - vertical
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
