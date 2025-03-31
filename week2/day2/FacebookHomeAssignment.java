package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookHomeAssignment {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Sidheswari");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Balaji");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8072751104");
		
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("sidhubalaji");
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select dayOption = new Select(day);
		dayOption.selectByVisibleText("28");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select monthOption = new Select(month);
		monthOption.selectByVisibleText("Dec");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select yearOption = new Select(year);
		yearOption.selectByVisibleText("1998");
		
		driver.findElement(By.className("_8esa")).click();
		
		//driver.close();

	}

}
