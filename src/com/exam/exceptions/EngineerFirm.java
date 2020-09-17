package com.exam.exceptions;

public class EngineerFirm implements Company {
	public int[] income;
	
	public EngineerFirm(int n) {
		this.income = new int[n];
	}

	@Override
	public void assignSalaries(int[] salaries) {
		// TODO Auto-generated method stub
		try {
			for(int i = 0; i < salaries.length; i ++) {
				this.income[i] = salaries[i];
			}
			}catch (IndexOutOfBoundsException exp) {
				System.out.print("Does not match");
			}
		}

	@Override
	public void averageSalary() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maxSalary() {
		// TODO Auto-generated method stub
		int maxSalary = 0;
		for (int i = 0; i < this.income.length; i++){
			if (this.income[i] > maxSalary) {
				maxSalary = this.income[i];
			}
		}
		System.out.println(maxSalary);
	}

	@Override
	public void minSalary() {
		// TODO Auto-generated method stub
		int minSalary = 999999999;
		
		for (int i = 0; i < this.income.length; i++){
			if (this.income[i] < minSalary) {
				minSalary = this.income[i];
			}
		}
		System.out.println(minSalary);
	}

}
