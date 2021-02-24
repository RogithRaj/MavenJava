package org.filpkart;

import org.Baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPomClass2 extends BaseClass{
	
	public FlipkartPomClass2() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='_3704LK']")
	private WebElement searchBox;
	
	@FindBy(xpath="//button[@class='L0Z3Pu']")
	private WebElement SearchOkClick;
	
	
	public WebElement getSearchBox() {
		return searchBox;
	}
	public WebElement getSearchOkClick() {
		return SearchOkClick;
	}
	
	
}
