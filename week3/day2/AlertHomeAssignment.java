package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHomeAssignment {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		// Click on the "Prompt Box" button to trigger the alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		// Switch to the alert and type a message in the alert box
		Alert promptAlert = driver.switchTo().alert();
		String message = "Sid";
		promptAlert.sendKeys(message);
		promptAlert.dismiss();
		// Retrieve the typed text from the alert and verify it
		String text = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(text);
		if (text.contains(message)) {
			System.out.println("Text passed correctly !");
		} else {
			System.out.println("Text passed failed");
		}
	}

}
