package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods 
{
	public String FirstleadId;
	public FindLeadPage() {
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//input[@name='firstName'])[3]")
	WebElement firstname;
	public FindLeadPage typefn(String fname) {
		type(firstname, fname);
		return this;
	}
	
	@FindBy(xpath="//span[text()='Email']")	
	WebElement elemail;
	@And("Click Email")
	public  FindLeadPage clickemailtab() {
	 WebElement elemail = locateElement("xpath", "//span[text()='Email']");
	 click(elemail);
	 return this;    
	}
	
	@FindBy(xpath="//input[@name='emailAddress']")
	WebElement id;
	@And("Enter Email as (.*)")
	public  FindLeadPage typeemail(String email) {
		//WebElement elemailid = locateElement("emailAddress");
		type(id, email);
	    return this;    
	}
	
	@FindBy(xpath="//button[text()='Find Leads']")
	WebElement elefindlead;
	@And("Click FindLeadsBtn")
	public  FindLeadPage clickfindleads() throws InterruptedException   {
	 WebElement elefindlead = locateElement("xpath", "//button[text()='Find Leads']");
	 click(elefindlead);
	 Thread.sleep(2000);
	 return this;    
	}

	@FindBy(xpath="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement get;
	@And("Get First LeadId")
	public String getfirstID(){
	 FirstleadId = firstlead.getText();
	 System.out.println(FirstleadId);
	 return FirstleadId;
	}
	
	@FindBy(xpath="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement firstlead;
	@And("Click First LeadId")
	public viewLead  clickFirstId(){
	 click(firstlead);
	 return new viewLead();
	}
	
	@FindBy(xpath="//input[@name='id']")
	WebElement enterid;
	@And("Give LeadId as (.*)")
	public  FindLeadPage EnterId(String data){
	 WebElement enterid = locateElement("xpath", "//input[@name='id']");
	 type(enterid, FirstleadId);
	 return this;    
	}
 
	@FindBy(className="x-paging-info")
	WebElement eleVerify;
	@And("verify as (.*)")
	public FindLeadPage verifyText(String data)
	{
	  verifyExactText(eleVerify,data);
	  System.out.println(data);
	  return this;
	}
}

	
//	public  viewLead getfirstlead() {
//	//	WebElement firstlead = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
//	//	WebDriverWait wait = new WebDriverWait(driver, 10);
//	//	wait.until(ExpectedConditions.elementToBeClickable(firstlead));
//		click(clickfirstlead);
//		return new viewLead();
//		
//    }
	
	
//	@FindBy(xpath="//span[text()='Phone']")	
//	WebElement elePhone;
//	public  FindLeadPage clickPhonetab() 
//	{
//	//WebElement elePhone = locateElement("xpath", "//span[text()='Phone']");
//	click(elePhone);
//	return this;    
//	}
//	
//	@FindBy(name="phoneNumber")
//	WebElement elephoneNumber;
//	public  FindLeadPage typephnNumber(String phnNumber) 
//	{
//		//WebElement elephoneNumber = locateElement("elephoneNumber");
//		type(elephoneNumber, phnNumber);
//	    
//	return this;    
//	}
//	
//}
	

//@FindBy()
//WebElement clickid;
//public viewLead clickFirstID() {
//	click(clickid);
//	return new viewLead();
//}
//
//
