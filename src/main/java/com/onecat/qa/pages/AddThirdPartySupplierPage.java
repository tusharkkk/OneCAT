package com.onecat.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onecat.qa.base.TestBase;

public class AddThirdPartySupplierPage  extends TestBase{
	
	@FindBy(xpath="//body/div[@id='wrapper']/div[1]/h1[1]")
	WebElement Add_3p_Supplier_Lable;
	
	@FindBy(xpath="//body/div[@id='wrapper']/div[1]/form[1]/p[1]/input[1]")
	WebElement Supplier_name;
	
	@FindBy(xpath="//body/div[@id='wrapper']/div[1]/form[1]/p[2]/input[1]")
	WebElement SWPS_Supplier_code;
	
	@FindBy(xpath="//body/div[@id='wrapper']/div[1]/form[1]/p[3]/input[1]")
	WebElement SWPS_supplier_id;
	
	@FindBy(xpath="//body/div[@id='wrapper']/div[1]/form[1]/p[4]/input[1]")
	WebElement IMCS_code;
	
	@FindBy(xpath="//body/div[@id='wrapper']/div[1]/form[1]/p[5]/input[1]")
	WebElement submit_button;
	
	@FindBy(xpath="//p[contains(text(),'The new supplier has been added.')]")
	WebElement Supplier_added_Message;
	
	
	public AddThirdPartySupplierPage() {
		PageFactory.initElements(driver,this);
	
	}
	
	public void Add3pSupplier() {
		Supplier_name.sendKeys("DemoABCC");
		SWPS_Supplier_code.sendKeys("875266");
		SWPS_supplier_id.sendKeys("5366t2");
		IMCS_code.sendKeys("BCC");
		submit_button.click();
		
		
	}
		
	public String Supplier_added_Messagee() {
		return Supplier_added_Message.getText();
		
		
	}
		
		
		
		
		
	}
	


