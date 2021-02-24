package org.phptravels;

import org.Baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PhpTravels extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		lancuhChromeBrowser();
		getUrl("https://www.phptravels.net/");
		
		Thread.sleep(5000);
		
		WebElement myAccount = driver.findElement(By.xpath("(//a[@class='btn btn-text-inherit btn-interactive'])[3]"));
		myAccount.click();
		
		WebElement login = driver.findElement(By.xpath("//a[@class='dropdown-item active tr']"));
		login.click();
		
		WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
		email.sendKeys("User@phptravels.com");
		
		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		password.sendKeys("demouser");
		
		WebElement loginClick = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block loginbtn']"));
		loginClick.click();
		
		WebElement clickOnHome = driver.findElement(By.xpath("//a[@title='home']"));
		clickOnHome.click();
		
		WebElement Des = driver.findElement(By.xpath("//div[@id='s2id_autogen16']"));
		Des.sendKeys("Grand plaza serviced APartment, London");
		
		
		
		
	}

}
