package day4homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class homeworkfindingleads {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/");
			driver.findElementById("username").sendKeys("DemoSalesManager");
			driver.findElementById("password").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
			driver.findElementByClassName("crmsfa").click();
			driver.findElementByLinkText("Leads").click();
			driver.findElementByLinkText("Find Leads").click();
			driver.findElementById("ext-gen240__ext-gen280").click();
			driver.findElementByName("emailAddress").sendKeys("abc@gmail.com");
			driver.findElementByClassName("x-btn-text").click();
			driver.findElementByLinkText("abc").click();
			driver.findElementById("ext-gen591").click();
			driver.findElementByClassName("smallSubmit");
			driver.quit();
			
		 	
	}

}
 

