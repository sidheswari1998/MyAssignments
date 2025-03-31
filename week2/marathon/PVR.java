package week2.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVR {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.pvrcinemas.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Marina Mall')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']/span[text()='THE DOOR']")).click();
		
		driver.findElement(By.xpath("//span[text()='06:55 PM']")).click();
		
		driver.findElement(By.xpath("//button[@class='p-button p-component sc-dIUfKc iRVxoq bgColor filter-btn']/span")).click();
		
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		
		driver.findElement(By.xpath("//span[text()='15']")).click();

		driver.findElement(By.xpath("//span[@class='seat-current-pvr']")).click();
		
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		String seatInfo = driver.findElement(By.xpath("//h6[text()='Seat Info']")).getText();
		System.out.println(seatInfo);
		
		String seatType = driver.findElement(By.xpath("//p[text()='EXECUTIVE']")).getText();
		System.out.println("Seat Type : " + seatType);
		
		String seatNumber = driver.findElement(By.xpath("//div[@class='seat-number']")).getText();
		System.out.println("Seat Number : " + seatNumber);
		
		String seatAmount = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']//span")).getText();
		System.out.println("Grand Total : " + seatAmount);
		
		driver.findElement(By.xpath("//button[@class='sc-dQpIV kXNFEA btn-proceeded']")).click();
		
		driver.findElement(By.xpath("(//div[contains(@class,'cross-icon')])[2]")).click();
		
		System.out.println("Page Title : " + driver.getTitle());
		
		driver.close();
		
	}

}
