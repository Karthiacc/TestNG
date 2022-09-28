package org.testng_listners;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(Listners.class)
public class Runner_testng_listner3 {
WebDriver driver;
	@Test
	public void test5() throws AWTException {
		System.out.println("i am test 5");
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("youtube.com");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	@Test()
	public void test6() {
		System.out.println("i am test 6");
		Assert.assertTrue(false);
	}
	@Test
	public void test7() {
		System.out.println("i am test 7");
		throw new SkipException("this test is skipped");
		}
	@Test
	public void test8() {
		System.out.println("i am test 8");
	}








}
