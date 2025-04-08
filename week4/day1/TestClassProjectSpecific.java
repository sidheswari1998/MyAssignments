package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestClassProjectSpecific extends ProjectSpecificMethod{

	@Test
	public void testMethod() {
		//Click View All and click Legal Entities from App Launcher
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		WebElement legalEntity = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		Actions act = new Actions(driver);
		act.moveToElement(legalEntity).click().perform();
		//Click on the Dropdown icon in the legal Entities tab
		//Click on New Legal Entity
		driver.findElement(By.xpath("//div[contains(text(),'New')]")).click();
		//Enter the Company name as 'TestLeaf'
		String name="TestLeaf";
		WebElement nameField = driver.findElement(By.xpath("(//input[@class='slds-input'])[2]"));
		nameField.sendKeys(name);
		//Enter Description as 'Salesforces'
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
		
		//Select Status as 'Active
		//WebElement status = driver.findElement(By.id("combobox-button-214"));
		//WebElement status = driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']"));
		//act.moveToElement(status).click().perform();
		
		//Click on Save
		driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click();
		String text = driver.findElement(By.xpath("//span[contains(@class,'toastMessage slds-text-heading--small forceActionsText')]")).getText();
		System.out.println("Alert displayed : "+text);
		//Verify the Alert message (Complete this field) displayed for Name
		String[] split = text.split(" ");
		//System.out.println(split[2]);
		if (split[2].contains(name)) {
			System.out.println("Same text was displayed");
		} else {
			System.out.println("Text was NOT Same");
		}

	}

}
