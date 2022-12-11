package pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SelectInputPage {
	public WebDriver driver;
	By selectInputField = By.xpath("//select[@id='single-input-field']");
	By actualMessage = By.xpath("//div[@id='message-one']");
	By multipleInputField = By.xpath("//select[@id='multi-select-field']");
	By getFirstSelectedButton = By.xpath("//button[@id='button-first']");
	By getAllSelectedButton = By.xpath("//button[@id='button-all']");
	By multipleActualMessage = By.xpath("//div[@id='message-two']");
	
	public SelectInputPage(WebDriver driver) {
		this.driver=driver;
	}
	public void verifySelectSingleInputColor() {
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		String actualTitle=driver.getTitle();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(1000));
		wait.until(ExpectedConditions.titleContains(actualTitle));
		wait.until(ExpectedConditions.numberOfWindowsToBe(1));
		String inputText="Red",expectedOutput="Selected Color : "+inputText;
		String actualOutput;
		Select inputSelect = new Select(driver.findElement(selectInputField));
		inputSelect.selectByVisibleText(inputText);
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.presenceOfElementLocated(actualMessage));
		wait1.until(ExpectedConditions.textToBePresentInElementLocated(actualMessage,"Selected Color "));
		actualOutput=driver.findElement(actualMessage).getText();
		Assert.assertEquals(actualOutput, expectedOutput, inputText+" is not selected");

	}
	public void verifySelectMultipleInputColor() {

		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		String inputColor1="Red",inputColor2="Yellow",inputColor3="Green";
		String expectedOutput="All selected colors are : "+inputColor3;
		String actualOutput;
		Select multipleSelect = new Select(driver.findElement(multipleInputField));
		multipleSelect.isMultiple();
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeClickable(getAllSelectedButton));
		multipleSelect.selectByVisibleText("Red");
		multipleSelect.selectByVisibleText("Yellow");
		multipleSelect.selectByVisibleText("Green");
		driver.findElement(getAllSelectedButton).click();
		actualOutput=driver.findElement(multipleActualMessage).getText();
		Assert.assertEquals(expectedOutput, actualOutput);	
		
		
	}
}