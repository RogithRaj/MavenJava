package org.filpkart;

import javax.swing.SwingUtilities;

import org.Baseclass.BaseClass;
import org.openqa.selenium.remote.server.handler.GetElementDisplayed;

public class FlipkartLoginRun extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		lancuhChromeBrowser();
		getUrl("https://www.flipkart.com/");

		FlipkartPomClass1 f = new FlipkartPomClass1();
		
		waitUntillExecute();

		fillTextBox(f.getUsername(), "9940054417");
		fillTextBox(f.getUserpassword(), "Pnb@2020");
		click(f.getLoginClick());
		
		FlipkartPomClass2 ff = new FlipkartPomClass2();
		
		fillTextBox(ff.getSearchBox(), "Boat Headphone");

		click(ff.getSearchOkClick());
		
		
		FlipkartPomClass3 f1 = new FlipkartPomClass3();

		click(f1.getBothHeadPhone());

		switchToNewWindow(1);

		click(f1.getAddToCart());
		
		click(f1.getPlaceOrder());
	
		click(f1.getDeliverAddressconfirm());

		click(f1.getConfirmOrderToPayment());
		
		click(f1.getChangePaymentmethod());

		click(f1.getPayWithFilpkartPayLater());

	}


}
