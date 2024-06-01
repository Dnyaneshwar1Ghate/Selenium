package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HotelApp{

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\Software\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		 
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.adactin.com/HotelApp/index.php");
		driver.findElement(By.id("username")).sendKeys("dghate");
		driver.findElement(By.id("password")).sendKeys("npav123");
		
		String s =driver.getCurrentUrl();
		if(s.equals("http://www.adactin.com/HotelApp/index.php"))
		{
			System.out.println(" Correct");
		}
		else {
			System.out.println("Not Correct ");
		}
		driver.quit();
		
	}
}
