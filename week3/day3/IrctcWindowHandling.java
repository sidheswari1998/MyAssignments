package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcWindowHandling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Load the IRCTC webpage and click on the "FLIGHTS" link
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> allWindows = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(allWindows.get(1));
		String titleOfChild = driver.getTitle();
		System.out.println("Title of Child : "+titleOfChild);
		
		// Close the parent tab (Train ticket booking) alone
		driver.switchTo().window(allWindows.get(0));
		String titleOfParent = driver.getTitle();
		System.out.println("Title of Parent : "+titleOfParent);
		driver.close();
	}

}
