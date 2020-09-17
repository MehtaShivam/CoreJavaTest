package javaleads.lesson2;

public class Car extends Vehicle {
	private int engineCount;
	
	public Car() {
		engineCount = 1;
	}
	
	public void printVehicleDetails() {
		super.printVehicleDetails();
		System.out.println(this.engineCount);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car audi = new Car();
		audi.printVehicleDetails();
		audi.runVehicle();
	}
	
	@Override
	void runVehicle() {
		// TODO Auto-generated method stub
		System.out.println("Car is running");
	}

}
