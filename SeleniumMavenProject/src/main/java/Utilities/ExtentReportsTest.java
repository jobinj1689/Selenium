package Utilities;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;

public class ExtentReportsTest {

	static ExtentReports extent;
	
	public static ExtentReports Reports() {
		
		/*
		DateFormat dateFormat = new SimpleDateFormat("ddMMyyy HHmmss");
		Date date = new Date();
		String current_Date = dateFormat.format(date); 
		*/
		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Maven Project Report");
		reporter.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "JOJO");
		
		return extent;
	}
	
	public static void ReportsFlush() {
		
		extent.flush();
	}
	
	
	
}
