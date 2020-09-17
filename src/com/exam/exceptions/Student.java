package com.exam.exceptions;
import java.util.*;

public class Student {
	private String name;
	private int age;
	
	Student(int age, String name) throws AgeDoesNotMatchException{
		AgeDoesNotMatchException agematch = new AgeDoesNotMatchException();
		if ( 17 <= age && age <= 24) {
				throw agematch;
		}
		this.age = age;
		this.name = name;
	}
	public static void main(String[] args) throws AgeDoesNotMatchException{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the name of the Student:");
		
		String name = keyboard.nextLine();
		
		System.out.println("Enter the age of the Student:");
		
		int age = keyboard.nextInt();
		
		Student newStudent = new Student(age, name);
		
		
		
		
		
	}

}
