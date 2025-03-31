package week2.marathon;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

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
		//Choose the item in the result (bags for boys)
		//Print the total number of results
		String results = driver.findElement(By.xpath("//span[contains(text(),'results for')]")).getText();
		String resultsName = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']")).getText();
		System.out.println("Total Results : " + results + " " + resultsName);
		//Select the first 2 brands in the left menu
		driver.findElement(By.xpath("(*//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[4]")).click();
		driver.findElement(By.xpath("(*//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[5]")).click();
		//Choose New Arrivals (Sort)
		driver.findElement(By.xpath("//span[@class='a-button a-button-dropdown a-button-small']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		//Print the first resulting bag info (name, discounted price)
		
		
	}

}
