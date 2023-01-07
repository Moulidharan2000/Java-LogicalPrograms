package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = scan.nextInt();
		int temp = num;
		int rev = 0;			
			
		while(num != 0) {
			int rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
				
		System.out.println("Given Number : "+temp);
		System.out.println("Reversed Number : "+rev);
	}
}
