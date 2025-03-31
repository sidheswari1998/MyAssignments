package week2.day4;

public class MethodOverloadingStaticPolymorphism {
	
	public void reportStep(String msg, String status) {
		System.out.println(msg + " and " + status);

	}
	
	public void reportStep(String msg, String status, boolean snap) {
		System.out.println("Message : " + msg);
		System.out.println("Status : " + status);
		System.out.println("Snap status : " + snap);
	}

	public static void main(String[] args) {
		
		MethodOverloadingStaticPolymorphism obj = new MethodOverloadingStaticPolymorphism();
		
		obj.reportStep("Sent Message", "Success");
		obj.reportStep("Received Message", "Sucessful", false);
	}

}
