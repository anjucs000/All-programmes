package com.obsqura.selenium.POMHomeworks;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Locators extends Base {
	@Test
	public void locateByID() {
		driver.findElement(By.id("value-a")).sendKeys("5");
	}
	public void locateByClass() {
		driver.findElement(By.className("form-control"));//more than 1 field present with this classname.Took this just for learning
	}
	public void locateByName() {//DIDNT GET ANY NAME
		driver.findElement(By.name("FD"));
	}
	public void locateByTagname() {//3 elements are there
		driver.findElement(By.tagName("label"));
	}
	public void locateByLinkText() {
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(By.linkText("check-box-demo.php"));
	}
	public void locateByPartialLinkText() {
		driver.findElement(By.partialLinkText("check-box-demo"));
	}
}
