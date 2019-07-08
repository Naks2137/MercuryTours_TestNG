package com.Modules;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import com.Utility.CloseBrowser;
import com.Utility.LaunchApp;
import com.Webpages.RegisterImagePage;
import com.Webpages.RegisterPage;

public class RegisterDemo {

	@Parameters({"path","url"})
	@Test(priority=1)
	public void executeBrowser(String path,String url)
	{
		LaunchApp la=new LaunchApp();
		la.openBrowser(path);
		la.enterUrl(url);
		la.maximizeBrowser();
	}
	@Parameters({"firstname","lastname","phone","mail","add","city","state","pc","coun","usernm","passwd","cpasswd"})
	@Test(priority=2)
	public void verifyRegister(String fn,String ln,String pho,String mail, String addrs,String cty,
			        String state,String postal,String country,String uname,String passwd,String cpasswd )
	{
		RegisterPage rp=new RegisterPage();
		rp.loadPage();
		rp.enterFirstnm(fn);
		rp.enterLastnm(ln);
		rp.enterPhone(pho);
		rp.enterMail(mail);
		rp.enterAdd(addrs);
		rp.enterCity(cty);
		rp.enterState(state);
		rp.enterPostalcode(postal);
		rp.enterCountry(country);
		rp.enterUsername(uname);
		rp.enterPassword(passwd);
		rp.enterConfirmPw(cpasswd);
		rp.clickOnSubmit();
		
		RegisterImagePage rmp=new RegisterImagePage();
		rmp.loadPage();
		rmp.verifyImage();
		
		CloseBrowser cb=new CloseBrowser();
		cb.closeBrowser();
		
		
	}
}
