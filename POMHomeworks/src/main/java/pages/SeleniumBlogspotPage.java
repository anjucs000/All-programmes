package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SeleniumBlogspotPage {
	public WebDriver driver;
	By redCheckbox=By.xpath("//input[@value='red']");
	By operaRadioButton=By.xpath("//input[@value='Opera']");
	public SeleniumBlogspotPage(WebDriver driver) {
		this.driver=driver;
	}
	public void verifyRedCheckBox() {
		WebElement redBox;
		redBox=driver.findElement(redCheckbox);
		if(redBox.isEnabled()) {
			Assert.assertTrue(true, "Red checbox is not enabled");
		}
		if(redBox.isSelected()) {
			Assert.assertTrue(false, "RED checbox is selected already");
		}
	}
	public void verifyRadioButton() {
		WebElement operaButton;
		operaButton=driver.findElement(operaRadioButton);
		if(operaButton.isSelected()) {
			Assert.assertTrue(false, "Radio button is already selected");
		}
	}

}
