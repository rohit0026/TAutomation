package IMDB.Movies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
	
	private Object object;
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
		/* 
		System.out.println("selenium test passed fro SMOKE TEST");
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		
		Browser version updated now Implementing webdriver manager
		
		All the files of maven dependencies are locally stored at folder called /m2 in 
		home directory
		C:\Users\Rohit\.m2\repository
		Due to slow internet its not working for thers i  guess 
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		WebDriverManager.chromedriver().browserVersion("87.0.4280.88").setup();
		 for any specific version WebDriverManager.chromedriver().browserVersion("yoyr version").setup();
		 
		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		ChromeOptions co =  new ChromeOptions();
		co.addArguments("--incognito");
		
		driver.navigate().to("https://google.com");
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		//driver.get("https://google.com");
		extent.flush();
		driver.quit();
		System.out.println("New changes from India Team on march 03");
	}
	@Test(groups = "SMOKE")
	public void Test2()
	{
		
		System.out.println("test 2 selenium FROM SMOKE");
		
	}
	
}