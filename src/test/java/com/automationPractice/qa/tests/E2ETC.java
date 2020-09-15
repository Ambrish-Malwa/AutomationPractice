package com.automationPractice.qa.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automationPractice.qa.resources.Base;
import com.automationPractice.qa.webpages.AccountPage;
import com.automationPractice.qa.webpages.DressesPage;
import com.automationPractice.qa.webpages.HeaderPage;
import com.automationPractice.qa.webpages.HomePage;
import com.automationPractice.util.TestDataUtil;

public class E2ETC extends Base{
	public WebDriver driver;
	HeaderPage hdp;
	AccountPage acp;
	HomePage hp;
	
	@BeforeClass
	public void initializeBrowser_hitUrl() throws IOException {
		driver= initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test(dataProvider="get_SignUpForm_Data")
	public void E2E(String email, String fName, String lName,String password,String day,String month,String year,String fName1, String lName1,String company,String addressLine1,String addressLine2,String city,String state,String postalCode,String country,String addtionalInfo,String mobile,String futureRef) {
		extent.createTest("E2E");
		hdp= new HeaderPage(driver);
		hdp.btn_signIn().click();
		acp= new AccountPage(driver);
		acp.tb_email().sendKeys(email);
		acp.btn_createAccount().click();
		Assert.assertEquals(prop.getProperty("lbl_createAc_form"), acp.lbl_createAC_form().getText());
		
		//if(!acp.msg_alreadyExsiting_ac().isDisplayed()){
		acp.rbtn_gender().click();
		acp.tb_customerFirstName().sendKeys(fName);
		acp.tb_customerLastName().sendKeys(lName);
		acp.tb_password().sendKeys(password);
		acp.dd_dob_day().sendKeys(day);
		//Select s1= new Select(acp.dd_dob_month());
		//s1.selectByVisibleText("November");
		acp.dd_dob_month().sendKeys(month);
		acp.dd_dob_year().sendKeys(year);
		acp.cb_newsletter().click();
		acp.cb_spclOffer().click();
		acp.tb_firstName().sendKeys(fName1);
		acp.tb_lastName().sendKeys(lName1);
		acp.tb_company().sendKeys(company);
		acp.tb_addressLine1().sendKeys(addressLine1);
		acp.tb_addressLine2().sendKeys(addressLine1);
		acp.tb_city().sendKeys(city);
		acp.dd_state().sendKeys(state);
		
		//int postal_Code=Integer.parseInt(postalCode);
		acp.tb_postCode().sendKeys(postalCode);
		
		
		acp.dd_country().sendKeys(country); 
		acp.ta_additionalInfo().sendKeys(addtionalInfo);
		acp.tb_mobileNum().sendKeys(mobile);
		acp.tb_futRefAddress().clear();
		acp.tb_futRefAddress().sendKeys(futureRef);
		acp.btn_register().click();
		hdp.btn_signOut().click();
		hdp.btn_signIn().click();
//		}
//		else {
			
		acp.tb_signIn_id().sendKeys(email);
		acp.tb_signIn_pass().sendKeys(password);
		acp.btn_signIn().click();;
		//}
		
		hp= new HomePage(driver);
		hp.dressesPageLink().click();
		DressesPage dp= new DressesPage(driver);
		Actions ac= new Actions (driver);
		ac.moveToElement(dp.printedDress_onePiece()).moveToElement(dp.btn_printedDress_onePiece_addToCart()).click().build().perform(); 
		Assert.assertTrue(true, dp.addToCart_confirmation_msg());

		acp.btn_proceedToCheckout().click();
		acp.btn_proceedToCheckout_summaryTab().click();
		
		acp.tb_signIn_id().sendKeys(email);
		acp.tb_signIn_pass().sendKeys(password);
		acp.btn_signIn().click();;
		
		acp.btn_proceedToCheckout_signinTab().click();
		acp.btn_proceedToCheckout_addressTab().click();
		acp.chb_shipping_terms().click();
		acp.btn_proceedToCheckout_shippingTab();
		acp.payByBankWire().click();
		acp.btn_confirmOrder().click();
		acp.msg_orderConfirmation();

		extent.flush();
	
		}

	@DataProvider
	public Object [][] get_SignUpForm_Data() throws IOException {
		TestDataUtil td=new TestDataUtil(driver);
		Object [][] data= td.getTestdata("SignUpData");
		return data;
	}
	

	@AfterClass
	public void tearDown() {
		driver.quit();
	}	

}
