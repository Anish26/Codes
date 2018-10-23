package weekday4Sehomework1;

import org.openqa.selenium.chrome.ChromeDriver;

public class findleadsandverify {

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
		 driver.findElementByLinkText("Email").click();
		driver.findElementByName("emailAddress").sendKeys("gopinath@testleaf.com");
		driver.findElementByXPath(("//button[text()='Find Leads']")).click(); 
		Thread.sleep(1000);
		String title1 = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").getText();
		System.out.println(title1);
		Thread.sleep(1000);
		driver.findElementByXPath(("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		String dipalyedName = driver.findElementById("viewLead_firstName_sp").getText();
		Thread.sleep(1000);
		driver.findElementByLinkText("Duplicate Lead").click();
		String title2 = driver.findElementById("sectionHeaderTitle_leads").getText();
		System.out.println(title2);
		Thread.sleep(3000);
		if(title2.equals("Duplicate Lead")) {
			System.out.println("SAME NAME");
			
		}else {
			System.out.println("DIFFERENT TITLE");
			}
		String verifiedName = driver.findElementById("createLeadForm_firstName").getText();
		Thread.sleep(1000);
		if(dipalyedName.equals(verifiedName)) {
			System.out.println("both names are correct");
		}else {
			System.out.println("both names are not correct");
		}
		driver.close();
		}
	}

	


