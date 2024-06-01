package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_HRM_Automate {
//Orange_HRM_Automate
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\New Selenium\\driver\\chromedriver.exe"); 
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(3000);
		 //username
		 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		 Thread.sleep(3000);
		 //password
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(3000);
		 
		 //click on admin
		 driver.findElement(By.xpath("//li[1]//a[1]//span[1]")).click();
		 //insert username
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		 Thread.sleep(3000);
		 ////div[contains(text(),'Admin')]
		 
		 

		 
		 
		 
		// driver.close();
		 
		 
		
		 
		 
	}

}
