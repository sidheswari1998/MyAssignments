
package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSweetAlert {

	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the Url
		driver.get("https://omni.axisbank.co.in/axisretailbanking/");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("APPREGI")).click();
		
		driver.findElement(By.xpath("//input[@id='cust_id']")).sendKeys("123456789");
		
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		
		driver.findElement(By.xpath("//span[text()='OK ']")).click();
		
		
		
		

	}

}
