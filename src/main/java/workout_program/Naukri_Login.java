package workout_program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_Login {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/nlogin/login");
		Thread.sleep(5000);
		driver.findElementById("usernameField").sendKeys("anitasma94@gmail.com");
		Thread.sleep(3000);
		driver.findElementById("passwordField").sendKeys("Satish@14");
		Thread.sleep(3000);
		driver.findElementByXPath("//button").click();
		
	}

}
