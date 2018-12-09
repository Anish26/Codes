package webTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchTrains {

	public static void main(String[] args) throws InterruptedException {
		//Create Object for ChromeOptions
		ChromeOptions op = new ChromeOptions();
		//Disable notifications
		op.addArguments("--disable-notifications");
		//Create Object for ChromeDriver
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(op);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.findElementByXPath("(//li[@class='trainsApp'])[2]").click();
		//WebDriverWait wait = new WebDriverWait(driver,10); 
		Thread.sleep(3000);
		driver.findElementByXPath("//span[@class='ui-widget relative span span24']").sendKeys("Chennai");
		
		
		
		
	}
}
