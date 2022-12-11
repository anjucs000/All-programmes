package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utilities.ExcelUtility;

public class RadioButtonsDemoPage {
	public WebDriver driver;
	By maleRadioButton=By.xpath("//input[@id='inlineRadio1']");
	By femaleRadioButton=By.xpath("//input[@id='inlineRadio2']");
	By showSelectedValue=By.xpath("//button[text()='Show Selected Value']");
	By actualMessage=By.xpath("//div[@id='message-one']");
	public RadioButtonsDemoPage(WebDriver driver) {
		this.driver=driver;
	}
	public void verifyMaleFemaleRadioButtonEnabledOrNot() throws IOException {
		ExcelUtility obj=new ExcelUtility();
		WebElement male,female,actualText;
		String actualValue,expectedValue;
		Boolean isMaleSelected,isFemaleSelected,isMaleEnabled,isFemaleEnabled;
		male=driver.findElement(maleRadioButton);
		female=driver.findElement(femaleRadioButton);
		isMaleSelected=male.isSelected();
		isFemaleSelected=female.isSelected();
		isMaleEnabled=male.isEnabled();
		isFemaleEnabled=female.isEnabled();
		if((isMaleEnabled && isFemaleEnabled)==true) {
			if((isMaleSelected && isFemaleSelected)==false ) {
				driver.findElement(showSelectedValue).click();
				actualText=driver.findElement(actualMessage);
				actualValue=actualText.getText();
				expectedValue=obj.readData(1, 0, "\\src\\main\\java\\Resources\\TestData.xlsx", "Radio buttons Demo");
				Assert.assertEquals(actualValue, expectedValue, "Actual and expected values are not equal");
			}
			Assert.assertFalse(false, "Radio buttons are already selected");
		}
		Assert.assertFalse(false, "Radio buttons are not enabled");
		
	}

}
