package org.adactin;

import org.Baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPom3 extends BaseClass{
	
	
	public AdactinPom3() {
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement selectHotel;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement conClick;

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getConClick() {
		return conClick;
	}
	
	
	
}
