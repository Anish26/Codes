package pages;

import org.openqa.selenium.WebElement;



import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.bytebuddy.description.modifier.SynchronizationState;
import wdMethods.ProjectMethods;

public class viewLead extends ProjectMethods{
	String CN;
	public viewLead() {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id="viewLead_firstName_sp")
	WebElement verifytxt;
	@Then("vrfy created (.*)")
	public viewLead verifyExactText(String expectedText) {
		String text1 = verifytxt.getText();
		if(text1.equals(expectedText)){
			System.out.println("verified"+expectedText+"successfully");
		}else {System.out.println("not verified");
		}
		return this;
	}

	@FindBy(id="viewLead_lastName_sp")
	WebElement partext;
	@Then("verify Lname as (.*)")
	public viewLead verifypartext(String expectedParText) {
		String text = partext.getText();
		if(text.contains(expectedParText)){
			System.out.println("verified"+expectedParText+"successfully");
		}else {System.out.println("not verified");
		}
		return this;
	}
	
	
	public boolean verifyTitle(String expectedtitle) {
		String TitleName = driver.getTitle();
		
		if (TitleName.contains(expectedtitle)) {
			System.out.println("correct Tilte");
		}else {
			System.out.println("wrong Title");
		}
		return true;
	}
	
	@FindBy(id = "viewLead_companyName_sp")
	WebElement companyName;
	public viewLead updatedText() {
		String CN = companyName.getText();
		System.out.println("before Edit CN is"+CN+"this");
		return this;
	}
	
	@FindBy(id = "viewLead_companyName_sp")
	WebElement updatedName;
	public viewLead updated() {
		String ComName = updatedName.getText();
		System.out.println("after Edit CN is"+ComName+"this");
		if(ComName!=(CN)) {
			System.out.println("Company name Edited");
		}else {
			System.out.println("Company name not Edited");
		}
		return this;
	}
	
	@FindBy(linkText="Edit")
	WebElement edit;
	public EditLead clickEdit() {
		click(edit);
		return new EditLead();
	}
	
	@FindBy(linkText="Delete")
	WebElement clickDelete;
	@Given("Clk dl")
	public MyLeadPage clickDL() {
		click(clickDelete);
		return new MyLeadPage();
		
	}
	
	
	@FindBy(linkText="Duplicate Lead")
	WebElement clkDuplicate;
	@Given("clk duplicateLead")
	public DuplicateLead clickDuplicate() {
		click(clkDuplicate);
		return new DuplicateLead();
	}



	
}

