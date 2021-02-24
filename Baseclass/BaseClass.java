package org.Baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.AcceptAlert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver lancuhChromeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91908\\eclipse-workspace\\SeleniumJava\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		return driver;
	}

	public static WebDriver lancuhFirefoxBrowser() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\91908\\eclipse-workspace\\SeleniumJava\\Drivers\\geckodriver.exe");

       driver = new FirefoxDriver();

		return driver;

	}

	public static WebDriver lancuhEdgeBrowser() {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\91908\\eclipse-workspace\\SeleniumJava\\Drivers\\msedgedriver.exe");

        driver = new EdgeDriver();

		return driver;

	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		
	}

	public static void max() {

		driver.manage().window().maximize();
	}

	public static void getUrlwithpagecode(String url) {
		driver.get(url);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}

	public static void navigateToUrl(String url) {
		driver.navigate().to(url);

	}

	public static void selectByIndex(WebElement e, int index) {
		Select s = new Select(e);
		s.selectByIndex(index);
	}

	public static void selectByValue(WebElement e, String value) {
		Select s = new Select(e);
		s.selectByValue(value);
	}

	public static void selectByVisibleText(WebElement e, String text) {

		Select s = new Select(e);
		s.selectByVisibleText(text);
	}

	public static void DeselectAllSelected(WebElement e) {

		Select s = new Select(e);
		s.deselectAll();
	}

	public static void deselectByIndex(WebElement e, int index) {
		Select s = new Select(e);
		s.deselectByIndex(index);
	}

	public static void deselectByValue(WebElement e, String value) {
		Select s = new Select(e);
		s.deselectByValue(value);
	}

	public static void deselectByVisibleText(WebElement e, String text) {

		Select s = new Select(e);
		s.deselectByVisibleText(text);
	}

	public static boolean isMultiple(WebElement e) {
		Select s = new Select(e);
		return s.isMultiple();
	}

	public static WebElement getFirstSelectedOption(WebElement e) {

		Select s = new Select(e);
		return e;

	}

	public static void pagerefresh() {
		driver.navigate().refresh();
	}

	public static void pageBackWard() {
		driver.navigate().back();

	}

	public static void pageForward() {

		driver.navigate().forward();

	}

	public static void fillTextBox(WebElement e, String s) {
		e.sendKeys(s);
		e.click();
	}

	public static String getText(WebElement e) {
		return e.getText();

	}

	public static String getAttribute(WebElement e, String value) {
		return e.getAttribute(value);
	}

	public static void Quit() {
		driver.quit();
	}

	public static void click(WebElement e) {
		e.click();
	}

	public static void getTagName(WebElement e) {
		e.getTagName();
	}

	public static void getSize(WebElement e) {

		e.getSize();
	}

	public static void getLocation(WebElement e) {

		e.getLocation();
	}

	public static boolean isDisplayed(WebElement e) {

		boolean displayed = e.isDisplayed();
		return displayed;

	}

	public static boolean isEnabled(WebElement e) {

		boolean enabled = e.isEnabled();
		return enabled;
	}

	public static boolean isSelected(WebElement e) {
		boolean selected = e.isSelected();
		return selected;

	}

	public static void submit(WebElement e) {

		e.submit();

	}

	public static void clearTextBox(WebElement e) {
		e.clear();

	}

	public static Select getOptions(WebElement e) {

		Select s = new Select(e);
		s.getOptions();
		return s;

	}

	public static Select getFirstSelected(WebElement e) {

		Select s = new Select(e);
		s.getFirstSelectedOption();
		return s;

	}

	public static void scrolldown() {

		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,1000)");

	}

	public static void scrollup() {

		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,-1000)");

	}

	public static void SwitchToFramesByIndex(int index) {

		driver.switchTo().frame(index);
	}

	public static void SwitchToFramesByString(String s) {

		driver.switchTo().frame(s);

	}

	public static void SwitchToFramesByWebElement(WebElement e) {

		driver.switchTo().frame(e);
	}

	public static void dragAndDrop(WebElement scr, WebElement des) {

		Actions a = new Actions(driver);
		a.dragAndDrop(scr, des);
	}

	public static void clickHoldAndRelease(WebElement scr, WebElement des) {

		Actions a = new Actions(driver);
		a.clickAndHold(scr).release(des);
	}

	public static void windowsHandlingByUrl(String e) {

		driver.switchTo().window(e);

	}

	public static WebDriver AcceptAlertt(WebDriver accept) {

		Alert a = driver.switchTo().alert();
		a.accept();
		return accept;

	}
	
	public static WebDriver dismissAlert(WebDriver dismiss) {

		Alert a = driver.switchTo().alert();
		a.dismiss();
		return dismiss;

	}
	
	public static void switchToNewWindow(int index) {

       Set<String> handels = driver.getWindowHandles();
		
       List<String> li= new LinkedList<String>();
       li.addAll(handels);
       driver.switchTo().window(li.get(index));
		}
		
	public static void moveToElement(WebElement e) {
		
		Actions a = new Actions(driver);
		
		a.moveToElement(e).perform();

	}
	

	public static void waitUntillExecute() {
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	
	public static void explicitWaitvisibilityOfElement(WebElement e) {
		
		WebDriverWait w = new WebDriverWait(driver, 50);
		w.until(ExpectedConditions.visibilityOf(e));
		

	}
	
	public static void explicitWaitvisibilityOfElementLocated(String xpathlocator) {
		
		WebDriverWait w = new WebDriverWait(driver, 50);
		WebElement until = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathlocator)));
		until.click();

	}

	
public static void explicitWaitelementToBeClickable(String xpathlocator) {
		
		WebDriverWait w = new WebDriverWait(driver, 50);
		WebElement btn = w.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathlocator)));
		btn.click();

}

  public static String dataDriven(int Rowno, int cellno) throws IOException {
	  
	  File loc = new File("C:\\Users\\91908\\eclipse-workspace\\MavenJava\\src\\test\\resources\\Datas.xlsx");
		
		FileInputStream f= new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(f);
		Sheet sheet = w.getSheet("sheet1");
		Row r = sheet.getRow(Rowno);
		Cell c= r.getCell(cellno);
		int type=c.getCellType();
		String value =null;
			if (type==1) {
				
				value= c.getStringCellValue();
				
			}
				
			else if (DateUtil.isCellInternalDateFormatted(c)) {
				
				Date date= c.getDateCellValue();
				SimpleDateFormat sf= new SimpleDateFormat("dd/MM/yyy");
				value = sf.format(date);
				
			}
			else {
				
				double db = c.getNumericCellValue();
				long lg= (long) db;
				value = String.valueOf(lg);
				
			}
			return value;

	

}
}