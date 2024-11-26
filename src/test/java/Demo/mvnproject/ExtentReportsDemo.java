package Demo.mvnproject;

import java.util.logging.LogManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsDemo {

	ExtentReports extent;
	WebDriver driver;

	@BeforeMethod

	public void TearDown() {
		String reportpath = System.getProperty("user.dir") + "\\reports\\Dk.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(reportpath);
		reporter.config().setReportName("Testing");
		reporter.config().setDocumentTitle("Test");

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("OperatingSystem", "Window 11");
		extent.setSystemInfo("Tested BY", "Dinesh");
		

	}

	@Test
	public void testOne() {
       //LogManager.getLogManager().getLogger(testOne();
        //.log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//eTests.pass("Tested");
		//eTests.info("Chrome Launched");
		//eTests.log(Status.PASS, "Test");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//eTests.info("Navigated to Omayo");
		//System.out.println(driver.getTitle());

	}
	@AfterMethod
	public void closer() {
		driver.close();
		//extent.flush();
		
	}

}
