package week2.day4;

public class SuperClass {

	public void takeSnap() {
		System.out.println("Super Class takeSnap method exceuted");

	}
	
	public void reportStep() {
		System.out.println("Report Step method exceuted");

	}
	public static void main(String[] args) {
		SuperClass obj = new SuperClass();
		obj.takeSnap();
		obj.reportStep();

	}

}
