package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class StopWatch {
	
	static void Timer(long start, long stop, double elapsedTime) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Any Character to Start the Timer : ");
		char on = scan.next().charAt(0);
		start = System.currentTimeMillis();
		System.out.println("Start : "+start);
		System.out.print("Enter Any Character to Stop the Timer : ");
		char off = scan.next().charAt(0);
		stop = System.currentTimeMillis();
		System.out.println("Stop : "+stop);
		elapsedTime = (off - on)/1000.0;
		System.out.println(elapsedTime);
	}

	public static void main(String[] args) {
		
		long start = 0 , stop = 0;
		double elapsedTime = 0;
		
		Timer(start, stop, elapsedTime);
	}
}
