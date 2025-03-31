package week2.day3;

public class Button extends WebElement{
	
	public void submit() {
		System.out.println("Button pressed");
	}

	public static void main(String[] args) {
		
		Button obj = new Button();
		obj.submit();
		
	}

}
