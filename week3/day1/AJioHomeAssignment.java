package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AJioHomeAssignment {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Launch the URL https://www.ajio.com/
		driver.get(" https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// In the search box, type as "bags" and press enter
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		driver.findElement(By.xpath("//button[@class='rilrtl-button']")).click();
		//- To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		// Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		// - Print the count of the items found
		String noOfItems = driver.findElement(By.xpath("//div[@class='length']/strong")).getText();
		System.out.println("Total No. of Items : "+noOfItems);
		// Get the list of brand of the products displayed in the page and print the list
		List<WebElement> brand = driver.findElements(By.xpath("//div[@class='brand']/strong"));
		int sizeOfBrand = brand.size();
		List<String> brandStrings = new ArrayList<String>();
		for (int i = 0; i < sizeOfBrand; i++) {
			String textOfBrand = brand.get(i).getText();
			brandStrings.add(textOfBrand);
		}
		System.out.println("The List of Brands : "+brandStrings);
		// Get the list of names of the bags and print it
		List<WebElement> bag = driver.findElements(By.xpath("//div[@class='nameCls']"));
		int sizeOfBag = bag.size();
		List<String> bagNames = new ArrayList<String>();
		for (int i = 0; i < sizeOfBag; i++) {
			String textOfBag = bag.get(i).getText();
			bagNames.add(textOfBag);
		}
		System.out.println("The List of Bag Names : "+bagNames);
		driver.close();
	}

}
