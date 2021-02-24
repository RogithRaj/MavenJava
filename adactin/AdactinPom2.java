package org.adactin;

import org.Baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPom2 extends BaseClass{
	
	
	public AdactinPom2() {
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@id='location']")
	private WebElement location;
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement roomType;
	
	@FindBy(xpath="//input[@id='datepick_in']")
	private WebElement checkInDate;
	
	@FindBy(xpath="//input[@id='datepick_out']")
	private WebElement checkOutDate;
	
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement adultsPerRm;
	
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement childPerRm;
	
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement searchBtnClick;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultsPerRm() {
		return adultsPerRm;
	}

	public WebElement getChildPerRm() {
		return childPerRm;
	}

	public WebElement getSearchBtnClick() {
		return searchBtnClick;
	}
	
	
	
}
