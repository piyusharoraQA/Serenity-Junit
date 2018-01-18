package com.practice.Serenity_Junit.Steps;


import org.openqa.selenium.WebDriver;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class SSteps extends PageObject{
	
	public SSteps(WebDriver driver){
		super(driver);
	}

	@Step
	public void launchApplication() {
		getDriver().manage().deleteAllCookies();
		getDriver().navigate().to("https://google.com");
	}

	@Step
	public void navigateToGmail() {
		$("//a[text()='Gmail']").click();
		
	}
	
}