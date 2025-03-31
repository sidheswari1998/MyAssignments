package week2.day3;

public class Audi extends Car {
	
	public void advancedBraking() {
		System.out.println("Braking");

	}
	
	public static void main(String[] args) {
		Audi audiOptions=new Audi();
		audiOptions.advancedBraking();
		audiOptions.applyHorn();
		audiOptions.applyAccelerate();
		audiOptions.applyBrake();
	}


}