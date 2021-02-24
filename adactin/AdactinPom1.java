package org.adactin;

import org.Baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPom1 extends BaseClass{
	
	
	public AdactinPom1() {
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='username']" )
	private WebElement username;
	
	@FindBy(xpath="//input[@id='password']" )
	private WebElement password;
	
	@FindBy(xpath="//input[@name='login']" )
	private WebElement loginBtnCLick;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtnCLick() {
		return loginBtnCLick;
	}
	
	
}
