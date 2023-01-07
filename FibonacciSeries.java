package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = scan.nextInt();
		int firstTerm = 0;
		int secondTerm = 1;
		for(int i=0; i<=num; i++) {
			System.out.print(firstTerm+", ");
			int nextTerm = firstTerm+secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}
