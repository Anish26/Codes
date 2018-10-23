package weekfday12;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class creatingreports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentHtmlReporter html= new ExtentHtmlReporter("./reports/results.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		ExtentTest Test = extent.createTest("TC001_Login", "createlead");
		Test.pass("uname Entered successfiully");
		Test.fail("psw entered wrong");
		Test.warning("login not clicked");
		extent.flush();      
		
	}

}
