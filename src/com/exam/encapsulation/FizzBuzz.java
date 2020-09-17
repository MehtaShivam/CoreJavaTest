package com.exam.encapsulation;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int input = keyboard.nextInt();
		
		for(int i = 1; i <= input; i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			}else if (i % 5 == 0) {
				System.out.println("Buzz");
			}else if (i % 3 == 0) {
				System.out.println("Fizz");
			}else {
				System.out.println(i);
			}
		}
	}

}
