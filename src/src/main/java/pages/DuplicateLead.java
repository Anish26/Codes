package pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import wdMethods.ProjectMethods;

public class DuplicateLead extends ProjectMethods {
	 
	public DuplicateLead() {
		PageFactory.initElements(driver, this);
		
	}
	
	@Given("verify Title as (.*)")
	public String getTitle(String Expectedtitle) {
		String title = driver.getTitle();
		System.out.println("Title is"+title);
		if(title.contains(Expectedtitle)){
			System.out.println("Correct Title");
		}else{
			System.out.println("Wrong Title");
		}
		return title;
	}
	
	
	@FindBy(name="submitButton")
	WebElement submit;
	@Given("clk submit")
	public viewLead clickCreate() {
		click(submit);
		return new viewLead();
	}


}
