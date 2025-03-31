package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginFunctionality {

	public static void main(String[] args) {
		//To Launch the Edge browser
		//EdgeDriver driver1=new EdgeDriver();
		
		// Launch the Browser
		ChromeDriver driver= new ChromeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//To enter the username
		//To locate the element - findElement
		//To enter the username -sendKeys
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//To enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on the Login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		}
}