package com.onecat.qa.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.onecat.qa.base.TestBase;
import com.onecat.qa.pages.HomePage;
import com.onecat.qa.pages.ImcsPage;
import com.onecat.util.TestUtil;

public class HomePageTest extends TestBase{
	HomePage homePage;
	TestUtil testUtil;
	ImcsPage imcsPage;
	
	
	//Constructor 
	public HomePageTest() {
		super(); //it will call TestBase class
		
	}
@BeforeMethod(alwaysRun=true)
public void setUp() throws InterruptedException {
	initialization();
	
	homePage=new HomePage();
	testUtil=new TestUtil();
	imcsPage=new ImcsPage();
	// Thread.sleep(2000);

}
@Test (priority=3,groups="sanity")
public void HomePageTitleTest() {
	String title=homePage.validateHomePageTitle();
	Assert.assertEquals(title, "OneCAT");
	System.out.println(title);
	
}

@Test(priority=1,groups="sanity")
public void OneCatLogoImageTest() {
	testUtil.switchToFrame();
	boolean flag=homePage.validateOnecatLogoImage();
	Assert.assertTrue(flag);
	}


@Test(priority=2)
public void clickOnImcsTab_Test() {
	testUtil.switchToFrame1();
	imcsPage=homePage.ClickOnImcsLink();
	
}



@AfterMethod(alwaysRun=true)
public void tearDown() {
	driver.quit();
}
	
	
}
