package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadFunctionalityWithXPath {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver =new ChromeDriver();
				
		//Load the url
		driver.get("http://leaftaps.com/opentaps");
				
		//Maximize the window
		driver.manage().window().maximize();
				
				
		//To enter the username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
				
		//To enter the password
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
				
		//To Click the Login Button
		driver.findElement(By.xpath("//input[contains(@class,'dec')]")).click();
				
		//To Click CRMSFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//To click the Leads Link
		driver.findElement(By.xpath("//a[text()='Leads']"));
				
		//To Click the create lead link
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
				
		//To enter the username
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TL");
				
		//To enter the firstname
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Vineeth");
				
		//To enter the lastname
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Rajendran");
				
		//Click on the Submit button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

	}

}
