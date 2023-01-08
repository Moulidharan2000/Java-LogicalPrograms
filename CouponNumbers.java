package com.bridgelabz.logicalprograms;

import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {

	static void Coupon(char[] chars, int max, int randomNum) {

		StringBuffer sb = new StringBuffer();
		
		while(randomNum > 0) {
			sb.append(chars[randomNum % chars.length]);
			randomNum /= chars.length;
		}
		String couponCode = sb.toString();
		System.out.println("Coupon Code: "+couponCode);
	}
	
	public static void main(String[] args) {
			
		char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
		Random random = new Random();
		int max = 100000000;
		int randomNum = random.nextInt()*max;
		
		Coupon(chars, max, randomNum);
	}
}
