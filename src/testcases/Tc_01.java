package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import objectrepository.AdactinLoginPage;
import reusablemethods.baseclass;

public class Tc_01 extends baseclass{
	
	String un="rameshadipu";
	String pwd="ramesh";
	
	@Test
	public void test1() {
		
		
		AdactinLoginPage alp=new AdactinLoginPage(driver);
		alp.enterUserName(un);
		alp.enterPassword(pwd);
		alp.clickOnLoginButton();
	
	}

}
