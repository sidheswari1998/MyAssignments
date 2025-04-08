package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
	
	public ChromeDriver driver;
	
	@BeforeMethod
	public void preCondition() {
		//Launch Chrome
		driver = new ChromeDriver();
		//Maximize window
		driver.manage().window().maximize();
		//Load the url 
		driver.get("https://login.salesforce.com/");
		//add  implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter username and password
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Test@2025");
		driver.findElement(By.id("Login")).click();
		//Click on the toggle menu button from the left corner
		driver.findElement(By.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']")).click();

	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}

}
