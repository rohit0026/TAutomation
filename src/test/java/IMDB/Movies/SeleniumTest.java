package IMDB.Movies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SeleniumTest {
	
	ExtentReports extent;
	
	@BeforeTest
	public void report() {
		
		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		System.out.println("9March changes US team 1 in secound file from GIT");
		System.out.println("Indian guy Selenium1 test changes from main workbench");
		//String path1 =  System.getProperty("user.dir");
		
		/*Extent reports code starts
		first used version 3.0 from maven repo but it not had ExtentSparkReports class and getting error 
		cannot be resolved to a type did some R&D and realised new usersion is 5.0.6
		added that dependency and updated maven project now its able to find all the relavent classes
		
		*/
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);//responsible for creating report takes input as path
		reporter.config().setDocumentTitle("ROHIT AUTOMATION lABS");
		reporter.config().setReportName("IDFY");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("tester", "rohit");
		
	}
	
	@Test(groups = "SMOKE")
	//addrd group to verify testng.xml
	public void SeleniumTest102()
	{
		extent.createTest("SeleniumTest102");
		System.out.println("selenium test passed fro SMOKE TEST");
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		extent.flush();
		driver.quit();
		System.out.println("New changes from India Team");
	}
	@Test(groups = "SMOKE")
	public void Test2()
	{
		
		System.out.println("test 2 selenium FROM SMOKE");
		
	}
	
}