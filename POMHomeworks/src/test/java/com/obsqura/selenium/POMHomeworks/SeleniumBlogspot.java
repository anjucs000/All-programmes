package com.obsqura.selenium.POMHomeworks;

import org.testng.annotations.Test;

import pages.SeleniumBlogspotPage;

public class SeleniumBlogspot extends Base{
	SeleniumBlogspotPage obj;
	@Test
	public void verifyRedCheckboxSelected() {
		obj=new SeleniumBlogspotPage(driver);
		obj.verifyRedCheckBox();
	}
	@Test
	public void verifyOperaRadioButtonSelected() {
		obj=new SeleniumBlogspotPage(driver);
		obj.verifyRadioButton();
	}

}
