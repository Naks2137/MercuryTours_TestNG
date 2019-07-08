package com.Webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Config.Config;
import com.Utility.CloseBrowser;
import com.Utility.LaunchApp;

public class RegisterPage {

	@FindBy(how=How.NAME,using="firstName")
	WebElement fn;
	@FindBy(how=How.NAME,using="lastName")
	WebElement ln;
	@FindBy(how=How.NAME,using="phone")
	WebElement ph;
	@FindBy(how=How.NAME,using="userName")
	WebElement em;
	@FindBy(how=How.NAME,using="address1")
	WebElement add;
	@FindBy(how=How.NAME,using="city")
	WebElement city;
	@FindBy(how=How.NAME,using="state")
	WebElement state;
	@FindBy(how=How.NAME,using="postalCode")
	WebElement pc;
	@FindBy(how=How.NAME,using="country")
	WebElement con;
	@FindBy(how=How.NAME,using="email")
	WebElement usernm;
	@FindBy(how=How.NAME,using="password")
	WebElement pw;
	@FindBy(how=How.NAME,using="confirmPassword")
	WebElement cpw;
	@FindBy(how=How.NAME,using="register")
	WebElement regtn;
	
	
	
	public void loadPage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	public void enterFirstnm(String firstnm)
	{
		fn.sendKeys(firstnm);
	}
	public void enterLastnm(String lastnm)
	{
		ln.sendKeys(lastnm);
	}
	public void enterPhone(String phone)
	{
		ph.sendKeys(phone);
	}
	public void enterMail(String mail)
	{
		em.sendKeys(mail);
	}
	public void enterAdd(String addr)
	{
		add.sendKeys(addr);
	}
	public void enterCity(String citynm)
	{
		city.sendKeys(citynm);
	}
	public void enterState(String statenm)
	{
		state.sendKeys(statenm);
	}
	public void enterPostalcode(String pcode)
	{
		pc.sendKeys(pcode);
	}
	public void enterCountry(String coun)
	{
		con.click();
		Select s=new Select(con);
		s.selectByVisibleText(coun);
		
	}
	public void enterUsername(String username)
	{
		usernm.sendKeys(username);
	}
	public void enterPassword(String passwd)
	{
		pw.sendKeys(passwd);
	}
	public void enterConfirmPw(String cpasswd)
	{
		cpw.sendKeys(cpasswd);
	}
	public void clickOnSubmit()
	{
		regtn.click();
	}
	
	public static void main(String[] args) {
		
		LaunchApp la=new LaunchApp();
		la.openBrowser("G:\\Software\\Selenium\\chromedriver_74\\chromedriver_win32\\chromedriver.exe");
		la.enterUrl("http://newtours.demoaut.com/mercuryregister.php");
		la.maximizeBrowser();
		
		RegisterPage rp=new RegisterPage();
		rp.loadPage();
		rp.enterFirstnm("Nagesh");
		rp.enterLastnm("Raut");
		rp.enterPhone("9405035586");
		rp.enterMail("n.r@gamil.com");
		rp.enterAdd("Baner");
		rp.enterCity("Pune");
		rp.enterState("Maha");
		rp.enterPostalcode("411030");
		rp.enterCountry("INDIA");
		rp.enterUsername("nr123");
		rp.enterPassword("N143");
		rp.enterConfirmPw("N143");
		rp.clickOnSubmit();
		
		RegisterImagePage rmp=new RegisterImagePage();
		rmp.loadPage();
		rmp.verifyImage();
		
		CloseBrowser cb=new CloseBrowser();
		cb.closeBrowser();
		
	}
	
	
	
	
	
	
	
	
	
	
}
