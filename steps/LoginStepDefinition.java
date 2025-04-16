package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BaseClass{

//public EdgeDriver driver;
	
	@Given("Load the url")
	public void load_the_url() {
	  driver.get("http://leaftaps.com/opentaps/control/login");
	  
	}
	
	@Given("Launch the browser")
	public void launchBrowser() {
		driver=new EdgeDriver();
		driver.manage().window().maximize();
	}

	@Given("Enter the username as {string}")
	public void enter_the_username_as_demo_csr(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@Given("Enter the password as crmsfa")
	public void enter_the_password_as_crmsfa() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}

	@When("Click on the Login button")
	public void click_on_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("It should navigate to the next page")
	public void it_should_navigate_to_the_next_page() {
	   System.out.println("Navigated to the next page");
	}
}
