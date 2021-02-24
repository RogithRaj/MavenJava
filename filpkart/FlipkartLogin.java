package org.filpkart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.Baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartLogin extends BaseClass{
	

private static Comparator<? super WebElement> WebElement;

public static void main(String[] args) throws InterruptedException, IOException {
		

		lancuhChromeBrowser();
		getUrl("https://www.flipkart.com/");
		
		
		WebElement username = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		username.sendKeys("9940054417");
		
		WebElement userpassword = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		userpassword.sendKeys("Pnb@2020");
		
		WebElement loginClick = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		loginClick.click();
		
		Thread.sleep(3000);
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		searchBox.sendKeys("Boat Headphone");
		
		WebElement SearchOkClick = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		SearchOkClick.click();
		
		Thread.sleep(3000);
		
		List<WebElement> boatList = driver.findElements(By.xpath("//a[contains(text(),'boAt')]"));
		System.out.println(boatList.size());
		
		List<WebElement> boatListPrice = driver.findElements(By.xpath("//div[@class='_30jeq3']"));
		System.out.println(boatListPrice.size());
		
		
//		for (WebElement x : boatList) {
//		
//			for (WebElement y : boatListPrice) {
//				
//			String text = x.getText();		
//			String text1 = y.getText();
// 		}
//			
			for (int i = 0; i < boatList.size() ; i++) {
				
				String boatl = boatList.get(i).getText();
				String boatprice = boatListPrice.get(i).getText();
				String bp= boatprice.replace(",", "");
				System.out.println(boatl);
				System.out.println(bp);
				
			}
		
		}
//		WebElement boatHeadPhone = driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[1]"));
//		boatHeadPhone.click();
//		
//		switchToNewWindow(1);
//		
//		WebElement addToCart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
//		addToCart.click();
//		
//		Thread.sleep(3000);
//		
//		WebElement placeOrder = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']"));
//		placeOrder.click();
//		
//		Thread.sleep(3000);
//		
//		WebElement deliverAddressconfirm = driver.findElement(By.xpath("//button[@class='_2KpZ6l RLM7ES _3AWRsL']"));
//		deliverAddressconfirm.click();
//		
//		Thread.sleep(3000);
//		
//		WebElement ConfirmOrderToPayment = driver.findElement(By.xpath("//button[@class='_2KpZ6l _1seccl _3AWRsL']"));
//		ConfirmOrderToPayment.click();
//		
//		Thread.sleep(3000);
//		
//		WebElement ChangePaymentmethod = driver.findElement(By.xpath("(//div[@class='_2nxZhC'])[2]"));
//		ChangePaymentmethod.click();
//		
//		WebElement payWithFilpkartPayLater = driver.findElement(By.xpath("//button[@class='_2KpZ6l _1r0i4Z OgciKk _3AWRsL']"));
//		payWithFilpkartPayLater.click();
//		
////		WebElement changeDeliveryAddress = driver.findElement(By.xpath("(//button[@class='_32l7f0'])[2]"));
////		changeDeliveryAddress.click();
////		
////		WebElement listAllAddress = driver.findElement(By.xpath("//div[@class='E3folB']"));
////		listAllAddress.click();
////		
////		WebElement changeDeliveryAddress1 = driver.findElement(By.xpath("(//span[@class='_2dQV-8'])[13]"));
////		changeDeliveryAddress1.click();
////	
////		WebElement changedDelieveryAddress = driver.findElement(By.xpath("//button[@class='_2KpZ6l RLM7ES _3AWRsL']"));
////		changedDelieveryAddress.click();
////		
////		WebElement continueWithChangedDeliveryAddress = driver.findElement(By.xpath("//button[@class='_2KpZ6l _1seccl _3AWRsL']"));
////		continueWithChangedDeliveryAddress.click();
//		

}
