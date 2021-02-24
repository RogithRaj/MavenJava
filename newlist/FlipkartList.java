package org.newlist;

import java.util.LinkedList;
import java.util.List;

import org.Baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class FlipkartList extends BaseClass {
	
	
	public static void main(String[] args) {
		
	 lancuhChromeBrowser();
	 getUrl("https://www.flipkart.com/");
	 
	WebElement searchproduct = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]"));
	searchproduct.sendKeys("Iphone");
	
	WebElement search = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]/*[1]"));
	search.click();
	
	
	
	
	
	}

}
