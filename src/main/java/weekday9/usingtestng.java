package weekday9;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testcases.SeMethods;

public class usingtestng extends SeMethods{
	
	@Parameters({"url"})
	@BeforeMethod
	public void get(String URL) {
		
		startApp("chrome", URL);
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "psw");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
	}
	
	@Test
	public void main1() {
		
		click(locateElement("LinkText","CRM/SFA"));		
		click(locateElement("LinkText","Leads"));
		click(locateElement("LinkText","Create Lead"));

		
		
		
	}


}
