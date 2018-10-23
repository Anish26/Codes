package weekday4Sehomework1;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.chrome.ChromeDriver;

public class editingleads {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByClassName("crmsfa").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//div[@class='x-form-element']/input)[14]").sendKeys("gopinath");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		String title = driver.findElementById("sectionHeaderTitle_leads").getText();
		
		System.out.println(title);
		if(title.equals("View Lead")) {
			System.out.println("Title is same");
		}else {
			System.out.println("Title is not same");
		}
		String companyName = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(companyName);
		driver.findElementByLinkText("Edit").click();
		driver.findElementByClassName("inputBox").clear();
		driver.findElementByClassName("inputBox").sendKeys("wipro");
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(1000);
		String changedName = driver.findElementById("viewLead_companyName_sp").getText();
		if(changedName.equals("wipro")) {
			System.out.println("Name updated");
		}else{
			System.out.println("Name not updated");
		}
		driver.close();
		
		}
		
			
	}


