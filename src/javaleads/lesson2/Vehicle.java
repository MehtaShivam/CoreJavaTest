package javaleads.lesson2;

public abstract class Vehicle{
	private String type;
	private int capacity;
	
	
	abstract void runVehicle();
	
	public void printVehicleDetails() {
		System.out.println(this.type + ", " + this.capacity);
	}
}
