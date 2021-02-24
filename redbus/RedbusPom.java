package org.redbus;

import org.Baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedbusPom extends BaseClass {
	
	
	public RedbusPom() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='src']")
	private WebElement fromLocation;
	
	@FindBy(xpath="//input[@id='dest']")
	private WebElement toLocation;
	
	@FindBy(xpath="//input[@id='onward_cal']" )
	private WebElement date;
	
	@FindBy(tagName="tr")
	private WebElement bookingdate;
	
	public WebElement getFromLocation() {
		return fromLocation;
	}

	public WebElement getToLocation() {
		return toLocation;
	}

	public WebElement getDate() {
		return date;
	}
	
	public WebElement getBookingdate() {
		return bookingdate;
	}

	

}
