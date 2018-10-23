package weekday6homework1;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class mergingleadsandfindingthelead {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByClassName("crmsfa").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByPartialLinkText("Merge Lea").click();
		driver.findElementByXPath("//img[@src='/images/fieldlookup.gif']").click();
		Set<String> tab1 = driver.getWindowHandles();
		List<String> allList = new ArrayList<String>();
		allList.addAll(tab1);
		driver.switchTo().window(allList.get(1));
		driver.findElementByName("firstName").sendKeys("lakshmi");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		String id = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		System.out.println(id);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		tab1 = driver.getWindowHandles();
		allList = new ArrayList<String>();
		allList.addAll(tab1);
		driver.switchTo().window(allList.get(0));
		driver.findElementByXPath("(//td[@class='titleCell'])[2]/following::img").click();
		tab1 = driver.getWindowHandles();
		allList = new ArrayList<String>();
		allList.addAll(tab1);
		driver.switchTo().window(allList.get(1));
		driver.findElementByName("firstName").sendKeys("lakshmi");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		String id2 = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]").getText();
		System.out.println(id2);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]").click();
		tab1 = driver.getWindowHandles();
		allList = new ArrayList<String>();
		allList.addAll(tab1);
		driver.switchTo().window(allList.get(0));
		driver.findElementByLinkText("Merge").click();
		driver.switchTo().alert().accept();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//div[@class='x-form-item x-tab-item']//input[@name='id']").sendKeys(id);
		 driver.findElementByXPath("//button[text()='Find Leads']").click(); 
		//driver.findElementByLinkText("Find Leads").click();
		
		
		
		
	    //Take Screen Shot 
	        // File ScreenShotAs = driver.getScreenshotAs(OutputType.FILE);
	         //File destFile = new File("./snaps/windowshandles.png");
	         //FileUtils.copyFile(ScreenShotAs, destFile);
	          
		
		
		
		 //driver.findElementByXPath("(//div[@class='x-form-item x-tab-item']/div/input)[1]").sendKeys(id);
	       //driver.findElement(By.xpath("//button[text()='Find Leads']")).click(); 
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
