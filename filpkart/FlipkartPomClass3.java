package org.filpkart;

import org.Baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPomClass3 extends BaseClass {
	
	public FlipkartPomClass3() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="(//a[@class='s1Q9rs'])[1]")
	private WebElement bothHeadPhone;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addToCart;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")
	private WebElement placeOrder;
	
	@FindBy(xpath="//button[@class='_2KpZ6l RLM7ES _3AWRsL']")
	private WebElement deliverAddressconfirm;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _1seccl _3AWRsL']")
	private WebElement ConfirmOrderToPayment;
	
	@FindBy(xpath="(//div[@class='_2nxZhC'])[2]")
	private WebElement ChangePaymentmethod;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _1r0i4Z OgciKk _3AWRsL']")
	private WebElement payWithFilpkartPayLater;
	
	public WebElement getBothHeadPhone() {
		return bothHeadPhone;
	}
	public WebElement getAddToCart() {
		return addToCart;
	}
	public WebElement getPlaceOrder() {
		return placeOrder;
	}
	public WebElement getDeliverAddressconfirm() {
		return deliverAddressconfirm;
	}
	public WebElement getConfirmOrderToPayment() {
		return ConfirmOrderToPayment;
	}
	public WebElement getChangePaymentmethod() {
		return ChangePaymentmethod;
	}
	public WebElement getPayWithFilpkartPayLater() {
		return payWithFilpkartPayLater;
	}
	
	

}
