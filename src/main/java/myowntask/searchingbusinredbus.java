package myowntask;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class searchingbusinredbus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(1000);
		driver.findElementByClassName("gsfi").sendKeys("redbus");
		driver.findElementByClassName("gsfi").sendKeys(Keys.ENTER);
		driver.findElementByXPath("//a[@id='vn1s0p1c0']").click();
		driver.manage().window().maximize();
		driver.findElementByXPath("//div[@id='signin_dd']/div").click();
		driver.findElementById("signInLink").click();
		Thread.sleep(1000);
		Actions esc = new Actions(driver);
		esc.sendKeys(Keys.ESCAPE);
		Thread.sleep(1000);
		driver.findElementByXPath("(//a[@class='signin-screen'])[2]").click();
		
		//username
		//pass
		
		
		driver.findElementByXPath("//div[@class='squaredThree']//label").click();
		
		
		
		
		
		
		
		
		
	
	
	}

}
