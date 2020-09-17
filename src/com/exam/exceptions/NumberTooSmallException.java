package com.exam.exceptions;

public class NumberTooSmallException extends Exception{
	NumberTooSmallException(){
		super("Number is too small");
	}
}
