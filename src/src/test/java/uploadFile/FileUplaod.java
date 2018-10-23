package uploadFile;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class FileUplaod{

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.naukri.com/");
		WebElement upload = driver.findElementByXPath("");
		upload.sendKeys("C:\\Users\\wipro\\Downloads\\CV (MOHAN BALAJI.V) updated.");
		
	}

}
