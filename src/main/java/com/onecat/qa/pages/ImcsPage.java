package com.onecat.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onecat.qa.base.TestBase;
import com.onecat.util.TestUtil;

public class ImcsPage extends TestBase{
	
	
	
	@FindBy(xpath="//body/div[@id='wrapper']/div[1]/h1[1]")
	WebElement ImcsPageLable;
	
	@FindBy(xpath="//a[contains(text(),'Add 3P Supplier')]")
	WebElement ClickOnAdd3PSupplier;
	
	@FindBy(partialLinkText="Create New Material")
	WebElement CreateNewMaterial;
	
	public ImcsPage() {
		PageFactory.initElements(driver,this);
	
	}	
	public boolean verifyImcsLable() {
		 return ImcsPageLable.isDisplayed();
	}
	
	public AddThirdPartySupplierPage clickOn3pSupplier() {
		ClickOnAdd3PSupplier.click();
		return new AddThirdPartySupplierPage();
	}
	
	public CreateNewSPNPage clickOnNewmaterialLink() {
		
		CreateNewMaterial.click();
		return new CreateNewSPNPage();
	}

}
