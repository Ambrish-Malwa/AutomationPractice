package com.automationPractice.qa.tests;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.automationPractice.qa.resources.Base;
import com.automationPractice.qa.webpages.HomePage;

public class HomePageTest extends Base {
	WebDriver driver;
	public HomePage hp;
	public SoftAssert sas;
	
	
	@BeforeMethod
	public void initializeBroswer_hitURL () throws IOException {
		driver= initializeDriver();
		driver.get(prop.getProperty("url"));
			}
	
	@Test
	public void verify_title_homePage() {
		extent.createTest("verify_title_homePage");
		String currentTitle_OfHomePage= driver.getTitle();
		Assert.assertEquals(prop.getProperty("actualTitle_HomePage"), currentTitle_OfHomePage);
		extent.flush();	
	}
	
	@Test
	public void verify_logo_homePage() {
		extent.createTest("verify_logo_homePage");
		hp= new HomePage(driver);
		boolean logoPresent= hp.logoHomePage().isDisplayed();
		Assert.assertTrue(logoPresent);
		extent.flush();	
		}
	
	@Test
	public void verify_fbIcon_working() {
		extent.createTest("verify_fbIcon_working");
		hp= new HomePage(driver);
		hp.facebookIcon_homePage().click();
		
		Set<String> id= driver.getWindowHandles();
		Iterator <String> iter= id.iterator();
		String parentId= iter.next();
		String childId= iter.next();
		driver.switchTo().window(childId);
		
		String childWindow_Title= driver.getTitle();
		System.out.println(childWindow_Title);
		String url_childWindow= driver.getCurrentUrl();
		sas= new SoftAssert();						//used soft assertion 
		sas.assertTrue(url_childWindow.contains(prop.getProperty("facebook.com")));
		extent.flush();	
		}
	
//	@Test
//	public void verify_bannerAt_homePage_moving() {
//		hp= new HomePage(driver);
//		if (hp.banner().isDisplayed()) {
//			System.out.println("jma ok");
//		}
//		WebElement e1= driver.findElement(By.xpath("//img[@src='http://automationpractice.com/modules/homeslider/images/sample-1.jpg'])"));
//		WebDriverWait w= new WebDriverWait(driver, 5);
//		w.until(ExpectedConditions.visibilityOf(e1));
//				System.out.println(e1.getText());
//	
//	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
