package day2;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class full
{

		public static void main(String[] args) throws IOException {
			// Launch browser
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			// ClassName objectName = new ClassName()
			ChromeDriver driver = new ChromeDriver();
			//Load URL
			driver.get("http://leaftaps.com/opentaps/");
			//Enter UserName
			driver.findElementById("username").sendKeys("DemoSalesManager");
			//Enter Password
			driver.findElementById("password").sendKeys("crmsfa");
			//Click Login Button
			driver.findElementByClassName("decorativeSubmit").click();
			//Click Logout 
	        //driver.findElementByClassName("decorativeSubmit").click();
	        //Click CRM/SFA
			driver.findElementByClassName("crmsfa").click();
			//Click Leads <a> tag
			driver.findElementByLinkText("Leads").click();
			//Click Create Lead
			driver.findElementByLinkText("Create Lead").click();
			//Give CompanyName
			driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
			//FirstName Value
			driver.findElementById("createLeadForm_firstName").sendKeys("Mohan");
			//LastName Value
			driver.findElementById("createLeadForm_lastName").sendKeys("Balaji");
	       Select selectSource = new Select(driver.findElementById("createLeadForm_dataSourceId"));
	       selectSource.selectByVisibleText("Conference");
	     
	    //Take Screen Shot 
	         File ScreenShotAs = driver.getScreenshotAs(OutputType.FILE);
	         File destFile = new File("./snaps/imag1.png");
	         FileUtils.copyFile(ScreenShotAs, destFile);
	          
			
		}
}
