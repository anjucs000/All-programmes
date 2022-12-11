package com.obsqura.selenium.SeleniumCourse;

import org.junit.Test;

public class BrowserCheck extends Base {
	@Test
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
}
