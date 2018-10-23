package weekday7homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class usingtabsandelements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.indeed.co.in/Fresher-jobs");
		Actions newtab = new Actions(driver);
		newtab.contextClick(driver.findElementByXPath("//div[@class='row result clickcard']/a")).sendKeys(Keys.ARROW_RIGHT).click().perform();
		Thread.sleep(2000);
		Set<String> tab= driver.getWindowHandles();
		List<String> tabs = new ArrayList<>();
		tabs.addAll(tab);
		driver.switchTo().window(tabs.get(1));
		System.out.println("title1"+driver.getTitle());
		driver.close();
		tab= driver.getWindowHandles();
		tabs = new ArrayList<>();
		tabs.addAll(tab);
		driver.switchTo().window(tabs.get(0));
		Actions tab2 = new Actions(driver);
		tab2.contextClick(driver.findElementByXPath("(//div[@class='row result clickcard']/a)[2]")).sendKeys(Keys.ARROW_RIGHT).click().perform();
		tab= driver.getWindowHandles();
		tabs = new ArrayList<>();
		tabs.addAll(tab);
		driver.switchTo().window(tabs.get(1));
		System.out.println("title2"+driver.getTitle());
		driver.close();
		
		
		
		
		
		
	}

}
