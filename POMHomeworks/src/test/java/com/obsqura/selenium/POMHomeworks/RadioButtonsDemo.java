package com.obsqura.selenium.POMHomeworks;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.RadioButtonsDemoPage;

public class RadioButtonsDemo extends Base {
	RadioButtonsDemoPage obj;
	@Test
	public void verifyMaleFemaleButtonsNotSelectedAndMessage() throws IOException {
		obj=new RadioButtonsDemoPage(driver);
		obj.verifyMaleFemaleRadioButtonEnabledOrNot();
	}

}
