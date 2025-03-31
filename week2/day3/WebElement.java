package week2.day3;

public class WebElement {

	public void  click() {
		System.out.println("Click done");
	}
	
	public void setText(String text) {
		System.out.println("Text entered : " + text);
	}
	
	public static void main(String[] args) {
		WebElement obj = new WebElement();
		obj.click();
		obj.setText("TEXT");
		
		
	}

}
