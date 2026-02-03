package TestScripts;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryclass implements IRetryAnalyzer {
	
	
		 private int count = 0;
		    private static final int maxTry = 3;

		    public boolean retry(ITestResult iTestResult) {
		        if (count < maxTry) {
		            count++;
		            return true;
		        }
		        return false;
		    }

	

}
