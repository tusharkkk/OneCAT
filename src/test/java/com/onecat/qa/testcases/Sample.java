package com.onecat.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {
	
	

	
	
	@Test(enabled=true, alwaysRun=true)
	public void a() {
		System.out.println("A");
		
	}

	@Test(enabled=false, alwaysRun=true)
	public void b() {
		System.out.println("B");
	
}
	
	@Test(enabled=false, alwaysRun=false)
	public void c() {
		System.out.println("C");
	}
	
	@Test(enabled=true, alwaysRun=false)
	public void d() {
		System.out.println("D");
	}
	


}
	
	
	

