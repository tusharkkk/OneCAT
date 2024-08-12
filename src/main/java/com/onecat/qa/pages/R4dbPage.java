package com.onecat.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onecat.qa.base.TestBase;

public class R4dbPage extends TestBase{
	
	@FindBy(xpath="//*[contains(@name,'rfq_id')]")
	WebElement RFQ_Filed;


	
	public R4dbPage() {
		PageFactory.initElements(driver,this);
	
	}	
}
