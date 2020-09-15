package com.automationPractice.qa.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.qa.resources.Base;

public class AccountPage extends Base{
	
	public WebDriver driver;
	public AccountPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
		
	@FindBy(xpath="//input[@id='email_create']")
	WebElement tb_email;
	
	@FindBy(xpath="//form[@id='create-account_form']//span[1]")
	WebElement btn_createAccount;
	
	@FindBy(xpath="//form[@id='create-account_form']//span[1]")
	WebElement lbl_createAC_form;
	
	@FindBy(xpath="//input[@id='id_gender1']")
	WebElement rbtn_gender;
	
	@FindBy(xpath="//input[@id='customer_firstname']")
	WebElement tb_customerFirstName;
	
	@FindBy(xpath="//input[@id='customer_lastname']")
	WebElement tb_customerLastName;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement tb_password;
	
	@FindBy(xpath="//select[@id='days']")
	WebElement dd_dob_day;
	
	@FindBy(xpath="//select[@id='months']")
	WebElement dd_dob_month;
	
	@FindBy(xpath="//select[@id='years']")
	WebElement dd_dob_year;
	
	@FindBy(xpath="//input[@id='newsletter']")
	WebElement cb_newsletter;
	
	@FindBy(xpath="//input[@id='optin']")
	WebElement cb_spclOffer;
	
	@FindBy(xpath="//input[@id='firstname']")
	WebElement tb_firstName;
	
	@FindBy(xpath="//input[@id='lastname']")
	WebElement tb_lastName;
	
	@FindBy(xpath="//input[@id='company']")
	WebElement tb_company;
	//input[@id='company']
	
	@FindBy(xpath="//input[@id='address1']")
	WebElement tb_addressLine1;
	
	@FindBy(xpath="//input[@id='address2']")
	WebElement tb_addressLine2;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement tb_city;
	
	@FindBy(xpath="//select[@id='id_state']")
	WebElement dd_state;
	
	@FindBy(xpath="//input[@id='postcode']")
	WebElement tb_postCode;
	
	@FindBy(xpath="//select[@id='id_country']")
	WebElement dd_country;
	
	@FindBy(xpath="//textarea[@id='other']")
	WebElement ta_additionalInfo;
	
	@FindBy(xpath="//input[@id='phone']")
	WebElement tb_phoneNum;
	
	@FindBy(xpath="//input[@id='phone_mobile']")
	WebElement tb_mobileNum;
	
	@FindBy(xpath="//input[@id='alias']")
	WebElement tb_futRefAddress;
	
	@FindBy(xpath="//span[contains(text(),'Register')]")
	WebElement btn_register;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement tb_signIn_id;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement tb_signIn_pass;
	
	@FindBy(xpath="//p[@class='submit']//span[1]")
	WebElement btn_signIn;
	
	@FindBy(xpath="//li[contains(text(),'email address has already been registered')]")
	WebElement msg_alreadyExsiting_ac;
	
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")
	WebElement btn_proceedToCheckout;
	
	@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")
	WebElement btn_proceedToCheckout_summaryTab;
	
	@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")
	WebElement btn_proceedToCheckout_signinTab;
	
	@FindBy(xpath="//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]")
	WebElement btn_proceedToCheckout_addressTab;
	
	@FindBy(xpath="//input[@id='cgv']")
	WebElement chb_shipping_terms;
	
	@FindBy(xpath="//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")
	WebElement btn_proceedToCheckout_shippingTab;
	
	@FindBy(xpath="//a[@class='bankwire']//span[contains(text(),'(order processing will be longer)')]")
	WebElement payByBankWire;
	
	@FindBy(xpath="//span[contains(text(),'I confirm my order')]")
	WebElement btn_confirmOrder;
	
	@FindBy(xpath="//strong[contains(text(),'Your order on My Store is complete.')]")
	WebElement msg_orderConfirmation;
	
	
	public WebElement tb_email() {
		return tb_email;
	}
		
	public WebElement btn_createAccount() {
		return btn_createAccount;
	}
	public WebElement lbl_createAC_form() {
		return lbl_createAC_form;
	}
	public WebElement rbtn_gender() {
		return rbtn_gender;
	}
		
	public WebElement tb_customerFirstName() {
		return tb_customerFirstName;
	}
	
	public WebElement tb_customerLastName() {
		return tb_customerLastName;
	}
	public WebElement tb_password() {
		return tb_password;
	}
	public WebElement dd_dob_day() {
		return dd_dob_day;
	}
	public WebElement dd_dob_month() {
		return dd_dob_month;
	}
	public WebElement dd_dob_year() {
		return dd_dob_year;
	}
	public WebElement cb_newsletter() {
		return cb_newsletter;
	}
	public WebElement cb_spclOffer() {
		return cb_spclOffer;
	}
	public WebElement tb_firstName() {
		return tb_firstName;
	}
	public WebElement tb_lastName() {
		return tb_lastName;
	}
	public WebElement tb_company() {
		return tb_company;
	}
	public WebElement tb_addressLine1() {
		return tb_addressLine1;
	}
	public WebElement tb_addressLine2() {
		return tb_addressLine2;
	}
	public WebElement tb_city() {
		return tb_city;
	}
	public WebElement tb_postCode() {
		return tb_postCode;
	}
		
	public WebElement dd_state() {
		return dd_state;
	}
	public WebElement dd_country() {
		return dd_country;
	}
	public WebElement ta_additionalInfo() {
		return ta_additionalInfo;
	}
	public WebElement tb_phoneNum() {
		return tb_phoneNum;
	}
	public WebElement tb_mobileNum() {
		return tb_mobileNum;
	}
	public WebElement tb_futRefAddress() {
		return tb_futRefAddress;
	}
	public WebElement btn_register() {
		return btn_register;
	}
	
	public void personal_information() {
		
	}
	public WebElement tb_signIn_id() {
		return tb_signIn_id;
	}
	public WebElement tb_signIn_pass() {
		return tb_signIn_pass;
	}
	public WebElement btn_signIn() {
		return btn_signIn;
	}
	public WebElement msg_alreadyExsiting_ac() {
		return msg_alreadyExsiting_ac;
	}
	public WebElement btn_proceedToCheckout() {
		return btn_proceedToCheckout;
	}
	
	public WebElement btn_proceedToCheckout_summaryTab() {
		return btn_proceedToCheckout_summaryTab;
	}
	public WebElement btn_proceedToCheckout_signinTab() {
		return btn_proceedToCheckout_signinTab;
	}
	public WebElement btn_proceedToCheckout_addressTab() {
		return btn_proceedToCheckout_addressTab;
	}
	public WebElement chb_shipping_terms() {
		return chb_shipping_terms;
	}
	public WebElement btn_proceedToCheckout_shippingTab() {
		return btn_proceedToCheckout_shippingTab;
	}
	public WebElement payByBankWire() {
		return payByBankWire;
	}
	public WebElement btn_confirmOrder() {
		return btn_confirmOrder;
	}
	public WebElement msg_orderConfirmation() {
		return msg_orderConfirmation;
	}
	
}

	