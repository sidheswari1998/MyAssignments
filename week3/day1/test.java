package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		//Launch Chrome
				ChromeDriver driver = new ChromeDriver();
				//Maximize window
				driver.manage().window().maximize();
				//Load url
				driver.get("https://www.amazon.in/");
				//add  implicitlyWait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//Type "Bags for boys" in the Search box
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
				driver.findElement(By.id("nav-search-submit-button")).click();

	}

}
