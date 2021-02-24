package org.page1;

import org.Baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage extends BaseClass {
	
	public AmazonLoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="nav-link-accountList-nav-line-1")
	private WebElement login;
	
	@FindBy(name="email")
	private WebElement userid;
	
	@FindBy(id="continue")
	private WebElement conCLick;
	
	@FindBy(name="password")
	private WebElement userpassword;
	
	@FindBy(id="signInSubmit")
	private WebElement signI;
	
	@FindBy(id="auth-signin-button")
	private WebElement athSignin;
	
	@FindBy(xpath= "//input[@id='twotabsearchtextbox']")
	private WebElement searchBox;
	
	@FindBy(xpath ="//input[@id='nav-search-submit-button']")
	private WebElement searchOkay;
	
	@FindBy(xpath= "(//span[contains(text(),'New Apple iPhone 11 (64GB) - Black')])[1]")
	private WebElement clickOnProduct;
	
	@FindBy(id="add-to-cart-button")
	private WebElement addToCart;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	private WebElement proceedToCheckout;
	
	@FindBy(id="auth-send-code")
	private WebElement sendOtp;
	
	@FindBy(xpath= "(//a[@class='a-declarative a-button-text '])[1]")
	private WebElement deliveryAddress;
	
	@FindBy(xpath="//input[@name='continue-top']")
	private WebElement proceedToPlaceOrder;
	
	public WebElement getProceedToPlaceOrder() {
		return proceedToPlaceOrder;
	}

	public void setProceedToPlaceOrder(WebElement proceedToPlaceOrder) {
		this.proceedToPlaceOrder = proceedToPlaceOrder;
	}

	public WebElement getSendOtp() {
		return sendOtp;
	}

	public WebElement getDeliveryAddress() {
		return deliveryAddress;
	}

	public WebElement getProceedToCheckout() {
		return proceedToCheckout;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}	

	public WebElement getClickOnProduct() {
		return clickOnProduct;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchOkay() {
		return searchOkay;
	}

	public WebElement getUserid() {
		return userid;
	}

	public WebElement getAthSignin() {
		return athSignin;
	}

	public WebElement getConCLick() {
		return conCLick;
	}

	public WebElement getUserpassword() {
		return userpassword;
	}

	public WebElement getSignI() {
		return signI;
	}
	

}
