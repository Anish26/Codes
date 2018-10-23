package weekday7;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findingcricket {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.com/");
		driver.findElementById("lst-ib").sendKeys("cricket",Keys.ENTER);
		List<WebElement> alltext= driver.findElementsByPartialLinkText("Cricket");
		System.out.println(alltext.size());
		for(WebElement alltexts : alltext) {
		System.out.println(alltexts.getText());
		
		}	
		List<WebElement> text= driver.findElementsByPartialLinkText("cricket");		
		System.out.println(text.size());
		for(WebElement alltxt : text) {
			System.out.println(alltxt.getText());
		}
		}


}