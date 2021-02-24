package org.airtel;

import org.Baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AirtelRecharge extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		lancuhChromeBrowser();
		getUrl("https://www.airtel.in");
		
		//Thread.sleep(3000);
		
		WebElement phoneno = driver.findElement(By.xpath("//input[@id='quickRechargeInput']"));
		phoneno.sendKeys("9940054417");
		
		WebElement BrowseRechargePack = driver.findElement(By.xpath("//button[@class='btn-texttype']" ));
		BrowseRechargePack.click();
		
		//WebElement scrollup = driver.findElement(By.xpath("//button[@class='scrolltotop s_show']"));
		//scrollup.click();
		
//		WebElement BrowseRechargePack1 = driver.findElement(By.xpath("//button[@class='btn-texttype']"));
//		BrowseRechargePack1.click();
		
		Thread.sleep(3000);
		
		WebElement RechargePriceClick = driver.findElement(By.xpath("(//button[@class='btn-circle icn-rupee'])[6]"));
		RechargePriceClick.click();
		
		Thread.sleep(5000);
		
		WebElement RegisetredPhoneno = driver.findElement(By.xpath("//input[@name='mobileNumber']"));
		RegisetredPhoneno.sendKeys("9940054417");
		
		WebElement ConClick = driver.findElement(By.xpath("(//button[@class='btn btn-sm pull-right'])[1]"));
		ConClick.click();
		
		Thread.sleep(10000);

		WebElement nextConClick = driver.findElement(By.xpath("(//button[@class='btn btn-sm pull-right'])[1]"));
		nextConClick.click();
		
		WebElement cancelPayment = driver.findElement(By.xpath("//button[@class='btn btn-text btn-sm hidden-xs']"));
		cancelPayment.click();
		
		WebElement confirmCancel = driver.findElement(By.xpath("//button[@class='btn pull-right-sm']"));
		confirmCancel.click();
		
	}
	
	

}
