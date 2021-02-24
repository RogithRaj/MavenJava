package org.Junitp;

import java.io.IOException;
import java.util.Date;

import org.Baseclass.BaseClass;
import org.adactin.AdactinPom1;
import org.adactin.AdactinPom2;
import org.adactin.AdactinPom3;
import org.adactin.AdactinPom4;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JunitClass extends BaseClass {
	
	@BeforeClass
	public static void broweserLancuh() {
		
		lancuhChromeBrowser();
		

	}
	
	@AfterClass
	public static void afterclass() {
		
		System.out.println("Process Completed");
		 
		
	}

	@Before
	public void Before() {
		
		System.out.println("start Time" + new Date());
		 

	}
	
	@After
	public void after() {
		
		System.out.println("End Time" + new Date());
		 

	}
	
	@Test
	public void test() throws IOException {
		
		getUrl("http://adactinhotelapp.com/");
		
		AdactinPom1 p= new AdactinPom1();
		 
		fillTextBox(p.getUsername(), dataDriven(1, 0));
		
		fillTextBox(p.getPassword(), dataDriven(1, 1));
		
		click(p.getLoginBtnCLick());
		
		AdactinPom2 p1= new AdactinPom2();
		
		click(p1.getHotels());
		
		selectByIndex(p1.getHotels(), 2);
		
		click(p1.getLocation());
		
		selectByIndex(p1.getLocation(), 2);
		
		click(p1.getRoomType());
		
		selectByIndex(p1.getRoomType(), 2);
		
		fillTextBox(p1.getCheckInDate(), dataDriven(1, 2));
		
		fillTextBox(p1.getCheckOutDate(), dataDriven(1, 3));
		
		click(p1.getAdultsPerRm());
		
		selectByIndex(p1.getAdultsPerRm(), 2);
		
		click(p1.getChildPerRm());

		selectByIndex(p1.getChildPerRm(), 2);
		
		click(p1.getSearchBtnClick());
		
		AdactinPom3 p2= new AdactinPom3();	
		
		click(p2.getSelectHotel());
		
		click(p2.getConClick());
		
		
		AdactinPom4 p3= new AdactinPom4();
		
		fillTextBox(p3.getfName(), dataDriven(1, 4));
		
		fillTextBox(p3.getlName(), dataDriven(1, 5));
		
		fillTextBox(p3.getBillingAddress(), dataDriven(1, 6));
		
		fillTextBox(p3.getCreditCardNo(), dataDriven(1, 7));
		
		click(p3.getCreditCardType());
		
		selectByIndex(p3.getCreditCardType(), 2);
		
		click(p3.getExpiryDate());
		
		selectByIndex(p3.getExpiryDate(), 2);
		
		click(p3.getExpiryyear());
		
		selectByIndex(p3.getExpiryyear(), 2);
		
		fillTextBox(p3.getCvvNumber(), dataDriven(1, 8));
		
		click(p3.getBookNow());
	
		
		 

	}
}
