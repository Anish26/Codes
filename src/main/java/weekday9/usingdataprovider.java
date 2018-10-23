package weekday9;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testcases.SeMethods;
import weekday11.usingexcel;

public class usingdataprovider extends SeMethods {
	
	public String file;
	@BeforeClass
	public String filename() {
		System.out.println("firstBeforeClass");
		String file = "Book2";
		return file;
	}
	@Test(dataProvider="fetchdata")
		public void  main(String companyname,String firstname, String lastname)  {
		
startApp("chrome", "http://leaftaps.com/opentaps");
		//ChromeOptions op = new ChromeOptions();
		//op.setHeadless(true);
		
WebElement eleUserName = locateElement("id", "username");
type(eleUserName, "DemoSalesManager");
WebElement elePassword = locateElement("id","password");
type(elePassword, "crmsfa");
WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		
		click(locateElement("LinkText","CRM/SFA"));
		
		click(locateElement("LinkText","Leads"));
		click(locateElement("LinkText","Create Lead"));
		
		
		type(locateElement("createLeadForm_companyName"),companyname);
		type(locateElement("createLeadForm_firstName"),firstname);
		type(locateElement("createLeadForm_lastName"),lastname);
		
			
		}

	
	@BeforeClass
	public  void filename1() {
		System.out.println("SecondBeforeClass");
		 file = "Book1";
		
	}
	
	@DataProvider(name="fetchdata")
	public String[] [] getData() throws IOException{
		//String[] [] data = new String[2][3];
		
		usingexcel get = new usingexcel();
		
		return get.excel(file);
		
		
		
//		data [0][0] = "Test Leaf";
//		data [0][1] = "Mohan";
//		data [0][2] = "Balaji";
//		
//		data [1][0] = "Test Leaf";
//		data [1][1] = "Balaji";
//		data [1][2]	= "Mohan";
		
	
		
	}
}
