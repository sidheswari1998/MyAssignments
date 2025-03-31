package week2.day3;

public class LoginTestData extends TestData {
	
	public void enterUsername() {
		System.out.println("Enter Username");
	}
	
	public void enterPassword() {
		System.out.println("Enter Password");
	}

	public static void main(String[] args) {
		LoginTestData obj = new LoginTestData();
		obj.enterCredentials();
		obj.navigateToHomePage();
		obj.enterUsername();
		obj.enterPassword();
		
		
	}

}
