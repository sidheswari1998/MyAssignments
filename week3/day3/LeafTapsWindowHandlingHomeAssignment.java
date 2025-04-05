package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsWindowHandlingHomeAssignment {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on the Login button
		driver.findElement(By.className("decorativeSubmit")).click();				
		//Click on the CRMSFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//- Click on the Contacts button
		driver.findElement(By.linkText("Contacts")).click();
		//Click on Merge Contacts
		driver.findElement(By.linkText("Merge Contacts")).click();
		//Click on the widget of the "From Contact"
		driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::img)[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> allWindows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(allWindows.get(1));
		driver.manage().window().maximize();
		//Click on the first resulting contact
		driver.findElement(By.xpath("//div[@class='x-grid3-body']//a")).click();
		//Back to parent window
		driver.switchTo().window(allWindows.get(0));
		//Click on the widget of the "To Contact"
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following::img")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> allWindows1 = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(allWindows1.get(1));
		driver.manage().window().maximize();
		//- Click on the second resulting contact.
		driver.findElement(By.xpath("//div[@class='x-grid3-row    x-grid3-row-alt']//a")).click();
		//Back to parent window
		driver.switchTo().window(allWindows.get(0));
		//Click on the Merge button.
		driver.findElement(By.linkText("Merge")).click();
		//- Accept the alert.
		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.accept();
		//Verify the title of the page
		String title = driver.getTitle();
		System.out.println("Title of Page : "+title);
		if (title.contains("Merge Contacts")) {
			System.out.println("Page Title displayed CORRECT.");
		} else {
			System.out.println("Page Title displayed  WRONG");
		}
	}

}
