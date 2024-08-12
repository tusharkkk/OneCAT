package com.onecat.qa.testcases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.onecat.qa.base.TestBase;
import com.onecat.qa.pages.AddThirdPartySupplierPage;
import com.onecat.qa.pages.CreateNewSPNPage;
import com.onecat.qa.pages.CreateSpnOldToolPage;
import com.onecat.qa.pages.HomePage;
import com.onecat.qa.pages.ImcsPage;
import com.onecat.util.TestUtil;

public class CreateNewSPNTest extends TestBase {

	HomePage homePage;
	TestUtil testUtil;
	ImcsPage imcsPage;
	CreateNewSPNPage createNewSPN;
	CreateSpnOldToolPage oldtool;
	String sheetName = "SPN";

	public CreateNewSPNTest() {
		super();
	}

	@BeforeMethod(alwaysRun = true)
	public void setUp() throws InterruptedException {
		initialization();
		homePage = new HomePage();
		testUtil = new TestUtil();
		imcsPage = new ImcsPage();
		createNewSPN = new CreateNewSPNPage();
		oldtool = new CreateSpnOldToolPage();
	}

	// @AfterMethod(alwaysRun=true)
	// public void tearDown() {
	// driver.quit();
	// }

	@DataProvider
	public Object[][] getSPNTestData() throws InvalidFormatException {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;

	}

	/*
	 * @Test(priority=2, dataProvider="getSPNTestData") public void
	 * validateCreateNewContact(String SPN, String PartDescription, String Supplier
	 * , String UnitCost,String UOM, String ProductGroup, String
	 * ProductClassMajor,String ProductClassMinor,String SAPInventoryType){
	 * testUtil.switchToFrame1(); homePage.ClickOnImcsLink();
	 * testUtil.switchtoDefaultFrame(); testUtil.switchtoframe3();
	 * imcsPage.clickOnNewmaterialLink(); createNewSPN.clickOnOldtool();
	 * 
	 * }
	 */

	@Test(priority = 1, dataProvider = "getSPNTestData")
	public void crete_new_spn_old_tool(String SPN, String PartDescription, String Supplier, String UnitCost, String UOM,
			String ProductGroup, String ProductClassMajor, String ProductClassMinor, String SAPInventoryType)
			throws InterruptedException {
		testUtil.switchToFrame1();
		homePage.ClickOnImcsLink();
		testUtil.switchtoDefaultFrame();
		testUtil.switchtoframe3();
		imcsPage.clickOnNewmaterialLink();
		createNewSPN.clickOnOldtool();

		String mainWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> iterator = allWindowHandles.iterator();

		// Here we will check if child window has other child windows and will fetch the
		// heading of the child window
		while (iterator.hasNext()) {
			String ChildWindow = iterator.next();
			if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);

				oldtool.CreateNewSPNfromOldTool(SPN, PartDescription, Supplier, UnitCost, UOM, ProductGroup,
						ProductClassMajor, ProductClassMinor, SAPInventoryType);

			}

		}

		ArrayList<String> list = new ArrayList<String>(driver.getWindowHandles());

		System.out.println(list.size());
		driver.switchTo().window(list.get(2));
		 driver.findElement(By.xpath("//input[@id='btncontinue']")).click();
		

		//WebElement m = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td/input[1]"));
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();", m);

	}

}
