package org.redbus;

import java.util.List;
import java.util.Scanner;

import org.Baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElements;

public class Redbus extends BaseClass {
	
	public static void main(String[] args) {
		
		lancuhChromeBrowser();
		getUrl("https://www.redbus.in/");
		
		RedbusPom r= new RedbusPom();
		
		fillTextBox(r.getFromLocation(), "Chennai");
		fillTextBox(r.getToLocation(), "Banga");
		
		WebElement date = driver.findElement(By.xpath("//input[@id='onward_cal']"));
		date.click();
		
		waitUntillExecute();
		
		List<WebElement> tables = driver.findElements(By.tagName("table"));
		WebElement table = tables.get(0);
		System.out.println(table.getText());
		
		List<WebElement> trows = driver.findElements(By.tagName("tr"));
		trows.get(2).click();
		 
		//List<WebElement> trows1 = driver.findElements(By.tagName("tr"));
		List<WebElement> tdata = driver.findElements(By.tagName("td"));
		tdata.get(2).click();

		 

	}
}
