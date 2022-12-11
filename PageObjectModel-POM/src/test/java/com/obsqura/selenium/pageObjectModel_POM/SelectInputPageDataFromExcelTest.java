package com.obsqura.selenium.pageObjectModel_POM;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.SelectInputPageDataFromExcelPage;

public class SelectInputPageDataFromExcelTest extends BasePOM {
	SelectInputPageDataFromExcelPage obj;
	@Test
	public void selectSingleInputColorAndVerify() throws IOException {
		obj=new SelectInputPageDataFromExcelPage(driver);
		obj.verifySelectSingleInputColor();
	}
	@Test
	public void SelectMultipleInputColorAndVerify() throws IOException {
		obj=new SelectInputPageDataFromExcelPage(driver);
		obj.verifySelectMultipleInputColor();
	}
	

}
