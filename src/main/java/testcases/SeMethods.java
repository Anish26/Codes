package testcases;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.sound.midi.SysexMessage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public  class SeMethods extends learnreports implements WdMethods{
	 
	
	

		public int i=1;
	public RemoteWebDriver driver;
	public void startApp(String browser, String url) {
		try {
			if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				System.out.println("The Browser "+browser+" Launched Successfully");
				reportStep("The Browser "+browser+" Launched Successfully","Pass");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				reportStep("The Browser "+browser+" Launched UnSuccessfully","fail");
				e.printStackTrace();
			}
			
		
	}

	
	public WebElement locateElement(String locator, String locValue) {
		
			switch(locator) {
			case "id"	 : return driver.findElementById(locValue);
			case "class" : return driver.findElementByClassName(locValue);
			case "XPath" : return driver.findElementByXPath(locValue);
			case "LinkText" : return driver.findElementByLinkText(locValue);
			case "PartialLinkText" : return driver.findElementByPartialLinkText(locValue);
			
			
			
			}
		return null;
	}

	@Override
	public WebElement locateElement(String locValue) {
		
		return driver.findElementById(locValue);
		
	}

	
	public void type(WebElement ele, String data) {
		
			ele.sendKeys(data);
			System.out.println("The data "+data+" is Entered Successfully");
			reportStep("The data "+data+" is Entered Successfully","Pass");
			
	}

	
	public void clickWithNoSnap(WebElement ele) {
		
			ele.click();
			System.out.println("The Element "+ele+" Clicked Successfully");
			reportStep("The Element "+ele+" Clicked Successfully","Pass");
	}
	
	
	@Override
	public void click(WebElement ele) {
		
			ele.click();
			System.out.println("The Element "+ele+" Clicked Successfully");
			reportStep("The Element "+ele+" Clicked Successfully","Pass");
	}

	@Override
	public String getText(WebElement ele) {
		String val = ele.getText();
		
		System.out.println(val);
		reportStep(val, "Pass");
		return val;
		
		
	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {
		Select source = new Select(ele);
		source.selectByVisibleText(value);


	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
//		Select marketing = new Select(ele);
//		marketing.selectByIndex(index);
		
		Select five = new Select(ele);
		List<WebElement> Option = five.getOptions();
		int  count = Option.size();
		System.out.println(count);
		five.selectByIndex(count-index);
				
	}

	@Override
	public boolean verifyTitle(String expectedTitle) {
		String title = driver.getTitle();
		if(title.equalsIgnoreCase(expectedTitle)){
			System.out.println(title);
			System.out.println("title is correct");
			reportStep("title is correct", "Pass");
			
			return true;
		}
		
		else {
			System.out.println(title);
			System.out.println("title is not correct");
			reportStep("title is not correct", "fail");
			
			return false;	
		}
		
		
		
	}

	@Override
	public void verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		String eleText= ele.getText();
		if(eleText.equals(expectedText)) {
			System.out.println("ExactText is Correct");
			reportStep("ExactText is Correct", "Pass");
			
		}else {
			System.out.println("ExactText is Not Correct");
			reportStep("ExactText is Not Correct", "fail");
		}

	}

	@Override
	public void verifyPartialText(WebElement ele, String expectedText) {
		String parText = ele.getText();
		String texts = driver.findElementByPartialLinkText(expectedText).getText();
		if(parText.equalsIgnoreCase(expectedText)) {
			System.out.println("PartialText is verified");
			reportStep("PartialText is verified", "Pass");
		}else {
			System.out.println("PartialText is not verified");
			reportStep("PartialText is  not verified", "fail");
		}
	}

	
	@Override
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		String attrie = ele.getAttribute(value);
		//if(attrie.equals(attribute)) {
		System.out.println(attrie);
		reportStep("attrie", "Pass");
		//System.out.println("correct attrie");
	//	}else {
		//	System.out.println("wrong");
		
	}
		
		
		
		

	

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		String paratt = ele.getAttribute(value);
	
		
		System.out.println(paratt);
		reportStep("paratt", "Pass");

	}

	@Override
	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyDisplayed(WebElement ele) {
//			Stirng display = ele.getText();
			
		

	}

	@Override
	public void switchToWindow(int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			System.err.println("IOException");
		}
		i++;
	}

	@Override
	public void closeBrowser() {
		driver.close();
	}

	@Override
	public void closeAllBrowsers() {
		//driver.closeAll();
		driver.quit();

	}

	
//	@BeforeSuite
//	@Override
//	public  void startResult() {
//	ExtentHtmlReporter html= new ExtentHtmlReporter("./reports/results1.html");
//		html.setAppendExisting(true);
//		ExtentReports extent = new ExtentReports();
//		extent.attachReporter(html);
//	}
//
//	
//	@BeforeClass
//	@Override
//	public void startTestCase(String testname, String des) {
//		test = extent.createTest(testname, des);		
//		}
//
//
//	@Override
//	public void reportStep(String Stepdes, String status) {
//		//TODO Auto-generated method stub
//	
//			
//			if(status.equalsIgnoreCase("Pass")){
//				testData.pass(Stepdes);
//			}else if (status.equalsIgnoreCase("fail")){
//				testData.fail(Stepdes);
//				
//			}
//		
//	}
//
//	@BeforeMethod
//	@Override
//	public void bM(String author, String category) {
//	
//		testData = test.createNode("Leads");
//		test.assignAuthor(author);
//		test.assignCategory(category);
//	}
//
//	@AfterSuite
//	@Override
//	public void endResult(String result) {
//		extent.flush();
//	}
//
//	
//	
	
	
	}	
	
	
		
		
		
	
	


