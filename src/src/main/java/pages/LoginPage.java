package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class LoginPage extends ProjectMethods {

	public LoginPage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	WebElement eleUname;
	@And("Enter Username as (.*)")
	public LoginPage typeUsername(String data) {
	//WebElement eleUname = locateElement("id", "username");
	type(eleUname, data);
	return this;    
	}
	@FindBy(id="password")
	WebElement elePassword;
	@And("Enter Password as (.*)")
	public LoginPage typePassword(String data) {
	//WebElement elePassword = locateElement("id", "password");
	type(elePassword, data);
	return this;
	}
	@CacheLookup
	@FindBy(className="decorativeSubmit")
	WebElement eleLogin;
	@When("Login click")
	public HomePage clickLogin() {
	//WebElement eleLogin = locateElement("class", "decorativeSubmit");
	click(eleLogin);
	return new HomePage();		
	}
	
	public HomePage verifyLogin() 
	{
		//WebElement eleLogin = locateElement("class", "decorativeSubmit");
		verifyExactAttribute(eleLogin, "name", "");
		HomePage hm = new HomePage();
		return hm;
				
		}
}
