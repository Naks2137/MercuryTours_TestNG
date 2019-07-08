package com.Utility;

import org.openqa.selenium.chrome.ChromeDriver;

import com.Config.Config;

public class LaunchApp {

	public void openBrowser(String path)
	{
		System.setProperty("webdriver.chrome.driver" ,path);
		Config.driver=new ChromeDriver();
	}
	public void enterUrl(String url)
	{
		Config.driver.get(url);
	}
	public void maximizeBrowser()
	{
		Config.driver.manage().window().maximize();
	}
	
	
}
