package week3.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailAssignment {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//Launch the erail URL
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Enter "MAS" as the "From" station
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MAS");
		//Enter "MDU" as the "To" station.
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("MDU");
		//- Uncheck the "Sort on Date" checkbox
		driver.findElement(By.id("chkSelectDateOnly")).click();
		//Retrieve the train names from the web table
		String name = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/th[2]")).getText();
		System.out.println(name);
		
		List<WebElement> trainName = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]/a"));
		for (int i = 0; i < trainName.size(); i++) {
			String text = trainName.get(i).getText();
			System.out.println(text);
		}
	}

}
