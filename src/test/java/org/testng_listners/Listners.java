package org.testng_listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test start:"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test success:"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failure:"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped:"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test finish:"+context.getName());
	}

	
	
}
