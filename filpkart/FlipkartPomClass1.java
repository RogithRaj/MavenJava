package org.filpkart;

import org.Baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPomClass1 extends BaseClass {
	
	public FlipkartPomClass1() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement username;
	
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement userpassword;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement loginClick;
	
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getUserpassword() {
		return userpassword;
	}
	public WebElement getLoginClick() {
		return loginClick;
	}
}
