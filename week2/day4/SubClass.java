package week2.day4;

public class SubClass extends SuperClass{

	public void takeSnap() {
		super.takeSnap();
		System.out.println("Sub Class takeSnap Method exceuted");
	}
	
	public static void main(String[] args) {
		
		SubClass obj = new SubClass();
		
		obj.takeSnap();

	}

}
