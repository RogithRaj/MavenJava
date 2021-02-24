package org.page1;

import java.util.Set;

import org.Baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AppTestExecute extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		lancuhChromeBrowser();
		getUrl("https://www.amazon.in/");
		
		AmazonLoginPage a= new AmazonLoginPage();
	
		click(a.getLogin());
		fillTextBox(a.getUserid(), "9940054417");
		click(a.getConCLick());
		fillTextBox(a.getUserpassword(), "Pnb@2020");
		click(a.getSignI());

		//click(a.getSendOtp());
		
		//Thread.sleep(15000);
		
	   //click(a.getAthSignin());
		
		//click(a.getSignI());
		
		//Thread.sleep(15000);
		
		fillTextBox(a.getSearchBox(), "Iphone");
		click(a.getSearchOkay());
		
		
		click(a.getClickOnProduct());
		
		switchToNewWindow(1);

		
		click(a.getAddToCart());
		
		//switchToNewWindow(1);
		
		Thread.sleep(5000);
		
		click(a.getProceedToCheckout());
	
		click(a.getDeliveryAddress());
		
		click(a.getProceedToPlaceOrder());
		
		
}
}
