package com.automationPractice.qa.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;
	public HomePage (WebDriver driver){
		this.driver=driver;
	}

	By logo= By.xpath("//img[@class='logo img-responsive']");
	By facebookIcon= By.xpath("//a[@href='https://www.facebook.com/groups/525066904174158/']");
	By banner= By.xpath("//div[@class='bx-viewport']");
	By DressPageLink= By.xpath("//body/div/div/header/div/div/div/div/ul/li[2]/a[1]");

	public WebElement logoHomePage() {
		return driver.findElement(logo);
	}
	public WebElement facebookIcon_homePage() {
		return driver.findElement(facebookIcon);
	}
	public WebElement banner() {
		return driver.findElement(banner);
	}
	public WebElement dressesPageLink () {
		return driver.findElement(DressPageLink);
	}



}
