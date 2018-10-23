package testcases;




import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001_Login extends SeMethods{

	@Test
	public  void login() {
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
		
		type(locateElement("createLeadForm_companyName"),"TestLeaf");
		type(locateElement("createLeadForm_firstName"),"Mohan");
		type(locateElement("createLeadForm_lastName"),"Balaji");
		
		
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
	    type(locateElement("createLeadForm_primaryPhoneNumber"),"123456789");
	    type(locateElement("createLeadForm_primaryEmail"),"abc@gmail.com");
	    type(locateElement("createLeadForm_generalCity"),"chennai");
	    
	    verifyDisplayed(locateElement("createLeadForm_firstName"));
	    
	    verifyExactAttribute(locateElement("createLeadForm_firstNameLocal"), "name", "firstNameLocal");
	    verifyPartialAttribute(locateElement("createLeadForm_lastName"), "name", "lastName");
	    
		
		}
		
		
		
	}









