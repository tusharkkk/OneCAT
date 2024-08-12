package com.onecat.qa.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.onecat.qa.base.TestBase;

public class GeneralInfoPage extends TestBase {
	@FindBy(xpath="//option[contains(text(),'ABC')]")
	WebElement GeoUnit;
	
	@FindBy(xpath="//option[contains(text(),'Bolivia')]")
	WebElement Country;
	
	@FindBy(xpath="//tbody/tr[4]/td[2]/a[1]/img[1]")
	WebElement calenderIconForShipDate;
	
	@FindBy(xpath="/html[1]/body[1]/font[1]/table[2]/tbody[1]/tr[6]/td[2]/font[1]/a[1]/font[1]/b[1]")
	WebElement shipdate;
	
	@FindBy(xpath="//tbody/tr[5]/td[2]/a[1]/img[1]")
	WebElement calenderIconForCostReqDate;
	
	@FindBy(xpath="//tbody/tr[4]/td[3]")
	WebElement costrequiredDate;
	
	@FindBy(xpath="//body[1]/form[1]/table[2]/tbody[1]/tr[2]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	WebElement CustomerPickBtn;
	
	@FindBy(xpath="//tbody/tr[5]/td[1]/a[1]")
	WebElement SelectCustomer;
	
	@FindBy(xpath="//tbody/tr[1]/td[2]/input[2]")
	WebElement nextBtn;
	
	@FindBy(xpath="//input[@id='btn']")
	WebElement nextBtninRivewPage;
	
	
	
	
	
	public GeneralInfoPage() {
		PageFactory.initElements(driver,this);
	
	}	
	
	public QuotePage fillGeneralInfo() {
		GeoUnit.click();
		Country.click();
		calenderIconForShipDate.click();
	
		//String SDate=driver.getWindowHandle();
		//driver.switchTo().window(SDate);
		//System.out.println(driver.getTitle());
		
		
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
		Date date = new Date();
		String date1= dateFormat.format(date);
		 System.out.println(date1);
		
		 
		shipdate.click();
		calenderIconForCostReqDate.click();
		costrequiredDate.sendKeys();
		CustomerPickBtn.click();
		SelectCustomer.sendKeys();
		nextBtn.click();
		nextBtninRivewPage.click();
		return new QuotePage();
	}


}
