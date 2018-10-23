package weekday7;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selectingmultipleitems {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/draggable/");
		driver.findElementByLinkText("Selectable").click();
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		WebElement select1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement select2 = driver.findElementByXPath("//li[text()='Item 3']");
		WebElement select3 = driver.findElementByXPath("//li[text()='Item 5']");
		WebElement select4 = driver.findElementByXPath("//li[text()='Item 7']");
		Actions selectmultiple = new Actions(driver);
		selectmultiple.sendKeys(Keys.CONTROL).click(select1).click(select2).click(select3).click(select4).perform();
		
	}
	

}
