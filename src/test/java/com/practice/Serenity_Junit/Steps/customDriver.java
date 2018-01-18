package com.practice.Serenity_Junit.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import jline.internal.Log;
import net.thucydides.core.webdriver.DriverSource;

public class customDriver implements DriverSource{
	
	WebDriver driver;
	
	public WebDriver newDriver() {
		System.setProperty("webdriver.chrome.driver", "resouces/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		Log.info("Cookies Deleted");
		return driver;
	}

	public boolean takesScreenshots() {

		return false;
	}

}
