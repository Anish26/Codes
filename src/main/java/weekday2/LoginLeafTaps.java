package weekday2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginLeafTaps {

	public static void main(String[] args) {
		// Launch browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// ClassName objectName = new ClassName()
		ChromeDriver driver = new ChromeDriver();
		//Load URL
		driver.get("http://leaftaps.com/opentaps/");
		//Enter UserName
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter Password
		driver.findElementById("password").sendKeys("crmsfa");
		//Click Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		//Click Logout 
        //driver.findElementByClassName("decorativeSubmit").click();
        //Click CRM/SFA
		driver.findElementByClassName("crmsfa").click();
		//Click Leads <a> tag
		driver.findElementByLinkText("Leads").click();
		//Click Create Lead
		driver.findElementByLinkText("Create Lead").click();
		//Give CompanyName
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		//FirstName Value
		driver.findElementById("createLeadForm_firstName").sendKeys("Mohan");
		//LastName Value
		driver.findElementById("createLeadForm_lastName").sendKeys("Balaji");
		//Source Value
		Select selectDataSource = new Select(driver.findElementById("createLeadForm_dataSourceId"));
		selectDataSource.selectByVisibleText("Direct Mail"); 
		//Marketing Value
		Select selectMarketing = new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
		selectMarketing.selectByIndex(4); 
		//First Name (Local) Value
		driver.findElementByName("firstNameLocal").sendKeys("Balaji");
		//Last Name (Local) Value
		driver.findElementByName("lastNameLocal").sendKeys("G");
		//Salutation Value
		driver.findElementByName("personalTitle").sendKeys("TestSalutation"); 
		//GeneralProfile Value
	    driver.findElementByName("generalProfTitle").sendKeys("TestgeneralProfTitle"); 
	    //DepartmentName Value
	  	driver.findElementByName("departmentName").sendKeys("TestDepartmentName"); 
	  	//annualRevenue Value
	  	driver.findElementByName("annualRevenue").sendKeys("300000");
	  	//Preferred Currency
	  	Select prepareCurrency = new Select(driver.findElementById("createLeadForm_currencyUomId"));
	  	prepareCurrency.selectByIndex(4); 
	  	//Industry Value
	  	Select industry = new Select(driver.findElementByName("industryEnumId"));
	  	industry.selectByIndex(4); 
	  	//Number Of Employees
	  	driver.findElementByName("numberEmployees").sendKeys("5");
	  	//Ownership
	  	Select ownership = new Select(driver.findElementByName("ownershipEnumId"));
	  	ownership.selectByIndex(4); 
	  	//SIC Code value
	  	driver.findElementByName("sicCode").sendKeys("Abc100");
	  	//Ticker Symbol
	  	driver.findElementByName("tickerSymbol").sendKeys("testSymbol");
	  	//Description
	  	driver.findElementByName("description").sendKeys("First Week Sel Description");
	    //Important Note
	  	driver.findElementByName("importantNote").sendKeys("First Week Sel");
	  	//Country Code
	  	driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("5");
	  	//Area Code
	  	driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("12");
	  	//Phone Number
	  	driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("1234567890");
	  	//Extension
	  	driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("TestLeaf");
	  	//Person to Ask For
	  	driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Help");
	  	//E-Mail Address
	  	driver.findElementById("createLeadForm_primaryEmail").sendKeys("testleaf@gmail.com");
	  	//Web Url
	  	driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.google.com");
	  	//To Name
	  	driver.findElementByName("generalToName").sendKeys("TestName");
	  	//Attention Name 
	  	driver.findElementByName("generalAttnName").sendKeys("TestAttention Name");
	  	//Address Line 1
	  	driver.findElementByName("generalAddress1").sendKeys("1 Main Road");
	  	//Address Line 2
	  	driver.findElementByName("generalAddress2").sendKeys("Anna  Nagar");
	  	//City
        driver.findElementByName("generalCity").sendKeys("Chennai");	
        //State/Province
        Select state = new Select(driver.findElementById("createLeadForm_generalStateProvinceGeoId"));
        state.selectByIndex(4); 
        //Zip/Postal Code
        driver.findElementByName("generalPostalCode").sendKeys("60068");
        //Country
        Select country = new Select(driver.findElementById("createLeadForm_generalCountryGeoId"));
        country.selectByIndex(4);
        //Zip/Postal Code Extension
        driver.findElementByName("generalPostalCodeExt").sendKeys("Test123");
      //Click Login Button
      	driver.findElementByClassName("smallSubmit").click();

	}

}
