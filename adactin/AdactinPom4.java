package org.adactin;

import org.Baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPom4 extends BaseClass{
	
	
	public AdactinPom4() {
	
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='first_name']")
	private WebElement fName;
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lName;
	
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement billingAddress;
	
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement creditCardNo;
	
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement creditCardType;
	
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement expiryDate;
	
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement expiryyear;
	
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement cvvNumber;
	
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement bookNow;
	
	@FindBy(id = "order_no")
	private WebElement OrderNo;



	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getExpiryDate() {
		return expiryDate;
	}

	public WebElement getExpiryyear() {
		return expiryyear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public WebElement getOrderNo() {
		return OrderNo;
	}
	
	
}
