package com.mobiotics.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.Constant.BasePage;
import com.mobiotics.Constant.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class HomePage extends BasePage {
	public HomePage(AndroidDriver<MobileElement> driver)
	{
		super(driver);
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(id="com.sdg.android:id/menuFragment")
	private WebElement menuSection;
	
	@FindBy(id="com.sdg.android:id/buttonSignUp")
	private WebElement signUpButton;
	
	@FindBy(id="com.sdg.android:id/editName")
	private WebElement name;
	
	@FindBy(id="com.sdg.android:id/editEmail")
	private WebElement emailID;
	
	@FindBy(id="com.sdg.android:id/editPassword")
	private WebElement password;
	
	@FindBy(id="com.sdg.android:id/editConfirmPassword")
	private WebElement confirmPassword;
	
	@FindBy(id="com.sdg.android:id/checkbox18")
	private WebElement checkBox;
	
	@FindBy(id="com.sdg.android:id/buttonSubmit")
	private WebElement signUpButtonClick;
	
	
	public void clickOnHambergermenu() throws InterruptedException
	{
		Thread.sleep(10000);
		menuSection.click();
		signUpButton.click();
		name.sendKeys("jeethu");
		emailID.sendKeys("jeethutest@gmail.com");
		password.sendKeys("Jeethutest@1");
		Thread.sleep(1000);
		confirmPassword.sendKeys("Jeethutest@1");
		checkBox.click();
		signUpButton.click();
		
	}	
	
}
