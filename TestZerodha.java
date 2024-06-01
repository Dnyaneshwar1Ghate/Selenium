package Selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestZerodha {
	
	WebDriver driver;
	@Test (invocationCount = 1)
	public void get() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\Software\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		 
		WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/main/div/div/div/div[3]/div/form/div/input")).sendKeys("8989038643");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mobileGroup\"]/div/input")).sendKeys("9767101438");
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//*[@id=\"sendOtpButton\"]")).click();
		Thread.sleep(3000);
		driver.close();
	}
	

}
