package org.testng_listners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listners.class)
public class Runner_testng_listner {

	@Test
	public void test1() {
		System.out.println("i am test 1");
	}

	@Test()
	public void test2() {
		System.out.println("i am test 2");
		Assert.assertTrue(false);
	}
	@Test
	public void test3() {
		System.out.println("i am test 3");
		throw new SkipException("this test is skipped");
		}
	@Test
	public void test4() {
		System.out.println("i am test 4");
	}








}
