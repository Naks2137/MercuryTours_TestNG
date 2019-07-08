package com.Webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Config.Config;

public class RegisterImagePage {

	@FindBy(how=How.XPATH,using="//img[@src='/images/masts/mast_register.gif']")
	WebElement icon;
	
	public void loadPage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	public void verifyImage()
	{
		Assert.assertTrue(icon.isDisplayed());
		System.out.println("User registered successfully");
	}
	
}
