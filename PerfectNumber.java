package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = scan.nextInt();
		long sum = 0;
		int i = 1;
		while(i<=num/2) {
			if(num % i ==0) {
				sum = sum+i;
			}
			i++;
		}
		if(sum == num)
			System.out.println(num+" is a Perfect Number");
		else
			System.out.println(num+" is not a Perfect Number");
	}
}
