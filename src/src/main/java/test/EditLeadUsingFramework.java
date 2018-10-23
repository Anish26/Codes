package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class EditLeadUsingFramework extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName = "EditLeadUsingFramework";
	 testDescription ="login to leaftaps";
	 category = "Smoke";
	 authors= "Balaji";
	 testNodes = "Leads";
	 dataSheetName="EditLead";
	}
	
	@Test(dataProvider="fetchData")
	public void editLeadusingFramework(String uname, String password,String fname,String clearandtype) throws InterruptedException {
		new LoginPage( )
		.typeUsername(uname)
		.typePassword(password)
		.clickLogin()
		.clickcrmsfa()
		.clickLeads()
		.clickFindLead()
		.typefn(fname)
		.clickfindleads()
		.clickFirstId()
		.updatedText()
		.clickEdit()
		.clearAndType(clearandtype)
		.clickUpdate()
		.updated();
		
	}
	
	}


