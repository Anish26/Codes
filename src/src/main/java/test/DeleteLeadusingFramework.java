package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class DeleteLeadusingFramework extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName = "TC003_DeleteLead";
		testDescription ="Delete Lead";
		category = "Smoke";
		authors= "Indira";
		testNodes = "Leads";
		dataSheetName="DeleteLead";
	}
	
	@Test(dataProvider="fetchData")
	public  void deleteLead(String uname, String password, String email,String errormsg) throws InterruptedException {
		String FirstleadId = new LoginPage()
		.typeUsername(uname)
		.typePassword(password)
		.clickLogin()
		.clickcrmsfa()
		.clickLeads()
		.clickFindLead()
		.clickemailtab()
		.typeemail(email)
		.clickfindleads()
		.getfirstID();
		 new FindLeadPage()
		.clickFirstId()
		.clickDL()
		.clickFindLead()
		.EnterId(FirstleadId)
		.clickfindleads()
		.verifyText(errormsg);
		
	}

}









