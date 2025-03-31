package week3.day1;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLnksInWebPage {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int sizeOfLink = allLinks.size();
		System.out.println("Total no. of links : "+sizeOfLink);
		List<String> allText = new ArrayList<String>();
		for (int i = 0; i < sizeOfLink; i++) {
			String text = allLinks.get(i).getText();
			allText.add(text);
		}
		System.out.println("The Links are : "+allText);
		driver.close();
	}

}
