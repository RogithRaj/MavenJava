package org.Baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Java extends BaseClass {
	
	
		public static void main(String[] args) throws InterruptedException, AWTException {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\91908\\eclipse-workspace\\SeleniumJava\\Drivers\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Register.html");
			driver.manage().window().maximize();

			WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
			firstname.sendKeys("ROGITH");

			WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
			lastname.sendKeys("RAJ");

			WebElement Address = driver
					.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
			Address.sendKeys("No 11 3rd cross street kumaran Nagar, Guduvancheri - 603 202");

			WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
			Email.sendKeys("rogithraj107@gmail.com");

			WebElement phoneNo = driver.findElement(By.xpath("//input[@type='tel']"));
			phoneNo.sendKeys("9940054417");

			WebElement Gender = driver.findElement(By.xpath(("//input[@value='Male']")));
			Gender.click();

			WebElement Hobbies = driver.findElement(By.xpath("//input[@value='Cricket']"));
			Hobbies.click();

			WebElement Lang = driver.findElement(By.xpath("//div[@id='msdd']"));
			Lang.click();

			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);

			WebElement English = driver.findElement(By.xpath("//a[@style='text-decoration:none']"));
			English.click();

			WebElement Skills = driver.findElement(By.xpath("//select[@id='Skills']"));
			Select s = new Select(Skills);
			s.selectByIndex(6);

			WebElement country = driver.findElement(By.xpath("//select[@ id='countries']"));
			Select s1 = new Select(country);
			s1.selectByIndex(3);

			WebElement countryclick = driver.findElement(By.xpath("//span[@ role='combobox']"));
			countryclick.click();
			// countryclick.sendKeys("India");

			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);

			WebElement year = driver.findElement(By.xpath("//select[@placeholder='Year']"));
			Select ss = new Select(year);

			//boolean e = ss.isMultiple();
			//System.out.println(e);
			
			System.out.println("check with the baseclass");
			isMultiple(year);
			

			ss.selectByIndex(5);
			Thread.sleep(2000);
			ss.selectByIndex(8);
			Thread.sleep(2000);

			Thread.sleep(2000);
			ss.selectByVisibleText("1920");

			WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
			Select s2 = new Select(month);

			boolean btt = s2.isMultiple();
			System.out.println(btt);

			s2.selectByIndex(5);
			Thread.sleep(2000);
			s2.selectByIndex(8);
			Thread.sleep(2000);

			Thread.sleep(2000);
			s2.selectByVisibleText("June");

			WebElement Day = driver.findElement(By.xpath("//select[@placeholder='Day']"));
			Select d = new Select(Day);

			boolean day = d.isMultiple();
			System.out.println(btt);

			d.selectByIndex(5);
			Thread.sleep(2000);
			d.selectByIndex(8);
			Thread.sleep(2000);

			Thread.sleep(2000);
			d.selectByVisibleText("6");

			WebElement pass = driver.findElement(By.xpath("//input[@id='firstpassword']"));
			pass.sendKeys("Rogith@123");

			WebElement conpass = driver.findElement(By.xpath("//input[@id='secondpassword']"));
			conpass.sendKeys("Rogith@123");

			WebElement Refersh = driver.findElement(By.xpath("//button[@id='submitbtn']"));
			Refersh.click();

		

	}

}
