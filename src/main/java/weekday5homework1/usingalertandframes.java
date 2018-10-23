package weekday5homework1;

import org.openqa.selenium.chrome.ChromeDriver;

public class usingalertandframes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		String origin =driver.findElementByXPath("/html/body/div[3]").getText();
		System.out.println(origin);
		driver.switchTo().frame("childIframe");
		driver.findElementByXPath("/html/body/div[2]/p/button").click();
		String title = driver.switchTo().defaultContent().getTitle();
		System.out.println(title);
		driver.switchTo().frame("childIframe");
		driver.findElementByXPath("/html/body/div[3]/p/button").click();
		driver.switchTo().parentFrame();
		driver.findElementByXPath("/html/body/div[1]/p[1]/button").click();
		driver.findElementByXPath("/html/body/div[2]/p/button").click();
				
		
		
		
		
	}

}
