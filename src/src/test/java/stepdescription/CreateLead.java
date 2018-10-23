package stepdescription;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import pages.requestCatalog;


public class CreateLead {
	
	public ChromeDriver driver;
	public static String CoName;
	public static String id;
	
	@Given("Launch the browser")
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@And("maximize the browser")
	public void max() {
		driver.manage().window().maximize();
	}

	@And("load the URL")
	public void load() {
		driver.get("http://leaftaps.com/opentaps/");
	}
	
	@And("Enter username as (.*)")
	public void uname(String username) {
		driver.findElementById("username").sendKeys(username);
	}
	
	@And("Enter pass as (.*)")
	public void pass(String pass) {
		driver.findElementById("password").sendKeys(pass);
	}
	
	@And("click login button")
	public void login() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@And("click crmsfa")
	public void crmsfa() {
		driver.findElementByClassName("crmsfa").click();
	}
	
	@And("click leads")
	public void leads() {
		driver.findElementByLinkText("Leads").click();

	}

	@And("click createlead")	
	public void createlead() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@And("type firstname as (.*)")
	public void firstname(String firstname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(firstname);
	}
	
	@And("type companyname as (.*)")
	public void companyname(String Cname) {
		driver.findElementById("createLeadForm_companyName").sendKeys(Cname);
	}
	
	@And("type lastname as (.*)")
	public void lastname(String Lname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(Lname);
	}
	
	@When("click create")
	public void clickcreate() {
		driver.findElementByClassName("smallSubmit").click();
	}
	
	@Then("verify created")
	public void verify() {
		String title = driver.getTitle();
		if(title.contains("View Lead")) {
			System.out.println("Lead created");
		}else {
			System.out.println("Lead not created");
		}
		}
	
	@Then("close browser")
	public void close() {
		driver.close();
	}
	
	@And("click findLeads")
	public void clickFL() {
		driver.findElementByLinkText("Find Leads").click();
	}
	
	@And("typeleadname as (.*)")
	public void typename(String LN) {
		driver.findElementByXPath("(//div[@class='x-form-element']/input)[14]").sendKeys(LN);
	}

	@And("clickFind")
	public void clickFind() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
	}

	@And("clickfirstid")
	public void clickfirst() {
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	}

	@And("getConame")
	public void get() {
		String CoName = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println("Before edit Cname is"+CoName);
		
	}
	
	@And("clickedit")
	public void clicked() {
		driver.findElementByLinkText("Edit").click();
	}
	
	@And("clearandtypeCname as (.*)")
	public void clandtype(String name) {
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys(name);
	}

	@When("clickupdate")
	public void clickupd() {
		driver.findElementByClassName("smallSubmit").click();
		
	}

	@Then("updatedname")
	public void updtedname() {
		String uptdCname = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println("after Edit CN is"+uptdCname+"this");
		if(uptdCname!=(CoName)) {
			System.out.println("Company name Edited");
		}else {
			System.out.println("Company name not Edited");
		}
	}

	@And("click mergeLeads")
	public void clickmergeleads() {
		driver.findElementByPartialLinkText("Merge Lea").click();
	}

	@And("click fromimg")
	public void clickfrom() {
		driver.findElementByXPath("//img[@src='/images/fieldlookup.gif']").click();
	}

	@And("move to window1")
	public void windowone() {
		Set<String> tab1 = driver.getWindowHandles();
		List<String> allList = new ArrayList<String>();
		allList.addAll(tab1);
		driver.switchTo().window(allList.get(1));
	}
	
	@And("type from name as (.*)")
	public void typefromname(String frmname) {
		driver.findElementByName("firstName").sendKeys(frmname);
	}

	@And("clkfind")
	public void clkfindle() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
	}
	
	@And("get firstid")
	public void getid() {
		id = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		System.out.println(id);
	}
	
	@And("clickfirstResid")
	public void clickid() {
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	}
	
	@And("move to window0")
	public void windowZero() {
		Set<String> tab1 = driver.getWindowHandles();
		List<String> allList = new ArrayList<String>();
		allList.addAll(tab1);
		driver.switchTo().window(allList.get(0));
	}

	@And("click toimg")
	public void clickto() {
		driver.findElementByXPath("(//td[@class='titleCell'])[2]/following::img").click();
	}
	
	@And("type to name as (.*)")
	public void typeToName(String toname) {
		driver.findElementByName("firstName").sendKeys(toname);
	}

	@And("get secondid")
	public void getSecid() {
		String id2 = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]").getText();
		System.out.println(id2);
	}
	
	@And("clicksecid")
	public void clkSecid() {
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]").click();
	}
	
	@And("click merge")
	public void clickMerge() {
		driver.findElementByLinkText("Merge").click();
	}
	
	@And("handle alert")
	public void handleAlert() {
		driver.switchTo().alert().accept();
	}
	
	@And("type id")
	public void typeId() {
		driver.findElementByXPath("//div[@class='x-form-item x-tab-item']//input[@name='id']").sendKeys(id);
	}

	@Then("getResult")
	public void getresult() {
		String result = driver.findElementByXPath("//div[text()='No records to display']").getText();
		System.out.println(result);
	}

	
//	public requestCatalog clickRequest() {
//		driver.findElementByLinkText("Request Catalog ").click();
//		return new requestCatalog();
//	}
	
}

	

