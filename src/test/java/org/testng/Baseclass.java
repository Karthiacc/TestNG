package org.testng;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * 
 * @author karthikeyan
 *@Description used to maintain the reusable methods
 *@Date 19-sep-2022
 */
public class Baseclass {

	public static WebDriver driver;
	String data;
	
	/**
	 * @Description use to load webdriver
	 */
	public  void getdriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	/**
	 * @Description used to load url
	 * @param url
	 */
	public  void loadurl(String url) {
		driver.get(url);
	}
	/**
	 * @Description used to maximize the window
	 */
	public void maximize() {
		driver.manage().window().maximize();
	}
	/**
	 * @Descriptiom used to clear the webelements
	 * @param element
	 */
	public void clear(WebElement element) {
		element.clear();
	}
//	id
	/**
	 * @Description used to find the locator by using id
	 * @param data
	 * @return WebElement
	 */
	public WebElement FindElementId(String data) {
		WebElement element = driver.findElement(By.id(data));
		return element;
	}
//	name
	/**
	 * @Description used to find the locator by using name
	 * @param data
	 * @return WebElement
	 */
	public WebElement FindElementName(String data) {
		WebElement element = driver.findElement(By.name(data));
		return element;
	}
//	xpath
	/**
	 * @Description used to find locator by using xpath
	 * @param data
	 * @return WebElement
	 */
	public WebElement FindElementXpath(String data) {
		WebElement element = driver.findElement(By.xpath(data));
		return element;
	}
	/**
	 * Description used to send the text from the webelement
	 * @param element
	 * @param Text
	 */
	public void sendkeys(WebElement element,String Text) {
		element.sendKeys(Text);;
	}
	/**
	 * @Description used to get the text from the webelement
	 * @param element
	 * @return String
	 */
	public String GettheText(WebElement element) {
		String text = element.getText();
		return text;
	}
	/**
	 * @Description used to get attributes from the webelement
	 * @param element
	 * @return String
	 */
	public String GetAttributes(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
	/**
	 * @Description used to move the element by using action
	 * @param element
	 */
	public void MoveToElement(WebElement element) {
		Actions actions=new Actions(driver);
		actions.moveToElement(element).perform();
	}
	/**
	 * @Description used to click the particular webelement by using click
	 * @param element
	 */
	public void click(WebElement element) {
		element.click();
	}
	/**
	 * @Description used to enter values from the robot
	 * @throws AWTException
	 */
	public void robotkeyenter() throws AWTException {
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	/**
	 * @Description used to click tab from the robot
	 * @throws AWTException
	 */
	public void robotkeyTab() throws AWTException {
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}
	/**
	 * @Description used to select the particular dropdown box 
	 * @param element
	 * @param text
	 */
	public void selectbyvisibletext(WebElement element,String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	/**
	 * @Description used to wait the program by using sleep
	 * @param no
	 * @throws InterruptedException
	 */
	public void sleep(int no) throws InterruptedException {
		Thread.sleep(no);
	}
	/**
	 * @Description used to switch the popups by using alert
	 * @return Alert
	 */
	public Alert switchToAlertAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		return alert;
	}
	/**
	 * 
	 * @param key
	 * @return String
	 * @Description used to run browser Type url and reports
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public String getpropertyfilevalue(String key) throws FileNotFoundException, IOException {
		Properties properties=new Properties();
		properties.load(new FileInputStream(System.getProperty("user.dir")+"\\config\\config.properties"));
//		Object object = properties.get(key);
//		String value=(String)object;
		return (String)properties.get(key);
		
	}
	/**
	 * @Description used to load multiple browsers
	 * @param browsertype
	 */
	public void Browsers(String browsertype) {
		switch (browsertype) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case "ie":
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		default:
			break;
		}
		
	}
	/**
	 * @Description used to take a screenshot
	 * @return byte[]
	 */
	public byte[] getscreenshot() {
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		byte[] b = screenshot.getScreenshotAs(OutputType.BYTES);
		return b;
	}

}
