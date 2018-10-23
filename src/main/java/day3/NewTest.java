package day3;

import org.openqa.selenium.WebElement;import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testcases.SeMethods;

public class NewTest extends SeMethods{
	@Parameters({"url","uname","pwd"})
	@Test(invocationCount=3,threadPoolSize=2)
	public void main1(String URL) {
		startApp("chrome", URL);
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		click(locateElement("LinkText","CRM/SFA"));		
		click(locateElement("LinkText","Leads"));
		click(locateElement("LinkText","Create Lead"));
	}
}