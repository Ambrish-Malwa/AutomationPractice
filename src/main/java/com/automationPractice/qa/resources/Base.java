package com.automationPractice.qa.resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Base {
	
	public static WebDriver driver;
	public Properties prop;				
	public ExtentReports extent;
	public WebDriver initializeDriver() throws IOException {
	
		prop= new Properties(); 
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\automationPractice\\qa\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\java\\utilities\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();			
		
			driver= new ChromeDriver();
		}
		else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		else if (browserName.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver= new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
		} 

	@BeforeSuite
	public void config_extentReport() {
		
		String reportPath =System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
		reporter.config().setReportName("Automation Results");
		reporter.config().setDocumentTitle("Test Results");

		extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Ambrish Malwa");
	}
	 
}