package weekday6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://legacy.crystalcruises.com/");
		System.out.println(driver.getTitle());
		driver.findElementByLinkText("GUEST CHECK-IN").click();
		Set<String> alltabs =driver.getWindowHandles();
		List<String>allList = new ArrayList<String>();
		allList.addAll(alltabs);
		driver.switchTo().window(allList.get(1));
		System.out.println(driver.getTitle());
		driver.findElementByLinkText("View Offer»").click();
		alltabs=driver.getWindowHandles();
		allList = new ArrayList<String>();
		allList.addAll(alltabs);
		driver.switchTo().window(allList.get(2));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		
		
				
		}

}
