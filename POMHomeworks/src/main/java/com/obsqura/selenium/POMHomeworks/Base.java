package com.obsqura.selenium.POMHomeworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Base {
	public WebDriver driver;
	@BeforeMethod
	public void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjuc\\eclipse-workspace\\POMHomeworks\\src\\main\\java\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		//driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		
	}
	//@AfterMethod
	public void browserClose() {
		driver.close();
	}

}
