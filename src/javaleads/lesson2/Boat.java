package javaleads.lesson2;

public class Boat extends Vehicle {
	private int engineCount;
	
	public Boat() {
		this.engineCount = 1;
	}
	
	public void printVehicleDetails() {
		System.out.println(this.engineCount);
		super.printVehicleDetails();
	}
	
	public static void main(String[] args) {
		Boat waverunner = new Boat();
		waverunner.printVehicleDetails();
		waverunner.runVehicle();

	}

	@Override
	void runVehicle() {
		// TODO Auto-generated method stub
		System.out.println("Boat is running!");
	}

}
