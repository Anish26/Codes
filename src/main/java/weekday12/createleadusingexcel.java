package weekday12;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testcases.SeMethods;
import weekday11.usingexcel;

public class createleadusingexcel extends SeMethods
{
	public String file;
	@BeforeClass
	public String filename() {
		String file = "createlead";
		return file;
	}
	
	@Test(dataProvider="fetch")
	public void main (String companyname, String firstname, String lastname, String source, String fnlocal,String lnlocal, String titlename, String dept, String revenue) throws IOException {
		startApp("chrome", "http://leaftaps.com/opentaps");
		
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		
		click(locateElement("LinkText","CRM/SFA"));
		
		click(locateElement("LinkText","Leads"));
		click(locateElement("LinkText","Create Lead"));
		usingexcel get = new usingexcel();


		
		type(locateElement("createLeadForm_companyName"),companyname);
		type(locateElement("createLeadForm_firstName"),firstname);
		type(locateElement("createLeadForm_lastName"),lastname);
		selectDropDownUsingText(locateElement("createLeadForm_dataSourceId"),source);
		selectDropDownUsingIndex(locateElement("createLeadForm_marketingCampaignId"),2);
		type(locateElement("createLeadForm_firstNameLocal"),fnlocal);
		type(locateElement("createLeadForm_lastNameLocal"),lnlocal);
		type(locateElement("createLeadForm_personalTitle"),titlename);
		type(locateElement("createLeadForm_departmentName"),dept);
		type(locateElement("createLeadForm_annualRevenue"),revenue);
		
		
			
	}
	
	@BeforeClass
	public  void filename1() {
		 file = "createlead";
		
	}
	
	@DataProvider(name="fetch")
	public String[] [] getData() throws IOException{
		
		
		usingexcel get = new usingexcel();
		return get.excel(file);
		
		

	}

}
