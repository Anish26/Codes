package workout_program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HCL_Drive {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("http://bit.ly/MRDCHN3");
		Thread.sleep(3000);
		driver.findElementById("fname").sendKeys("Anita.S");
		driver.findElementById("email").sendKeys("anitasma94@gmail.com");
		driver.findElementById("mobile").sendKeys("9500147848");
		WebElement dd1 = driver.findElementById("ddl");
		Select sel = new Select(dd1);
		sel.selectByIndex(1);
		WebElement dd2 = driver.findElementById("ddl2");
		Select sel1 = new Select(dd2);
		sel1.selectByVisibleText("Chennai");
		WebElement qf = driver.findElementById("qualification");
		Select sel2 = new Select(qf);
		sel2.selectByValue("B.E / B. Tech");
		WebElement we = driver.findElementById("work_experience");
		Select sel3 = new Select(we);
		sel3.selectByIndex(3);
//		WebElement ws = driver.findElementById("workexptechstream");
//		Select sel4 = new Select(ws);
//		sel4.selectByValue("Linux");		
		WebElement upload = driver.findElementByXPath("//input[@type='file']");
		upload.sendKeys("C:\\Users\\Admin\\Downloads");
		driver.findElementByXPath("//input[@type='checkbox']").click();
		driver.findElementById("submit").click();
		
		
	}

}
