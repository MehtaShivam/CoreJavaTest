package com.exam.exceptions;

public class NumberTooLargeException extends Exception {
	NumberTooLargeException(){
		super("Number is too large");
	}
}
