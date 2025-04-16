package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesforceCreateAccountStepDefinition {

	public ChromeDriver driver;
	String accountName = "Sidheswari";

	
	@Given("Launch the browser and load the url")
	public void launch_the_browser_and_load_the_url() {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://login.salesforce.com/");
	}
	@Given("Enter the username as vidyar@testleaf.com")
	public void enter_the_username_as_vidyar_testleaf_com() {
        driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
	}
	@Given("Enter the password as Sales@123")
	public void enter_the_password_as_sales() {
        driver.findElement(By.id("password")).sendKeys("Sales@123");
	}
	@Given("Click on the Login button and It should navigate to the next page")
	public void click_on_the_login_button() {
        driver.findElement(By.id("Login")).click();
        System.out.println("Navigated to the next page");
	}
	@When("Click on the toggle menu")
	public void click_on_the_toggle_menu() {
        driver.findElement(By.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']")).click();
	}
	@When("Click on the View All")
	public void click_on_the_view_all() {
        driver.findElement(By.xpath("//button[text()='View All']")).click();
	}
	@When("Click on the Sales link from App launcher")
	public void click_on_the_sales_link_from_app_launcher() {
        driver.findElement(By.xpath("//p[text()='Sales']/ancestor::a")).click();
	}
	@When("Click on the Accounts tab")
	public void click_on_the_accounts_tab() {
        WebElement accounts = driver.findElement(By.xpath("//a[@title='Accounts']"));
        driver.executeScript("arguments[0].click()", accounts);
	}
	@When("Click on the New button")
	public void click_on_the_new_button() {
        driver.findElement(By.xpath("//a[@title='New']")).click();
	}
	@When("Enter your name as account name")
	public void enter_your_name_as_account_name() {
        driver.findElement(By.xpath("//label[text()='Account Name']/following::input")).sendKeys(accountName);
	}
	@When("Select Ownership as Public")
	public void select_ownership_as_public() {
		WebElement ownershipDD = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
        driver.executeScript("arguments[0].click()",ownershipDD);
        WebElement ownership = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
        driver.executeScript("arguments[0].click()", ownership);
        WebElement dropdown = driver.findElement(By.xpath("//span[text()='Public']"));
        driver.executeScript("arguments[0].click()", dropdown);
	}
	@When("Click the Save button")
	public void click_the_save_button() {
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}
	@Then("Verify the Account name")
	public void verify_the_account_name() {
		String toastMessage = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
        System.out.println(toastMessage);
        Assert.assertTrue(toastMessage.contains(accountName),"Verify the Account name");
	}
}
