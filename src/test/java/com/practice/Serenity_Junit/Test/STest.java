package com.practice.Serenity_Junit.Test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.practice.Serenity_Junit.Steps.SSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class STest {
	
	@Managed 
	WebDriver driver;

	@Steps
	SSteps ss;
	
	@Test
	public void testApplication(){

		ss.launchApplication();
		ss.navigateToGmail();

	}

}
