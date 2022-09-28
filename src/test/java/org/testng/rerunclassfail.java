package org.testng;

public class rerunclassfail implements IRetryAnalyzer{

	
	
	int min=1,max=5;
	@Override
	public boolean retry(ITestResult result) {
		if (min<=max) {
			min++;
			return true;
		}
		
		return false;
	}

}
