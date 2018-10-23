package weekday7;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveoptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/draggable/");
		driver.findElementByLinkText("Sortable").click();
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		WebElement drag = driver.findElementByXPath("//ul[@id='sortable']/li/span");
		
		WebElement drop = driver.findElementByXPath("//ul[@id='sortable']/li[4]/span");
		int y = drop.getLocation().getY();
		Actions builder = new Actions(driver);
		builder.clickAndHold(drag).dragAndDropBy(drag,0,y ).perform();
	}

}
