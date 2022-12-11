package com.obsqura.selenium.SeleniumCourse;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver; //declaring object of WebDriver as public bcz we need to use it in diff methods
	
	public WebDriver initialiseBrowser() { //the driver in the below setproperty and above object are different..not same
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anjuc\\eclipse-workspace\\SeleniumCourse\\src\\main\\java\\Resources\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize(); //to maximise the window size
		return driver;
	}
	
	public void browserClose() {
		driver.close();
	}
	
	public static void driverQuit() {
		driver.quit();
	}
	}

