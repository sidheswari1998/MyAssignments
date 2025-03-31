package week2.day3;
//           parent
public class Vehicle {
	
	//applyBrake
	//applyAccelerate
	
	public void applyBrake() {
		System.out.println("Brake Applied");

	}
	
	public void applyAccelerate() {
		System.out.println("Accelerated");

	}
	
	public static void main(String[] args) {
		Vehicle vehicleOptions=new Vehicle();
		vehicleOptions.applyAccelerate();
		vehicleOptions.applyBrake();
	}

}