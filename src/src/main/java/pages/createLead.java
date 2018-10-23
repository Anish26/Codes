package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class createLead extends ProjectMethods {
	
	public createLead() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="createLeadForm_companyName")
	WebElement companyName;
	public createLead typeCompanyName(String Cname) {
		type(companyName,Cname);
		return this;
	}
	
	@FindBy(id="createLeadForm_firstName")
	WebElement Firstname;
	public createLead typeFirstName(String Fname) {
		type(Firstname,Fname);
		return this;
	}
	
	@FindBy(id="createLeadForm_lastName")
	WebElement Lastname;
	public createLead typeLastName(String Lname) {
		type(Lastname,Lname);
		return this;
	}
	
	@FindBy(id="createLeadForm_dataSourceId")
	WebElement source;
	public createLead selectSource(String text) {
		selectDropDownUsingText(source,text);
		return this;
	}
	
	@FindBy(id="createLeadForm_firstNameLocal")
	WebElement FirstnameLocal;
	public createLead typeFirstNameLocal(String FnameLocal) {
		type(FirstnameLocal,FnameLocal);
		return this;
	}
	
	@FindBy(id="createLeadForm_lastNameLocal")
	WebElement LastnameLocal;
	public createLead typeLastNameLocal(String LnameLocal) {
		type(LastnameLocal,LnameLocal);
		return this;
	}
	
	@FindBy(id="createLeadForm_personalTitle")
	WebElement titleName;
	public createLead typeTitleName(String tname) {
		type(titleName,tname);
		return this;
	}
	
	@FindBy(id="createLeadForm_departmentName")
	WebElement deptmt;
	public createLead typeDepart(String dept) {
		type(deptmt,dept);
		return this;
	}
	
	@FindBy(id="createLeadForm_annualRevenue")
	WebElement revenue;
	public createLead typeRev(String rev) {
		type(revenue,rev);
		return this;
	}
	
	@FindBy(id="createLeadForm_primaryEmail")
	WebElement mail;
	public createLead typeMail(String id) {
		type(mail,id);
		return this;
	}
	
	@FindBy(id="createLeadForm_firstNameLocal")
	WebElement atr;
	public createLead exactAttribute(String value) {
		verifyExactAttribute(atr,"name",value);
	if(getAttribute(atr, "name").equals(value)) {
			System.out.println("correct attribute");
		}else {
			System.out.println("wrong attribute");
		}
		
	return this;
	}
	
	@FindBy(className="smallSubmit")
	WebElement clicklead;
	public viewLead clickSubmit() {
		click(clicklead);
	return new viewLead();
	}
	
}
	
	


