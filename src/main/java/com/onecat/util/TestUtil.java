package com.onecat.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.onecat.qa.base.TestBase;
import com.sun.media.sound.InvalidFormatException;

public class TestUtil extends TestBase {
public static long PAGE_LOAD_TIMEOUT=30;
public static long IMPLICIT_WAIT=20;

public static String TESTDATA_SHEET_PATH="C:\\Users\\TKhade\\OnecatDemo\\Onecat\\src\\main\\java\\com\\onecat\\qa\\testdata\\PartCreationData.xlsx";
public static Workbook book;
public static Sheet sheet;



public void switchToFrame() {
	//Logos
	driver.switchTo().frame("top_header_frame");
	
}

public void switchToFrame1() {
	//Main Tabs
	driver.switchTo().frame("top_nav_frame");
}

public void switchtoDefaultFrame() {
	driver.switchTo().defaultContent(); 
	
}

public void switchtoframe3() {
	//Main body frame
	driver.switchTo().frame("body_frame");
}

public static Object[][] getTestData(String sheetName) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException {
	FileInputStream file = null;
	try {
		file = new FileInputStream(TESTDATA_SHEET_PATH);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	try {
		book = WorkbookFactory.create(file);
	} catch (InvalidFormatException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	sheet = book.getSheet(sheetName);
	Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	// System.out.println(sheet.getLastRowNum() + "--------" +
	// sheet.getRow(0).getLastCellNum());
	for (int i = 0; i < sheet.getLastRowNum(); i++) {
		for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
			data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
			// System.out.println(data[i][k]);
		}
	}
	return data;
}


}
