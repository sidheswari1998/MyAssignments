package week2.day3;
//        childClass   extent   parentClass
public class Car extends Vehicle {
	
	
	public void applyHorn() {
		System.out.println("Apply Horn");

	}
	
	
	
	public static void main(String[] args) {
		
		Car carOptions=new Car();
		carOptions.applyBrake();
		carOptions.applyAccelerate();
		carOptions.applyHorn();
		
	}

}