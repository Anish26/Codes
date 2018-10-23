package weekday7;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class usingdrag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/draggable/");
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		WebElement drag = driver.findElementById("draggable");
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(drag, 300, 200).perform();
		}

}
