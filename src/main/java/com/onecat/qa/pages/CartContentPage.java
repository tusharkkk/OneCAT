package com.onecat.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onecat.qa.base.TestBase;

public class CartContentPage extends TestBase{
	
	@FindBy(xpath="//input[@id='cartcheckout']")
	WebElement checkout;
	
	@FindBy(xpath="//body[1]/form[1]/table[2]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[7]/table[1]/tbody[1]/tr[2]/td[1]/input[1]")
	WebElement SelectSupplierRedioButton;
	
	@FindBy(xpath="//td[contains(text(),'ADMIRAL')]")
	WebElement SelectSupplier;
	
	public CartContentPage() {
		PageFactory.initElements(driver,this);
	
	}	
	
	public GeneralInfoPage ClickOnCheckout() {
		//SelectSupplierRedioButton.click();
		checkout.click();
		return new GeneralInfoPage();
	}


}
