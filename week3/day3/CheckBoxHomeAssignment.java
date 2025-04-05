package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxHomeAssignment {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Click on the "Basic Checkbox
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		//Click on the "Notification Checkbox."
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		//Verify that the expected message is displayed
		String message = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		System.out.println("Notification checkbox Message : "+message);
		if (message.contains("Checked")) {
			System.out.println("Expected message displayed");
		} else {
			System.out.println("Expected message NOT displayed");
		}
		//Click on your favorite language (assuming it's related to checkboxes)
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		//driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]")).click();
		//Click on the "Tri-State Checkbox."
		WebElement triState = driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[2]"));
		triState.click();
		//Verify which tri-state option has been chosen.
		if(triState.getAttribute("class").contains("ui-state-active")
				) {
			System.out.println("Tri-State Option was Selected");
		}
		else {
			System.out.println("Tri-State Option was NOT Selected");
		}
		//Click on the "Toggle Switch."
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		
		//WebElement toggle = driver.findElement(By.xpath("//span[text()='Checked']"));
		//driver.navigate().refresh();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement element = wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(toggle)));
		//String text = toggle.getText();
		//System.out.println("Toogle switch Text : "+text);
		//if (text.contains("Checked")) {
			//System.out.println("Expected Message Displayed");
		//} else {
			//System.out.println("Expected Message NOT Displayed");
		//}
		
		//Verify if the Checkbox is disabled
		WebElement disabledCheckbox = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']/div[2]"));
		if (disabledCheckbox.getAttribute("class").contains("ui-state-disabled")) {
			System.out.println("Check box was disabled");
		} else {
			System.out.println("Checkbox was enabled");
		}
		//Select multiple options on the page (details may be needed)
		driver.findElement(By.xpath("//div[@id='j_idt87:multiple']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Berlin')]/preceding-sibling::div/div[2]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Rome')]/preceding-sibling::div/div[2]")).click();
		//Perform any additional actions or verifications required
		driver.findElement(By.xpath("//div[@id='j_idt87:multiple']")).click();
		//driver.close();
	}

}
