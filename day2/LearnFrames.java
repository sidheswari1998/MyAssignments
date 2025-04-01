package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		        //Launch the browser
				ChromeDriver driver=new ChromeDriver();
				
				//Load the Url
				driver.get("https://leafground.com/frame.xhtml");
				
				//Maximize the browser
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				
				//Switching to frame
				driver.switchTo().frame(0);
				
				
				driver.findElement(By.id("Click")).click();

	}

}