package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import wdMethods.ProjectMethods;

public class teatLeafHomePage extends ProjectMethods  {
	
	public teatLeafHomePage() {
		PageFactory.initElements(driver,this);
		}

	@FindBy(linkText="Leads")
	WebElement text;
	@Given("clk leads")
	public MyLeadPage clickLeads() {
	click(text);
	return new MyLeadPage();
	}
	
}
	

