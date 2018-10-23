package weekday7;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class weekday7findingelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.com/");
		driver.findElementByClassName("gsfi").sendKeys("Balaji",Keys.ENTER);
		List<WebElement> quotes = driver.findElementsByPartialLinkText("Balaji");
		System.out.println(quotes.size());
		System.out.println(quotes.get(4).getText());
		for (WebElement allLinks : quotes) {
			System.out.println(allLinks.getText());
		}
		
		}

}
