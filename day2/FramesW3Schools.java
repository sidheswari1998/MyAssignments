package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesW3Schools {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Click the "Try It" button inside the frame
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		// Click OK/Cancel in the alert that appears
		Alert confirmAlert = driver.switchTo().alert();
		// Confirm the action is performed correctly by verifying the text displayed
		String text = confirmAlert.getText();
		System.out.println("Text shown in Try It Button : "+text);
		confirmAlert.accept();
		
		
	}

}
