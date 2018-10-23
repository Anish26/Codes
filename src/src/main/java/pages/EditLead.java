package pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{
	
	public EditLead() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="updateLeadForm_companyName")
	WebElement edit;
	public EditLead clearAndType(String Cname) {
		edit.clear();
		type(edit, Cname);
		return this;
	}
	
	@FindBy(className="smallSubmit")
	WebElement clicklead;
	@When("clk create")
	public viewLead clickUpdate() {
		click(clicklead);
	return new viewLead();
	}
	

}
