package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonHomeAssignment {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Click on the button with the text ‘Click and Confirm title.’
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		//Verify that the title of the page is ‘dashboard.’
		String pageTitle = driver.getTitle();
		System.out.println("Page Title : "+pageTitle);
		if (pageTitle.equals("Dashboard")) {
			System.out.println("Page Title was "+pageTitle);
		} else {
			System.out.println("Page Title was NOT "+pageTitle);
		}
		//Go back to previous loaded page
		driver.navigate().back();
		//Check if the button with the text ‘Confirm if the button is disabled’ is disabled
		boolean displayed = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		System.out.println("Confirm if the button is disabled : "+displayed);
		//Find and print the position of the button with the text ‘Submit.’
		Point location = driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
		System.out.println("Location of Submit button : "+location);
		//Find and print the background color of the button with the text ‘Find the Save button color.’
		String cssValue = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background-color");
		System.out.println("Backgound color of 'Find the Save button color' : "+cssValue);
		//Find and print the height and width of the button with the text ‘Find the height and width of this button.’
		Dimension size = driver.findElement(By.xpath("//h5[text()='Find the height and width of this button']")).getSize();
		System.out.println("Size of 'Find the height and width of this button' : "+size);
		Dimension submitSize = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		System.out.println("Size of 'Find the height and width of this button' - Submit : "+size);
		driver.close();
	}

}
