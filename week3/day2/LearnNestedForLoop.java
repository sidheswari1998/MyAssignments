package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedForLoop {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		//Load the Url
		driver.get("https://leafground.com/frame.xhtml");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.switchTo().frame(2);
		
		
		driver.switchTo().frame("frame2");
		
		
		driver.findElement(By.id("Click")).click();
		
		
		//defaultContent
	    driver.switchTo().defaultContent();
		
	    //parentFrame
	    driver.switchTo().parentFrame();
		
	}

}