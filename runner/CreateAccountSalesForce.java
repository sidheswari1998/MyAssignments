package runner;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class CreateAccountSalesForce {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
        driver.findElement(By.id("password")).sendKeys("Sales@123");
        driver.findElement(By.id("Login")).click();
        driver.findElement(By.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']")).click();
        driver.findElement(By.xpath("//button[text()='View All']")).click();
        driver.findElement(By.xpath("//p[text()='Sales']/ancestor::a")).click();
        WebElement accounts = driver.findElement(By.xpath("//a[@title='Accounts']"));
        driver.executeScript("arguments[0].click()", accounts);
        driver.findElement(By.xpath("//a[@title='New']")).click();
        String accountName = "Sidheswari";
        driver.findElement(By.xpath("//label[text()='Account Name']/following::input")).sendKeys(accountName);
        WebElement ownershipDD = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
        driver.executeScript("arguments[0].click()",ownershipDD);
        WebElement ownership = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
        driver.executeScript("arguments[0].click()", ownership);
        WebElement dropdown = driver.findElement(By.xpath("//span[text()='Public']"));
        driver.executeScript("arguments[0].click()", dropdown);
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
        String toastMessage = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
        System.out.println(toastMessage);
        Assert.assertTrue(toastMessage.contains(accountName),"Verify the Account name");
    }

}
