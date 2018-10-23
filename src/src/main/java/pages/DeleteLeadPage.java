package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DeleteLeadPage extends ProjectMethods {

	public DeleteLeadPage() {
	PageFactory.initElements(driver, this);
	}
			
	@FindBy(linkText="Find Leads")
	WebElement elefindlead;
	public FindLeadPage clickFindLead() 
	{
	//WebElement eleClick = locateElement("LinkText", "Create Lead");
	click(elefindlead);
	return new FindLeadPage();
	}		
}


