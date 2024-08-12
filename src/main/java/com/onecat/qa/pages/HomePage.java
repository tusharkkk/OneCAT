package com.onecat.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onecat.qa.base.TestBase;

public class HomePage extends TestBase{
	//Page factory
	@FindBy(xpath="/html[1]/body[1]/a[17]/div[1]")
	WebElement IMCS_Tab;
	
	@FindBy(xpath="/html[1]/body[1]/a[5]/div[1]")
	WebElement Product_Tab;
	
	@FindBy(xpath="/html[1]/body[1]/a[8]/div[1]")
	WebElement Product_quickAdd;
	
	@FindBy(xpath="")
	WebElement Product_search;
	
	@FindBy(xpath="")
	WebElement R4DB_Tab;
	
	
	@FindBy(xpath="//tbody/tr[1]/td[3]/a[1]/img[1]")
	WebElement OnecatLogo;
	
	
	
	@FindBy(xpath="")
	WebElement Admin_tab;
	
	@FindBy(xpath="")
	WebElement LogOut;
	
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	
	}	
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateOnecatLogoImage() {
		return OnecatLogo.isDisplayed();
	}
public ImcsPage ClickOnImcsLink() {
	
	IMCS_Tab.click();
	return new ImcsPage();
	}

public QuickAddPage ClickOnProductQuickadd() {
	Product_Tab.click();
	Product_quickAdd.click();
	return new QuickAddPage(); 
}

}



