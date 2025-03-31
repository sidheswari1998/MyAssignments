package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadFunctionality {
	
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
		
		//Click on the Leads links
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on Create Lead link
		WebElement findElement = driver.findElement(By.linkText("Create Lead"));
		findElement.click();
		
		//To enter the companyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TL");
		
		//To enter the firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");
		
		//To enter the lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
		
		//To handle the Dropdown
		//Step1: Find the element
		WebElement sourceElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//Step2: Create the Object for Select Class
		Select option = new Select(sourceElement);
		
		//Step3: Use the method(3 method) to Select the value
		//selectByIndex
		//option.selectByIndex(1);
		
		//selectByVisibleText
		//option.selectByVisibleText("Conference");
		
		//selectByValue
		option.selectByValue("LEAD_EMPLOYEE");
		
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select option1 = new Select(industry);
		option1.selectByValue("IND_HARDWARE");
		
		
		
		
		//Click the CreateLead button
		//driver.findElement(By.name("submitButton")).click();
		
		
		
		
		
		
				
		
	}

}
