package com.exam.encapsulation;

public class Department {
	public String deptName;
	public int id;
	public String location;
	
	Department(){
		this.deptName = "Base";
		this.id = 0;
		this.location = "Virginia";
	}
	
	Department(String deptName, int id){
		this.deptName = deptName;
		this.id = id;
		this.location = "Virginia";
	}
	Department(String deptName, int id, String location){
		this.deptName = deptName;
		this.id = id;
		this.location = location;
	}
	
	public static void main(String[] args) {
		Department dept = new Department("Comp Sci", 2, "Virginia");
		System.out.println(dept.deptName);
		System.out.println(dept.id);
		System.out.println(dept.location);
		
	}
}
