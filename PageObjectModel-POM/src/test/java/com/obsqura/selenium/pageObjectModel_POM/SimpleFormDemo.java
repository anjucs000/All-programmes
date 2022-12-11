package com.obsqura.selenium.pageObjectModel_POM;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.SimpleFormDemoPage;

public class SimpleFormDemo extends BasePOM{
	SimpleFormDemoPage simpleFormDemoPageObj;
	@Test
	public void enterMessageAndVerifySingleInputField() {
		simpleFormDemoPageObj=new SimpleFormDemoPage(driver);
		simpleFormDemoPageObj.verifySingleInputField();
	}
	@Test
	public void verifyDragAndDrop() {
		simpleFormDemoPageObj=new SimpleFormDemoPage(driver);
		simpleFormDemoPageObj.DragAndDropMethod();
	}
	

}
