package com.mobiotics.Test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.mobiotics.Constant.BaseTest;
import com.mobiotics.Page.HamburgerMenuPage;
import com.mobiotics.Page.HomePage;
import com.mobiotics.Page.LookupPage;
import com.mobiotics.Page.SignInAuthPage;

public class LoginTest extends BaseTest {
	
	@Test(enabled=true)
	public void login() throws InterruptedException, AWTException
	{
		HomePage homePage = new HomePage(driver);
		
		homePage.clickOnHambergermenu();
		
	}

}
