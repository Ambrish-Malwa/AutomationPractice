package com.automationPractice.qa.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressesPage {

	public WebDriver driver;
	public DressesPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//ul[@id='homefeatured']//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-item-of-mobile-line']//a[@class='quick-view']")
	WebElement Blouse;

	@FindBy(xpath="//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-item-of-mobile-line hovered']//span[contains(text(),'Add to cart')]")
	WebElement Blouse_addToCart;

	@FindBy(xpath="//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//img[@class='replace-2x img-responsive']")
	WebElement printed_Dress;

	@FindBy(xpath="//span[contains(text(),'Add to cart')]")
	WebElement printed_Dress_addTo_cart;

	@FindBy(xpath="//img[@src='http://automationpractice.com/img/p/1/0/10-home_default.jpg']")
	WebElement printedDress_onePiece;
	
	@FindBy(xpath="//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 last-item-of-tablet-line']//span[contains(text(),'Add to cart')]")
	WebElement btn_printedDress_onePiece_addToCart;
	
	@FindBy(xpath="//*[contains(text(),'Add to cart')]")
	WebElement btn_addToCart;

	@FindBy(xpath="//div[@class='layer_cart_product col-xs-12 col-md-6']//h2[1]")
	String addToCart_confirmation_msg;

	public WebElement Blouse() {
		return Blouse;
	}
	public WebElement blouse_addToCart() {
		return Blouse_addToCart;
	}

	public WebElement printed_Dress() {
		return printed_Dress;
	}

	public WebElement printed_Dress_addToCart() {
		return Blouse_addToCart;
	}
	
	public WebElement btn_printedDress_onePiece_addToCart() {
		return btn_printedDress_onePiece_addToCart;
	}
	public WebElement printedDress_onePiece() {
		return printedDress_onePiece;
	}
	public WebElement btn_addToCart() {
		return btn_addToCart;
	}
	public String addToCart_confirmation_msg() {
		return addToCart_confirmation_msg;
	}
}

