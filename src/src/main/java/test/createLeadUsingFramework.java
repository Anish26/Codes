package test;

import org.testng.annotations.BeforeTest;


import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class createLeadUsingFramework extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName = "CreateLeadUsingFramework";
	 testDescription ="login to leaftaps";
	 category = "Smoke";
	 authors= "sarath";
	 testNodes = "Leads";
	 dataSheetName="Createlead";
	}
	
	@Test(dataProvider="fetchData")
	public  void createLead(String uname, String password,String companyname, String	firstname,String	lastname,String	source,String	fnlocal,String	lnlocal,String	titlename,String	dept,String	revenue,String mail,String atrr, String partext, String Title ){
		new LoginPage( )
		.typeUsername(uname)
		.typePassword(password)
		.clickLogin()
		.clickcrmsfa()
		.clickLeads()
		.clickCreateLead()
		.typeCompanyName(companyname)
		.typeFirstName(firstname)
		.typeLastName(lastname)
		.selectSource(source)
		.typeFirstNameLocal(fnlocal)
		.typeLastNameLocal(lnlocal)
		.typeTitleName(titlename)
		.typeDepart(dept)
		.typeRev(revenue)
		.typeMail(mail)
		.exactAttribute(atrr)
		.clickSubmit()
		.verifyExactText(firstname)
		.verifypartext(partext)
		.verifyTitle(Title);
			
	}
}