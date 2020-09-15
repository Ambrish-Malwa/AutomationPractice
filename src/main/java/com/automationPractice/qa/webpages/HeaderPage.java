package com.automationPractice.qa.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.qa.resources.Base;

public class HeaderPage extends Base{
	
	public WebDriver driver;
	public HeaderPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//a[@title='Contact us']")
	WebElement lnk_contactUs;
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	WebElement btn_signIn;
	
	@FindBy(xpath="//a[@class='logout']")
	WebElement btn_signOut;
	
	
	public WebElement contactUs() {
		return lnk_contactUs;
	}
	
	public WebElement btn_signIn() {
		return btn_signIn;
	}
	public WebElement btn_signOut() {
		return btn_signOut;
	}
}
