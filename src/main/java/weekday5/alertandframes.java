package weekday5;

import org.openqa.selenium.chrome.ChromeDriver;

public class alertandframes {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		//driver.switchTo().alert().getText();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Balaji");
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		driver.findElementById("menuButton").click();
		driver.findElementByXPath("//span[text()='Save Code']").click();
		
			
		
	}
}


	