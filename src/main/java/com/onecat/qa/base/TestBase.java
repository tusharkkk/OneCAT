package com.onecat.qa.base;

import java.io.FileInputStream;
//import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.onecat.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;
//import io.netty.handler.codec.base64.Base64;

public class TestBase {
	
public static WebDriver driver;
public static Properties prop;
public TestBase() {
	
	
	try {
		prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\TKhade\\OnecatDemo\\Onecat\\src\\main\\java\\com\\onecat\\qa\\config\\config.properties");
		prop.load(ip);
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException e) {
		e.printStackTrace();
		
	}}

public static void initialization() throws InterruptedException {

	String browserName=prop.getProperty("browser");
	
	
	if(browserName.equals("chrome")) {
	
		//WebDriverManager.chromedriver().setup();
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		
		 //driver = new ChromeDriver(options);
		 //System.out.println("Test");
		 
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\TKhade\\OnecatDemo\\Onecat\\driver\\chromedriver.exe");
		
	driver=new ChromeDriver();
		
	
	((HasAuthentication)driver).register(UsernameAndPassword.of("TKhade@slb.com", "Kolhapur@143"));
	
		//((HasAuthentication)driver).register(UsernameAndPassword.of(prop.getProperty("username", "password"), "chrome"));
		
	}
	
	else if(browserName.equals("FF")){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TKhade\\OneDrive - Capgemini\\Desktop\\Chrome");//path is not correct
		driver=new FirefoxDriver();
		
	
	
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
	
	
	
	
	// Get Dev Tools
   // DevTools chromeDevTools = ((ChromeDriver) driver).getDevTools();
    // Create Session
   // chromeDevTools.createSession(); // Calling this throws an exception
    // Enable Performance
    //chromeDevTools.send(Performance.enable(Optional.of(Performance.EnableTimeDomain.TIMETICKS)));
	
	
	driver.get(prop.getProperty("url"));

	
	driver.navigate().refresh();
	Thread.sleep(2000);
	
	
	
	
	
	
}

}
