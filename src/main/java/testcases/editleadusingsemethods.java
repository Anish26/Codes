package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class editleadusingsemethods extends SeMethods{
	
	@Test
	public void main(){
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
