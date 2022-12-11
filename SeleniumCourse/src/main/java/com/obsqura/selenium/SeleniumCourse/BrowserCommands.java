package com.obsqura.selenium.SeleniumCourse;

public class BrowserCommands extends Base {
	public void basicCommands() {
		String actualTitle,actualURL,actualSource,expectedTitle="Obsqura Testing";
		actualTitle=driver.getTitle(); //to get title of the site
		actualURL=driver.getCurrentUrl();  //to get actual url from site
		actualSource=driver.getPageSource();
		if(actualTitle.equals(expectedTitle)) { //to check actual and expected titles are same
			System.out.println("Expected Title and actual Title are same");
		}
		else {
			System.out.println("Titles are not same");
		}
	}
	public void navigateCommands() throws InterruptedException {
		Thread.sleep(2000);
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		Thread.sleep(2000);
		driver.navigate().back();// go to last page
		Thread.sleep(2000);
		driver.navigate().forward(); //again go to the next page
		Thread.sleep(2000);
		driver.navigate().refresh(); //to refresh page
		Thread.sleep(2000);
	}
	public static void main(String[] args) throws InterruptedException {
		BrowserCommands obj=new BrowserCommands();
		obj.initialiseBrowser();
		obj.basicCommands();
		obj.navigateCommands();
		//obj.browserClose(); //to close the browser after operations otherwise multiple browser pages 
		obj.driverQuit();
	}

}
