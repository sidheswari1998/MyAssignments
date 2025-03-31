package week2.day3;

public class TextField extends WebElement{
	
	public void  getText() {
		System.out.println("Get Text from User");
	}

	public static void main(String[] args) {

		TextField obj = new TextField();
		obj.getText();
		
	}

}
