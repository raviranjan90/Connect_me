package com.onpassivewebinar.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass implements AutoConstants{
	
public static WebDriver driver;
	
	@BeforeClass
	public void openBrowser() throws Throwable {
		FileLibrary fl = new FileLibrary();
		String browserValue = fl.getPropKeyvalue(PROPERTIES_PATH, "browser");

		if(browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver = new ChromeDriver();
		}
		else if (browserValue.equalsIgnoreCase("firefox")) {
			System.setProperty(FIREFOX_KEY, FIREFOX_PATH);
			driver = new FirefoxDriver();
		}
		else if (browserValue.equalsIgnoreCase("ie")) {
			System.setProperty(IDE_KEY, IED_PATH);
			driver = new InternetExplorerDriver();
		}
		else {
			System.out.println("!!................Please select valid browser............!!");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		String test_URL =fl.getPropKeyvalue(PROPERTIES_PATH,"url");
		driver.get(test_URL);
	}
//	@AfterClass
//	public void tearDown() {
//		driver.close();
//	}

}
