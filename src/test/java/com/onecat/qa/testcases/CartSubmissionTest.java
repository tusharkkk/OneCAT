package com.onecat.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onecat.qa.base.TestBase;
import com.onecat.qa.pages.AddThirdPartySupplierPage;
import com.onecat.qa.pages.CartContentPage;
import com.onecat.qa.pages.GeneralInfoPage;
import com.onecat.qa.pages.HomePage;
import com.onecat.qa.pages.ImcsPage;
import com.onecat.qa.pages.QuickAddPage;
import com.onecat.qa.pages.QuotePage;
import com.onecat.qa.pages.R4dbPage;
import com.onecat.util.TestUtil;

public class CartSubmissionTest extends TestBase{
	HomePage homePage;
	TestUtil testUtil;
	QuickAddPage quickaddpage;
	CartContentPage cartContantpage;
	GeneralInfoPage generalInfopage;
	QuotePage quotePage;
	R4dbPage r4dbPage;
	
	
	
	
	public CartSubmissionTest() {
		super();
}
	
	
	@BeforeMethod(alwaysRun=true)
	public void setUp() throws InterruptedException {
		initialization();
		homePage=new HomePage();
		testUtil=new TestUtil();
		quickaddpage=new QuickAddPage();
		cartContantpage=new CartContentPage();
		generalInfopage=new GeneralInfoPage();
	}
	
	@AfterMethod(alwaysRun=true)
	public void tearDown() {
		driver.quit();
	}
	
	
	
	@Test
	public void CreateShoppingCartTest() throws InterruptedException  {
		testUtil.switchToFrame1();
		homePage.ClickOnProductQuickadd();
		
		testUtil.switchtoDefaultFrame();
		testUtil.switchtoframe3();

		quickaddpage.AddPartNumber();
		cartContantpage.ClickOnCheckout();
		Thread.sleep(20000);
		generalInfopage.fillGeneralInfo();
		Thread.sleep(2000);
		
		
		
		
	}
}