package com.onecat.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.onecat.qa.base.TestBase;

public class CreateNewSPNPage extends TestBase {
	@FindBy(xpath="//button[contains(text(),'Class Type not found')]")
	WebElement clickOnOldTool;
	
	
	public CreateNewSPNPage() {
		PageFactory.initElements(driver,this);
	}
	
	public CreateSpnOldToolPage  clickOnOldtool() {
		clickOnOldTool.click();
		return new CreateSpnOldToolPage();
	}
	
	
	//public void createNewSPN(String title, String ftName, String ltName, String comp){
		//Select select = new Select(driver.findElement(By.name("title")));
		//select.selectByVisibleText(title);
		
		//firstName.sendKeys(ftName);
		//lastName.sendKeys(ltName);
		//company.sendKeys(comp);
		//saveBtn.click();
		
	}


