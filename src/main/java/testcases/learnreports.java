package testcases;



import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class learnreports {
	
	public static ExtentReports extent;
	public   ExtentTest test , testData;
	//@BeforeSuite
	public void startResult() {
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/results.html");
		html.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(html);
	}
	public void reportStep(String stepDesc,String status) {
		if (status.equalsIgnoreCase("PASS")) {
			testData.pass(stepDesc);
		} else if (status.equalsIgnoreCase("fail")) {
			testData.fail(stepDesc);
		}
	}
	//@BeforeClass
	public void startTestCase(String testName,String desc) {
		test = extent.createTest(testName,desc);
	}
	//@BeforeMethod
	public void beforeMethod(String author,String category) {
		testData = test.createNode("leads");
		testData.assignAuthor(author);
		testData.assignCategory(category);
	}
	//@AfterSuite
	public void endResult() {
		extent.flush();
	}

}
	
	
	
	
