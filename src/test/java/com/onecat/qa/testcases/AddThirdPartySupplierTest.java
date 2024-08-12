package com.onecat.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.onecat.qa.base.TestBase;
import com.onecat.qa.pages.AddThirdPartySupplierPage;
import com.onecat.qa.pages.HomePage;
import com.onecat.qa.pages.ImcsPage;
import com.onecat.util.TestUtil;

public class AddThirdPartySupplierTest extends TestBase{
	
	HomePage homePage;
	TestUtil testUtil;
	ImcsPage imcsPage;
	AddThirdPartySupplierPage add3p;
	
	public AddThirdPartySupplierTest() {
		super();

}
	@BeforeMethod(alwaysRun=true)
	public void setUp() throws InterruptedException {
		initialization();
		homePage=new HomePage();
		testUtil=new TestUtil();
		imcsPage=new ImcsPage();	
		add3p=new AddThirdPartySupplierPage();
	}
	
	@AfterMethod(alwaysRun=true)
	public void tearDown() {
		driver.quit();
	}
	
	
	@Test 
	public void Create_3P_supplier() {
		testUtil.switchToFrame1();
		homePage.ClickOnImcsLink();
		testUtil.switchtoDefaultFrame();
		testUtil.switchtoframe3();
		imcsPage.clickOn3pSupplier();
		add3p.Add3pSupplier();
	    String title=add3p.Supplier_added_Messagee();
	    Assert.assertEquals(title, "The new supplier has been added.");
	    
	    
	    
	    System.out.println(title);
	
		
		
		
	}


}
