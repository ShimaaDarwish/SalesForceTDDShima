package com.SalesForceLoginPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}


	@FindBy(how=How.NAME, using="username")private WebElement uName;
	public WebElement userName (String enterYourName) {
		uName.sendKeys(enterYourName);
		return uName;
	}
	
	@FindBy(how=How.XPATH,using="//input[starts-with(@id,'password')]") private WebElement pass;
	public WebElement getPassWord (String enterYourPassword) {
		pass.sendKeys(enterYourPassword);
		return pass;
	}
	@FindBy(how=How.XPATH,using="//input[starts-with(@id,'Login')]") private WebElement login;
    public WebElement getLogin() {
        login.click();
        return login;
	}
	
}
