package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class DeleteLeadAssignment {

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
				
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				
				driver.findElement(By.xpath("//span[text()='Phone']")).click();
				
				//driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("91");
				
				driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("6379880835");
				
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
				//WebDriverWait wait = new WebDriverWait (driver, 10);
				WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(20));

				//WebElement leadId = wait.until(ExpectedConditions.visibilityOfElementLocated(
				//	    By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")));
				WebElement leadId = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
				String elementText = leadId.getAttribute("value");
				System.out.println(elementText);

	}

}
