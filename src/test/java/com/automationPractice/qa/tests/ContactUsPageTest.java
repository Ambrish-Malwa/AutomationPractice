package com.automationPractice.qa.tests;

import java.io.IOException;
import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.automationPractice.qa.resources.Base;
import com.automationPractice.qa.webpages.ContactUsPage;
import com.automationPractice.qa.webpages.HeaderPage;
import com.automationPractice.qa.webpages.HomePage;
import com.automationPractice.util.TestDataUtil;

public class ContactUsPageTest extends Base {
	//private static final String PropertyConfigurator = null;
	WebDriver driver;
	public HomePage hp;
	public SoftAssert sas;
	public ContactUsPage cup;
	public HeaderPage hd;	

	public static Logger log= LogManager.getLogger(ContactUsPageTest.class.getName());


	@BeforeClass
	public void initializeBroswer_hitURL () throws IOException {
		driver= initializeDriver();
		driver.get(prop.getProperty("url"));
		System.out.println("before method");
	}

	@Test(dataProvider="get_contactUsForm_Data")
	public void verify_contactUs_form(String subHeading,String email,String orderRef,String uploadFile, String msg ){

		extent.createTest("get_contactUsForm_Data");	
		hd= new HeaderPage(driver);
		hd.contactUs().click();
		cup= new ContactUsPage(driver);
		Select s= new Select (cup.subjectHeading());


		s.selectByVisibleText(subHeading);
		cup.email().sendKeys(email);
		cup.orderRef().sendKeys(orderRef);
		cup.btn_chooseFile().sendKeys(System.getProperty("user.dir")+uploadFile);
		cup.tf_message().sendKeys(msg);
		cup.btn_send().click();

		Assert.assertTrue(cup.msg_confirmation().isDisplayed());
		extent.flush();	
	}

	@DataProvider
	public Object [][] get_contactUsForm_Data() throws IOException {
		TestDataUtil td=new TestDataUtil(driver);
		Object [][] data= td.getTestdata("ContactUsFormData");
		return data;
	}


	@AfterClass
	public void tearDown() {
		driver.quit();
	}			

}
