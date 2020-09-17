package javaleads.lesson1;

public class Vehicle {
	private String type;
	private int capacity;
	
	public Vehicle() {
		this.type = "Audi";
		this.capacity = 2;
	}
	
	public void printVehicleDetails() {
		System.out.println(this.type + ", " + this.capacity);
	}
	
	public void runVehicle() {
		System.out.println("The car is running");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle audi = new Vehicle();
		audi.printVehicleDetails();
		audi.runVehicle();

	}

}
