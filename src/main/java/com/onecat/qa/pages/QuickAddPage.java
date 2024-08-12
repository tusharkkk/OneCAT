package com.onecat.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onecat.qa.base.TestBase;
import com.onecat.util.TestUtil;

public class QuickAddPage extends TestBase{
	

	
	@FindBy(xpath="//tbody/tr[2]/td[3]/input[1]")
	WebElement AddPN;
	
	@FindBy(xpath="//tbody/tr[12]/td[1]/input[1]")
	WebElement VerifyBtn;
	
	@FindBy(xpath="//tbody/tr[12]/td[1]/input[2]")
	WebElement AddBtn;
	
	@FindBy(xpath="//a[contains(text(),'View Cart')]")
	WebElement ViewCart;
		
	
	
	public QuickAddPage() {
		PageFactory.initElements(driver,this);
	
	}	
	public CartContentPage AddPartNumber()  {
	
		AddPN.sendKeys("103678878");
	
		VerifyBtn.click();
		AddBtn.click();
		ViewCart.click();
		return new CartContentPage();
		
		
		
	}
		
	
	
	

}
