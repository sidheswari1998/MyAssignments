package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		// Launch the browser
				ChromeDriver driver =new ChromeDriver();
						
				//Load the url
				driver.get("http://leaftaps.com/opentaps");
						
				//Maximize the window
				driver.manage().window().maximize();
						
				//Enter the username
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
						
				//Enter the password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
						
				//Click on the Login button
				driver.findElement(By.className("decorativeSubmit")).click();
						
				//Click on the CRMSFA link
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				driver.findElement(By.className("x-panel-header")).click();
				
				driver.findElement(By.linkText("Create Account")).click();
				
				driver.findElement(By.id("accountName")).sendKeys("Sid");
				
				driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
				
				driver.findElement(By.id("numberEmployees")).sendKeys("1");
				
				driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
				
				driver.findElement(By.className("smallSubmit")).click();
				
				String title = driver.getTitle();
				if (title.contains("Account Details")) {
					System.out.println("Account Succesfully Created");
					
				} else {
					System.out.println("Account Creation Failed");

				}
				
				driver.close();
				
				

	}

}
