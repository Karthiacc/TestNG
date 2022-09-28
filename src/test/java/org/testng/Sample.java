package org.testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample extends Baseclass {
	/**
	 * @Description data provider
	 */
//@Test(dataProvider = "test1")
//private void fb(String user,String pass) {
//	getdriver();
//	loadurl("https://www.facebook.com/");
//	FindElementId("email").sendKeys(user);
//	FindElementId("pass").sendKeys(pass);
//}
//@DataProvider(name = "test1")
//private Object [][] object() {
//Object [][] data=new Object[3][2];
//data[0][0]="karthi";
//data[0][1]="karthi@123";
//
//data[1][0]="sam";
//data[1][1]="sam@1324";
//
//data[2][0]="ram";
//data[2][1]="ram@1232";
//return data;
//}
	/**
	 * @Description parameter from testng xml file
	 */
//	@Parameters({"username","password"})
//	@Test
//	private void fb(String user,String pass) {
//		getdriver();
//		loadurl("https://www.facebook.com/");
//		FindElementId("email").sendKeys(user);
//		FindElementId("pass").sendKeys(pass);
//	}
	/**
	 * @Description groups
	 */
//	@Test(groups = "reg")
//	private void fb() {
//		getdriver();
//		loadurl("https://www.facebook.com/");}
//
//	@Test(groups = "smoke")
//		private void fb1() {
//			getdriver();
//			loadurl("https://www.flipkart.com/");}
//
//	@Test(groups = "sanity")
//			private void fb2() {
//				getdriver();
//				loadurl("https://www.instagram.com/");

	/**
	 * @Description depends on xml file
	 */
//	@Test(groups  = "fb1")
//	private void fb() {
//		getdriver();
//		loadurl("https://www.facebook.com/");}
//
//	@Test(groups = "fb2")
//		private void fb1() {
//			getdriver();
//			loadurl("https://www.flipkart.com/");}

	/**
	 * @Description include concept
	 */

//	@Test(groups = "reg")
//	private void fb() {
//		getdriver();
//		loadurl("https://www.facebook.com/");}
//
//	@Test(groups = "smoke")
//		private void fb1() {
//			getdriver();
//			loadurl("https://www.flipkart.com/");}
//
//	@Test(groups = {"sanity","smoke"})
//			private void fb2() {
//				getdriver();
//				loadurl("https://www.instagram.com/");

	/**
	 * @Description rerun concept
	 */

//	@Test(groups = "reg")
//	private void fb() {
//		getdriver();
//		loadurl("https://www.facebook.com/");}
//
//	@Test(retryAnalyzer = rerunclassfail.class)
//		private void fb1() {
//			getdriver();
//			Assert.assertTrue(false);
//			loadurl("https://www.flipkart.com/");
//	}

	/**
	 * @Description crossbrowser
	 * 
	 * @throws InterruptedException
	 */
	@Parameters("browsers")
	@BeforeTest
	public void test2(String browsers) {
		if (browsers.equalsIgnoreCase("chrome")) {
			Browsers("chrome");
		} else if (browsers.equalsIgnoreCase("firefox")) {
			Browsers("firefox");
			maximize();
		} else if (browsers.equalsIgnoreCase("edge")) {
			Browsers("edge");
			maximize();
		}
	}

	@Test
	public void crossbrowser() throws InterruptedException {

		maximize();
		loadurl("https://www.facebook.com/");
		Thread.sleep(4000);
	}

	@AfterTest
	public void test1() {
		driver.close();
		System.out.println("success");
	}
}