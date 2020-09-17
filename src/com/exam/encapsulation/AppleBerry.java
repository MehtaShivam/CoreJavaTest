package com.exam.encapsulation;

public class AppleBerry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple apple = new Apple();
		PoisonBerry berry = new PoisonBerry();
		System.out.println(apple.isSweet());
		System.out.println(apple.isPoisonous());
		System.out.println(berry.isSweet());
		System.out.println(berry.isPoisonous());
	}

}
