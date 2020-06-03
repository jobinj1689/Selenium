package Practice1.SeleniumMavenProject;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	
@Override	
public void onTestSuccess(ITestResult result) {
	
	System.out.println("Test case Passed : "  +result.getName());
	
}
	
	
	
}
