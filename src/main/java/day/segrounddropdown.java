package day;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class segrounddropdown {
	@Test
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.findElementByLinkText("Drop down").click();
		Select one = new Select(driver.findElementById("dropdown1"));
		one.selectByIndex(1);
		Select two = new Select(driver.findElementByName("dropdown2"));
		two.selectByVisibleText("Selenium");
		Select three = new Select(driver.findElementById("dropdown3"));
		three.selectByValue("1");
		Select four = new Select(driver.findElementByClassName("dropdown"));
		four.selectByValue("1");
	     List<WebElement> eachOption = four.getOptions();
	     for (WebElement eachElement : eachOption) {
		       	System.out.println(eachElement.getText());
		}
	     Select five = new Select(driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[5]/select"));
	     five.selectByValue("1");
		List<WebElement> Option = five.getOptions();
		int  count = Option.size();{
			System.out.println(count);
			five.selectByIndex(count-2);
		}
	    Select six = new Select(driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		six.selectByIndex(1);
		six.selectByIndex(2);
		
		
		
					}
}






			
		
		
		
		
		
				
				



