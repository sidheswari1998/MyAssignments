package week2.day3;

public class TestData {
	
	public void enterCredentials() {
		System.out.println("Enter Credentials");
	}
	
	public void navigateToHomePage() {
		System.out.println("Navigate to Home page");
	}

	public static void main(String[] args) {
		TestData obj = new TestData();
		obj.enterCredentials();
		obj.navigateToHomePage();
		
	}

}
