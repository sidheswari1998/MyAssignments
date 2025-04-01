package week3.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert confirmAlert = driver.switchTo().alert();
		String text = confirmAlert.getText();
		System.out.println("Text shown : "+text);
		confirmAlert.accept();
		//confirmAlert.dismiss();
	}

}
