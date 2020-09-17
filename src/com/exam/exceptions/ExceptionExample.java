package com.exam.exceptions;
import java.util.*;

public class ExceptionExample {

	public static void main(String[] args) throws ZeroNumberException, NumberTooSmallException, NumberTooLargeException {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int input = keyboard.nextInt();
		
		try {
			if (input == 0) {
				throw new ZeroNumberException();
			}else if (input < 0 ) {
				throw new NumberTooSmallException();
			}else if (input > 1000) {
				throw new NumberTooLargeException();
			}else {
				System.out.println("Allocated Memory");
			}
			
		}catch (ZeroNumberException exp) {
			System.out.println(exp.getMessage());
			
		}catch (NumberTooSmallException exp) {
			System.out.println(exp.getMessage());
			
		}catch (NumberTooLargeException exp) {
			System.out.println(exp.getMessage());
			
		}
	}

}
