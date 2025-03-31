package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url  (.get)
		driver.get("https://www.facebook.com/");
		
		//To maximize the browser
		driver.manage().window().maximize();
		
		//To close the browser
		driver.close();
	}

}