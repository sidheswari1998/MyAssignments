package week3.day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTheLinksInAWebpage {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		//Number of links
		int numberOfLinks = allLinks.size();
		System.out.println("Number of links is: "+numberOfLinks);
		
		//To print the Links - getText
		List<String> allStrings=new ArrayList<String>();
	    for (int i = 0; i < numberOfLinks; i++) {
			String text = allLinks.get(i).getText();     
			allStrings.add(text);
		}
       System.out.println("The List is: "+allStrings);
	}

}