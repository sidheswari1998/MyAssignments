package week2.day4;

public class LoginPage extends BasePage{

	public void performCommonTasks() {
		super.performCommonTasks();
		System.out.println("Comman Task Performed in Sub Class");
	}
	
	public static void main(String[] args) {
		LoginPage login = new LoginPage();
		login.performCommonTasks();
		

	}

}
