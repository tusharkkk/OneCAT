package com.onecat.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.onecat.qa.base.TestBase;

public class CreateSpnOldToolPage extends TestBase {
	@FindBy(xpath = "//tbody/tr[1]/td[1]/input[1]")
	WebElement EnterSPN;

	@FindBy(xpath = "//tbody/tr[2]/td[1]/input[1]")
	WebElement PartDesc;

	@FindBy(xpath = "//tbody/tr[4]/td[1]/span[1]/span[1]/span[1]")
	WebElement selectVendor;

	@FindBy(xpath = "//tbody/tr[5]/td[1]/input[3]")
	WebElement ClickOnPartClassificationButton;

	@FindBy(xpath = "//tbody/tr[5]/td[1]/input[1]")
	WebElement EnterUnitCost;

	@FindBy(xpath = "//select[@id='uom']")
	WebElement SelectUOM;

	@FindBy(xpath = "//tbody/tr[9]/td[1]/select[1]")
	WebElement SelectProductGroup;

	@FindBy(xpath = "//tbody/tr[10]/td[1]/select[1]")
	WebElement SelectProductClassMajor;

	@FindBy(xpath = "//tbody/tr[11]/td[1]/select[1]")
	WebElement SelectProductClassMinor;

	@FindBy(xpath = "//select[@id='SAPInventoryType']")
	WebElement SelectSAPInvType;

	@FindBy(xpath = "//input[@id='btnSaveClassificationInfo']")
	WebElement SaveClassificationbtn;

	public CreateSpnOldToolPage() {
		PageFactory.initElements(driver, this);
	}

	public void CreateNewSPNfromOldTool(String SPN, String PartDescription, String Supplier, String UnitCost,
			String UOM, String ProductGroup, String ProductClassMajor, String ProductClassMinor,
			String SAPInventoryType) {

		EnterSPN.sendKeys(SPN);
		PartDesc.sendKeys(PartDescription);
		Select vendor = new Select(driver.findElement(By.name("part_splyr")));
		vendor.selectByVisibleText(Supplier);
		ClickOnPartClassificationButton.click();

		EnterUnitCost.sendKeys(UnitCost);

		Select uomValue = new Select(driver.findElement(By.name("uom")));
		uomValue.selectByVisibleText(UOM);

		Select PrdGrp = new Select(driver.findElement(By.name("SalesMajor")));
		PrdGrp.selectByVisibleText(ProductGroup);

		Select PdtMajor = new Select(driver.findElement(By.name("InvMajor")));
		PdtMajor.selectByVisibleText(ProductClassMajor);

		Select PdtMinor = new Select(driver.findElement(By.name("InvMinor")));
		PdtMinor.selectByVisibleText(ProductClassMinor);

		Select SAPinvTypee = new Select(driver.findElement(By.name("SAPInventoryType")));
		SAPinvTypee.selectByVisibleText(SAPInventoryType);

		SaveClassificationbtn.click();
		//driver.close();

		/*
		 * String mainWindowHandle = driver.getWindowHandle(); Set<String>
		 * allWindowHandles = driver.getWindowHandles(); Iterator<String> iterator =
		 * allWindowHandles.iterator();
		 * 
		 * // Here we will check if child window has other child windows and will fetch
		 * the // heading of the child window while (iterator.hasNext()) { String
		 * ChildWindow = iterator.next(); if
		 * (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
		 * driver.switchTo().window(ChildWindow); String a = driver.getTitle();
		 * System.out.println("we are on continue wondow");
		 * driver.findElement(By.xpath("//input[@id='btncontinue']")).click(); } }
		 */
	}
}
