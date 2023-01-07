package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = scan.nextInt();
		boolean isPrime = true;
		for(int i=2; i<=num/2; i++) {
			if(num%i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime == true)
			System.out.println(num+" is a Prime Number");
		else
			System.out.println(num+" is not a Prime Number");
	}
}
