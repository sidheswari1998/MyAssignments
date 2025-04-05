package week3.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonActionsHomeAssignment {

	public static void main(String[] args) throws IOException {
		//Launch Chrome
		ChromeDriver driver = new ChromeDriver();
		//Maximize window
		driver.manage().window().maximize();
		//Load url
		driver.get("https://www.amazon.in/");
		//add  implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Search for "oneplus 9 pro"
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//Get the price of the first product
		String firstProductPrice = driver.findElement(By.xpath("//span[@class='a-price-whole'][1]")).getText();
		System.out.println("Price of the First Product : "+firstProductPrice);
		// Print the number of customer ratings for the first displayed product.
		String firstProductRatings = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text'][1]")).getText();
		System.out.println("Number of Customer Ratings for the First Product : "+firstProductRatings);
		//Click the first text link of the first image.
		driver.findElement(By.xpath("//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal'][1]")).click();
		//Take a screenshot of the product displayed.
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> allWindows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(allWindows.get(1));
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Snaps/amazon.png");
		FileUtils.copyFile(source, destination);
		//Click the 'Add to Cart' button
		WebElement addToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		//Actions act = new Actions(driver);
		//act.scrollToElement(addToCart).perform();
		addToCart.click();
		//Get the cart subtotal and verify if it is correct
		String price = driver.findElement(By.className("a-price-whole")).getText();
		String subtotal = driver.findElement(By.xpath("//span[@class='ewc-subtotal-amount']/h2")).getText();
		if (subtotal.contains(price)) {
			System.out.println("Price was Same as Shown");
		} else {
			System.out.println("Price was NOT Same");
		}
	}

}
