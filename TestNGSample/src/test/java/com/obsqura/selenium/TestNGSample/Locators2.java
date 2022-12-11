package com.obsqura.selenium.TestNGSample;

import org.openqa.selenium.By;
//all elements are from simple form demo page of obsqura

public class Locators2 extends Base{
	
	public void locateByStartsWith() {//using xpath starts with,when field changes value dynamically like while refreshing and all
		driver.findElement(By.xpath("//input[starts-with(@id,'single-input')]"));
	}
	public void locateByTextof() { //locating by text of
		driver.findElement(By.xpath("//label[text()='Enter Message']"));
	}
	/************************************/
	//Axes methods
	
	public void locateByChild() { //here form-group is parent class and it have 2 childs.
		//among them one of the child is label,which have unique text().so we gave in the below format
		driver.findElement(By.xpath("//div[@class='form-group']//child::label[text()='Enter Message']"));
		//below child dont have text() ,so we took id
		driver.findElement(By.xpath("//div[@class='form-group']//child::input[@id='single-input-field']"));
	}
	public void locateByParent() {//taking child element's xpath and traverse to parent
		driver.findElement(By.xpath("//input[@id='single-input-field']//parent::div"));
		
	}
	public void locateByAncestor() {
		//this will show all ancestors of this element
		driver.findElement(By.xpath("//input[@id='single-input-field']//ancestor::div"));
		//to find a particular ancestor class.Here using ancestor and class name
		driver.findElement(By.xpath("//input[@id='single-input-field']//ancestor::div[@class='container page']"));
	}
	public void locateByFollowing() {
		//this will find the following elements with that attribute.Below it will show all div elements below the xpath element
		driver.findElement(By.xpath("//input[@id='single-input-field']//ancestor::div[@class='container page']"));
		//this will find all elements which have tag as label
		driver.findElement(By.xpath("//input[@id='single-input-field']//following::label"));
	}
	public void locateByPreceding() {
		//this will find all elements which have tag div above the specified xpath element
		driver.findElement(By.xpath("//input[@id='single-input-field']//preceding::div"));
		//below sample will find the tag header above the specified element
		driver.findElement(By.xpath("//input[@id='single-input-field']//preceding::header"));
	}
	public void locateByFollowingSibling() {
		//here under one parent ,two child elements are there so these are siblings.
		//We can find one element's xpath and then take the next sibling
		driver.findElement(By.xpath("//label[text()='Enter Message']//following-sibling::input"));
	}
	public void locateBySelf() {
		//finding that element by itself.
		driver.findElement(By.xpath("//label[text()='Enter Message']//self::label"));
	}

}
