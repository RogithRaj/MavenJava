package org.airtel;

import org.Baseclass.BaseClass;

public class AirtelLoginRecharge extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		lancuhChromeBrowser();
		getUrl("https://www.airtel.in");
		
		AirtelPom a=new AirtelPom();
		
	
		
		fillTextBox(a.getPhoneno(), "9940054417");
		click(a.getBrowseRechargePack());
		
		Thread.sleep(3000);
		
		click(a.getRechargePriceClick());
		
		fillTextBox(a.getRegisetredPhoneno(), "9940054417");
		click(a.getConClick());
		
		Thread.sleep(10000);
		click(a.getNextConClick());
		
		
	}

}
