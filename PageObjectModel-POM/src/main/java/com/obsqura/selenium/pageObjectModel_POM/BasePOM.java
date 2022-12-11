package com.obsqura.selenium.pageObjectModel_POM;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasePOM {
public WebDriver driver;
	
	@BeforeMethod
	public void initialiseBrowser() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\chromedriver.exe");	
		driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//old format
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//new format
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
