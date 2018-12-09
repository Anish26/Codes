package webTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		//Set path for Driver(chrome,Fire-fox)
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Create an Object for driver
		ChromeDriver driver = new ChromeDriver();
		//Maximize the Window
		driver.manage().window().maximize();
		//For Wait sometime
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//Give URL
		driver.get("http://www.leafground.com/");
		// Click the particular data
		driver.findElementByXPath("//img[@src='images/table.png']").click();
		//Find the Table
		WebElement table = driver.findElementByXPath("//table[@cellspacing='0']");
		//Find the Rows and stored the row value in variables
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		//To get the size of the rows by using for loop
		for (int i = 1; i < rows.size(); i++) {	
		//Find the Column value using rows and stored the column value in variables
		List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
		//Get the text of the particular column and check the equals
		if (cols.get(1).getText().equals("80%")) {
		// Finally click the checkbox
			cols.get(2).click();
			break;
		}
		
		}
	}

}
