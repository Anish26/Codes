package dayuse;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class rough {
	@Test()
	public void main() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		String origin =driver.findElementByXPath("/html/body/div[3]").getText();
		System.out.println(origin);
		driver.switchTo().frame("childIframe");
		driver.findElementByXPath("/html/body/div[2]/p/button").click();
		String title = driver.switchTo().defaultContent().getTitle();
		System.out.println(title);
		//driver.switchTo().frame("childIframe");
		driver.findElementByXPath("/html/body/div[3]/p/button").click();
		driver.switchTo().parentFrame();
		driver.findElementByXPath("/html/body/div[1]/p[1]/button").click();
		driver.findElementByXPath("/html/body/div[2]/p/button").click();
				
						
	}



@Test()
public static void main2() {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/");
	driver.findElementByLinkText("Drop down").click();
	Select one = new Select(driver.findElementById("dropdown1"));
	one.selectByIndex(1);
	Select two = new Select(driver.findElementByName("dropdown2"));
	two.selectByVisibleText("Selenium");
	Select three = new Select(driver.findElementById("dropdown3"));
	three.selectByValue("1");
	
	
	
}}
	