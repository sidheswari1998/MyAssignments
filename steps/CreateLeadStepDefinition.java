package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class CreateLeadStepDefinition extends BaseClass{

@When("Click on the CRMSFA link")
public void click_on_the_crmsfa_link() {
	driver.findElement(By.linkText("CRM/SFA")).click();
}
@When("Click on the Leads link")
public void click_on_the_leads_link() {
	driver.findElement(By.linkText("Leads")).click();
}
@When("Click on the CreateLead link")
public void click_on_the_create_lead_link() {
	WebElement findElement = driver.findElement(By.linkText("Create Lead"));
	findElement.click();
}
@When("Enter the companyname as TestLeaf")
public void enter_the_companyname_as_test_leaf() {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TL");
}
@When("Enter the Firstname as Vineeth")
public void enter_the_firstname_as_vineeth() {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");
}
@When("Enter the lastname as Rajendran")
public void enter_the_lastname_as_rajendran() {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
}
@When("Click on the CreateLead button")
public void click_on_the_create_lead_button() {
	driver.findElement(By.name("submitButton")).click();
}

}