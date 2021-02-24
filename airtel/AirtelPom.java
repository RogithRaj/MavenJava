package org.airtel;

import java.util.List;

import org.Baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AirtelPom extends BaseClass {
	
	public AirtelPom() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='quickRechargeInput']")
	private WebElement phoneno;
	
	@FindBy(xpath="//button[@class='btn-texttype']")
	private WebElement BrowseRechargePack;
	
	@FindBy(xpath="(//button[@class='btn-circle icn-rupee'])[6]")
	private WebElement RechargePriceClick;
	
	@FindBy(xpath="//input[@id='wallet_mobile_no']")
	private WebElement RegisetredPhoneno;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement ConClick;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement nextConClick;
	
	
	public WebElement getPhoneno() {
		return phoneno;
	}
	public WebElement getBrowseRechargePack() {
		return BrowseRechargePack;
	}
	public WebElement getRechargePriceClick() {
		return RechargePriceClick;
	}
	public WebElement getRegisetredPhoneno() {
		return RegisetredPhoneno;
	}
	public WebElement getConClick() {
		return ConClick;
	}
	public WebElement getNextConClick() {
		return nextConClick;

	
	}

}
