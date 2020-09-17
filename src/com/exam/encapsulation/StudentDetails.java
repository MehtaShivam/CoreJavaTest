package com.exam.encapsulation;

public class StudentDetails extends Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setStudentName("Jane Doe");
		student.setStudentAge(18);
		student.setDepartment("Computer Science");
		System.out.println(student.getStudentName());
		System.out.println(student.getStudentAge());
		System.out.println(student.getDepartment());
		
	}

}
