package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class reportsforcreateleadandeditlead extends projectmethodlogin {

	
	@BeforeTest
	public void setData() {
		
		author = "sarath";
		category = "smoke";
		testName = "CreateLead";
		desc = "Create a new Lead";}
	
	

	//this is createlead testcases using excel
	@Test
	public  void login() {
		
		
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
		
	

	//this is editlead testcases
	@Test(enabled=false )
	public void editLead(){
		// TODO Auto-generated method stub
		startApp("chrome", "http://leaftaps.com/opentaps");
		
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		
		click(locateElement("LinkText","CRM/SFA"));
		
		click(locateElement("LinkText","Leads"));
		click(locateElement("LinkText","Find Leads"));
		click(locateElement("LinkText","Email"));
		type(locateElement("XPath","(//input[@class=' x-form-text x-form-field'])[28]"),"abc@gmail.com");
		click(locateElement("LinkText","Find Leads"));
		click(locateElement("XPath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
        String title = (locateElement("sectionHeaderTitle_leads").getText());
		
		System.out.println(title);
		if(title.equals("View Lead")) {
			System.out.println("Title is same");
		}else {
			System.out.println("Title is not same");
		}
		String companyName = (locateElement("viewLead_companyName_sp").getText());
		System.out.println(companyName);
		click(locateElement("LinkText","Edit"));
		locateElement("updateLeadForm_firstName").clear();
		type(locateElement("updateLeadForm_firstName"),"diya");
		click(locateElement("class","smallSubmit"));
		String changedName = locateElement("viewLead_companyName_sp").getText();
		if(changedName.equals("wipro")) {
			System.out.println("Name updated");
		}else{
			System.out.println("Name not updated");
		}
		
		
		

	}

	
	
	
}
