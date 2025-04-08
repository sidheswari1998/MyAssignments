package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends BaseClass{
	
	@DataProvider(name="fetchData")     //Dynamic parameterization    //Two dimensional array={ {"Qeagle","Hari","R"} {"TestLeaf","Vineeth","Rajendran"} }
	public String[][] readData() {
		String[][] data = new String[2][3];
		data[0][0] = "Qeagle";
		data[0][1] = "Hari";
		data[0][2] = "R";
		
		data[1][0] = "TestLeaf";
		data[1][1] = "Vineeth";
		data[1][2] = "Rajendran";
		
		return data;
	}
	
	@Test(dataProvider = "fetchData") //can be given data provider name      //both will work as same 
	//@Test(dataProvider="readData")  //can be given methodName

	public void runCreateLead(String cName, String fName, String lName) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
}
}






