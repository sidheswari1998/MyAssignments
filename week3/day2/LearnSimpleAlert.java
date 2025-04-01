package week3.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSimpleAlert {

	public static void main(String[] args) {
	
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the Url
		driver.get("https://leafground.com/alert.xhtml");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Click on the show button
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		
		//Click on the Show button
		//driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		//To Handle the alert
		Alert simpleAlert = driver.switchTo().alert();
		
		//use the proper method
		simpleAlert.accept();

	}

}