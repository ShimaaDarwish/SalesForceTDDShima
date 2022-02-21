package com.SalesForceLogintests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SalesForcBase.BasePage;
import com.SalesForceLoginPages.LoginPage;

public class NegativeLoginTest extends BasePage{

	LoginPage lp;
	WebDriver driver;
	
	@BeforeMethod
	public void openApp (){
		driver = getDriver();
		//getDriver();
		//lp= new LoginPage (getDriver());
		//lp.userName("Shimaa");
		
	}
	
	@Test(priority=0)
	public void userNameButton (){
		//getDriver();
		lp= new LoginPage (getDriver());
		lp.userName("Shimaa");
	}	
	@Test(priority=1)
	public void passwordButton (){
		//getDriver();
		lp= new LoginPage (getDriver());
		lp.getPassWord("1234");
	}	
	
	@Test(priority=2)
	public void signiButton (){
		//getDriver();
		lp= new LoginPage (getDriver());
		lp.getLogin();
	}	
	@AfterTest
	public void teardownTest() {
		closeDriver();	
	}
}
