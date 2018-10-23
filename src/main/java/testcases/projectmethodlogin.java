package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public  class  projectmethodlogin extends  SeMethods {

public static String sheetName,author,category,testName,desc;
	
	@BeforeSuite
	public void beforeSuite() {
		startResult();
	}
	@BeforeClass
	public void beforeClass() {
		startTestCase(testName, desc);
		beforeMethod(author,category);
	}

	@BeforeMethod
	public void loginleaftaps() {
		
		startApp("chrome", "http://leaftaps.com/opentaps");
		
		
		WebElement eleUserName = locateElement("id", "username");
		
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		
		click(locateElement("LinkText","CRM/SFA"));
		
		click(locateElement("LinkText","Leads"));
	}
	@AfterMethod
	public void close() {	
		closeAllBrowsers();
}
	
	@AfterSuite
	public void afterSuite() {
		endResult();
}

	
	}


