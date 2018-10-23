
package week4day4usingtestngattributes;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import testcases.SeMethods;



public class usingtestngattributes extends SeMethods {

	@Test(dependsOnMethods= {"week4day4usingtestngattributes.usingtestngattributes.main2"})
	public void main1() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		//click(eleLogin);
		
		click(locateElement("LinkText","CRM/SFA"));
		
		click(locateElement("LinkText","Leads"));
		click(locateElement("LinkText","Create Lead"));
		
		type(locateElement("createLeadForm_companyName"),"TestLeaf");
		type(locateElement("createLeadForm_firstName"),"Mohan");
		type(locateElement("createLeadForm_lastName"),"Balaji");
		
		selectDropDownUsingText(locateElement("createLeadForm_dataSourceId"),"Employee");
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
		
			


@Test(enabled=false)
	public void main() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		String origin =driver.findElementByXPath("/html/body/div[3]").getText();
		System.out.println(origin);
		driver.switchTo().frame("childIframe");
		driver.findElementByXPath("/html/body/div[2]/p/button").click();
		String title = driver.switchTo().defaultContent().getTitle();
		System.out.println(title);
		//driver.switchTo().frame("childIframe");
		driver.findElementByXPath("/html/body/div[3]/p/button").click();
		driver.switchTo().parentFrame();
		driver.findElementByXPath("/html/body/div[1]/p[1]/button").click();
		driver.findElementByXPath("/html/body/div[2]/p/button").click();
				
						
	}



@Test(alwaysRun=true,invocationCount=2,threadPoolSize=1)
public static void main2() {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/");
	driver.findElementByLinkText("Drop down").click();
	Select one = new Select(driver.findElementById("dropdown1"));
	one.selectByIndex(1);
	Select two = new Select(driver.findElementByName("dropdown2"));
	two.selectByVisibleText("Selenium");
	Select three = new Select(driver.findElementById("dropdown3"));
	three.selectByValue("1");
	
	
	
}}