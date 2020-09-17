package com.exam.encapsulation;

public class PoisonBerry implements Fruit{
	
	@Override
	public boolean isSweet() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isPoisonous() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
