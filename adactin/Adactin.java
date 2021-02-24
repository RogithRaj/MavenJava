package org.adactin;

import org.Baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Adactin extends BaseClass {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		lancuhChromeBrowser();
		getUrl("http://adactinhotelapp.com/");
		
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("RogithRaj");
		
		
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("49MDP8");
		
		WebElement loginBtnCLick = driver.findElement(By.xpath("//input[@name='login']"));
		loginBtnCLick.click();
		
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		location.click();
		
		selectByIndex(location, 2);
	
		
		WebElement hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		hotels.click();
		
		selectByIndex(hotels, 2);
		
		WebElement roomType = driver.findElement(By.xpath("//select[@id='room_type']"));
		roomType.click();
		
		selectByIndex(roomType, 2);
		
		WebElement checkInDate = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		checkInDate.clear();
		checkInDate.sendKeys("01/04/2021");
		
		WebElement checkOutDate = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		checkOutDate.clear();
		checkOutDate.sendKeys("02/04/2021");
		
		WebElement adultsPerRm = driver.findElement(By.xpath("//select[@id='adult_room']"));
		adultsPerRm.click();
		
		selectByIndex(adultsPerRm, 1);
		
		WebElement childPerRm = driver.findElement(By.xpath("//select[@id='child_room']"));
		childPerRm.click();
		
		selectByIndex(childPerRm, 2);
		
		WebElement searchBtnClick = driver.findElement(By.xpath("//input[@id='Submit']"));
		searchBtnClick.click();
		
		WebElement selectHotel = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		selectHotel.click();
		
		WebElement conClick = driver.findElement(By.xpath("//input[@id='continue']"));
		conClick.click();
		
		WebElement fName = driver.findElement(By.xpath("//input[@id='first_name']"));
		fName.sendKeys("Rogith");
		
		WebElement lName = driver.findElement(By.xpath("//input[@id='last_name']"));
		lName.sendKeys("Raj");
		
		WebElement billingAddress = driver.findElement(By.xpath("//textarea[@id='address']"));
		billingAddress.sendKeys("No 1, Chennai");
		
		WebElement creditCardNo = driver.findElement(By.xpath("//input[@id='cc_num']"));
		creditCardNo.sendKeys("	");
		
		WebElement creditCardType = driver.findElement(By.xpath("//select[@id='cc_type']"));
		creditCardType.click();
		
		selectByIndex(creditCardType, 2);
		
		WebElement expiryDate = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		expiryDate.click();
		
		selectByIndex(expiryDate, 2);
		
		WebElement expiryyear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		expiryyear.click();
		
		selectByIndex(expiryyear, 2);
		
		WebElement cvvNumber = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		cvvNumber.sendKeys("321");
		
		WebElement bookNow = driver.findElement(By.xpath("//input[@id='book_now']"));
		bookNow.click();
		
		
	}

}
