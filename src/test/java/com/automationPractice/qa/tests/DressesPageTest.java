package com.automationPractice.qa.tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.automationPractice.qa.resources.Base;
import com.automationPractice.qa.webpages.DressesPage;
import com.automationPractice.qa.webpages.HomePage;

public class DressesPageTest extends Base {
	WebDriver driver; 
	public HomePage hp;
	
	
	@BeforeClass
	public void initializeBroswer_hitURL () throws IOException {
		driver= initializeDriver();
		driver.get(prop.getProperty("url"));
		}
	
	@Test
	public void verify_DressesPage_title() {
		
		extent.createTest("verify_DressesPage_title");		// it will start monitoring test case as named
		hp= new HomePage(driver);
		hp.dressesPageLink().click();
		String expectedTitle_DressesPage= driver.getTitle();
		String actualTitle_DressesPage= prop.getProperty("title_dressPage");
		Assert.assertEquals(actualTitle_DressesPage, expectedTitle_DressesPage);
		extent.flush();				// it will stop monitoring TC
	}
	
	@Test
	public void verify_dress_addedTo_cart() throws InterruptedException {
		extent.createTest("verify_dress_addedTo_cart");
		hp= new HomePage(driver);
		hp.dressesPageLink().click();
		DressesPage dp= new DressesPage(driver);
		Actions ac= new Actions (driver);
		ac.moveToElement(dp.printedDress_onePiece()).moveToElement(dp.btn_printedDress_onePiece_addToCart()).click().build().perform(); 
		Assert.assertTrue(true, dp.addToCart_confirmation_msg());
		extent.flush();	
		}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
