package week2.day4;

public class BasePage {

	public void findElement() {
		System.out.println("Find Element in Super class");

	}
	
	public void clickElement() {
		System.out.println("Click element in super class");
	}
	
	public void enterText() {
		System.out.println("Text entered in super class");
	}
	
	public void performCommonTasks() {
		System.out.println("Comman Tasks performed in Super Class");
	}
	
	public static void main(String[] args) {
		BasePage base = new BasePage();
		base.findElement();
		base.clickElement();
		base.enterText();
		base.performCommonTasks();
		
	}

}
