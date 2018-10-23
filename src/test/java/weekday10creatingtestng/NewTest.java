package weekday10creatingtestng;

import org.testng.annotations.Test;

import testcases.SeMethods;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest extends SeMethods {
  @Test
  public void f() {
	  type(locateElement("createLeadForm_companyName"),"TestLeaf");
		type(locateElement("createLeadForm_firstName"),"Mohan");
		type(locateElement("createLeadForm_lastName"),"Balaji");
		
		selectDropDownUsingText(locateElement("createLeadForm_dataSourceId"),"Employee");
		selectDropDownUsingIndex(locateElement("createLeadForm_marketingCampaignId"),2);
		
		
		type(locateElement("createLeadForm_lastNameLocal"), "J");
		getText(locateElement("createLeadForm_ _sp"));
		type(locateElement("createLeadForm_generalProfTitle"),"TestLeaf");
	
		type(locateElement("createLeadForm_annualRevenue"),"250000");
		verifyTitle("Create Lead | opentaps CRM");
		selectDropDownUsingIndex(locateElement("createLeadForm_currencyUomId"),2);
		verifyExactText(locateElement("sectionHeaderTitle_leads"), "Create Lead");
	   verifyPartialText(locateElement("LinkText","Find Leads"),"Find Leads");
	    
	    selectDropDownUsingText(locateElement("createLeadForm_industryEnumId"),"Computer Software");
	    type(locateElement("createLeadForm_numberEmployees"),"5");
	    selectDropDownUsingIndex(locateElement("createLeadForm_ownershipEnumId"),1);
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  
	  click(locateElement("LinkText","Leads"));
		click(locateElement("LinkText","Create Lead"));
  }

  @AfterMethod
  public void afterMethod() {
	  
	  type(locateElement("createLeadForm_primaryPhoneNumber"),"123456789");
  }

  @BeforeClass
  public void beforeClass() {
	  click(locateElement("LinkText","CRM/SFA"));
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  type(locateElement("createLeadForm_primaryEmail"),"abc@gmail.com");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
  }

  @AfterTest
  public void afterTest() {
	  type(locateElement("createLeadForm_generalCity"),"chennai");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	 startApp("chrome", "http://leaftaps.com/opentaps");
	 //ChromeOptions op = new ChromeOptions();
	 //op.setHeadless(true);
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("finished");
  }

}
