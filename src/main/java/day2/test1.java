package day2;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByClassName("crmsfa").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Test Leaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Mohan");
		driver.findElementById("createLeadForm_lastName").sendKeys("Balaji");
		Select Source = new Select(driver.findElementById("createLeadForm_dataSourceId") );
		Source.selectByVisibleText("Employee");
		Select Marketing = new Select(driver.findElementById("createLeadForm_dataSourceId") );
		Marketing.selectByValue("LEAD_EMPLOYEE");
		driver.findElementByName("lastNameLocal").sendKeys("G");
		driver.findElementByName("personalTitle").sendKeys("test");
		driver.findElementByName("generalProfTitle").sendKeys("test1");
		driver.findElementByName("departmentName").sendKeys("departmentName");
		driver.findElementByName("annualRevenue").sendKeys("250000");
		Select Industry = new Select(driver.findElementByName("industryEnumId"));
		Industry.selectByIndex(4);
		List<WebElement> alloptions = Industry.getOptions();
		for(WebElement eachoption : alloptions) {
			System.out.println(eachoption.getText());
		}
		driver.findElementByName("numberEmployees").sendKeys("5");
		Select Ownership = new Select(driver.findElementByName("ownershipEnumId"));
		Ownership.selectByIndex(4);
		driver.findElementByName("sicCode").sendKeys("123");
		driver.findElementByName("description").sendKeys("123");
		driver.findElementByName("importantNote").sendKeys("123");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("5");
	   	driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("12");
	  	driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("1234567890");
	  	driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("TestLeaf");
	  	driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Help");
	  	driver.findElementById("createLeadForm_primaryEmail").sendKeys("testleaf@gmail.com");
	  	driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.google.com");
	  	driver.findElementByName("generalToName").sendKeys("TestName");
	  	driver.findElementByName("generalCity").sendKeys("chennai");
		Select country = new Select(driver.findElementById("createLeadForm_generalCountryGeoId"));
        country.selectByIndex(4);
        driver.findElementByName("generalPostalCodeExt").sendKeys("Test123");
       	driver.findElementByClassName("smallSubmit").click();
      	driver.quit();	
      	

	}

}
