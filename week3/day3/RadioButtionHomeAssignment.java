package week3.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtionHomeAssignment {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Select 'Your most favourite browser' from the radio buttons
		driver.findElement(By.xpath("//label[text()='Chrome']/preceding-sibling::div")).click();
		//Click on a radio button, then click on the same radio button again to verify that it becomes ‘unselected’
		WebElement chennai = driver.findElement(By.xpath("//label[text()='Chennai']/preceding-sibling::div"));
		chennai.click();
		chennai.click();
		if (chennai.getAttribute("class").contains("ui-state-active")) {
			System.out.println("The Radio Button is selected");
		} 
		else {
			System.out.println("The Radio button is UnSelected");
		}
		//Identify the radio button that is initially selected by default
		String defaultRadio = driver.findElement(By.xpath("(//div[contains(@class,'ui-state-active')]//parent::div/following-sibling::label)[5]")).getText();
		System.out.println("Default selected radio button : "+defaultRadio);
		//Check and select the age group (21-40 Years) if not already selected
		WebElement ageGroup = driver.findElement(By.xpath("//label[text()='21-40 Years']/preceding-sibling::div/div[2]"));
		if (ageGroup.getAttribute("class").contains("ui-state-active")) {
			System.out.println("The group (21-40 Years) radio button was selected");
		} else {
			System.out.println("The group (21-40 Years) radio button was NOT selected");
			ageGroup.click();
			
		}
	}

}
