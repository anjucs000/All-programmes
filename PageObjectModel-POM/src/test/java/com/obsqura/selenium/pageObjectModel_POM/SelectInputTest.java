package com.obsqura.selenium.pageObjectModel_POM;

import org.testng.annotations.Test;

import pages.SelectInputPage;

public class SelectInputTest extends BasePOM {
	SelectInputPage obj;
	@Test
	public void selectColorAndVerifySelectMultipleInputColor() {
	obj = new SelectInputPage(driver);
	obj.verifySelectMultipleInputColor();
	}
	@Test
	public void selectColorAndVerifySelectSingleInputColor() {
		obj = new SelectInputPage(driver);
		obj.verifySelectSingleInputColor();
	}
	}

