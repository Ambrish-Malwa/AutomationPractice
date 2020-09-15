package com.automationPractice.qa.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	public WebDriver driver;
	public ContactUsPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//select[@id='id_contact']")
	WebElement dd_subjectHeading;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement tb_email;
	
	@FindBy(xpath="//input[@id='id_order']")
	WebElement tb_orderRef;
	
	@FindBy(xpath="//span[@class='filename']")
	WebElement fld_uploadFile;
	
	@FindBy(xpath="//input[@id='fileUpload']")
	WebElement btn_chooseFile;
	
	@FindBy(xpath="//span[contains(text(),'Send')]")
	WebElement btn_send;
	
	@FindBy(xpath="//textarea[@id='message']")
	WebElement tf_msg;
	
	@FindBy(xpath="//*[contains(text(),'Your message has been successfully sent to our team.')]")
	WebElement msg_confirmation;

	
	public WebElement subjectHeading() {
		return dd_subjectHeading;
	}
	
	public WebElement email() {
		return tb_email;
	}
	public WebElement orderRef() {
		return tb_orderRef;
	}
	public WebElement fld_uploadFile() {
		return fld_uploadFile;
	}
	public WebElement btn_chooseFile() {
		return btn_chooseFile;
	}
	public WebElement btn_send() {
		return btn_send;
	}
	public WebElement tf_message() {
		return tf_msg;
	}
	public WebElement msg_confirmation() {
		return msg_confirmation;
	}
	
		
}
