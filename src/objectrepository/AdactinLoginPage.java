package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLoginPage {
	WebDriver ldriver;
	
	public AdactinLoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		
	}
	
	@FindBy(id="username")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="login")
	WebElement Login;
	
	
	public String enterUserName(String un) {
		
		UserName.sendKeys(un);
		return un;
		
	}
	
  public String enterPassword(String pwd) {
		
		Password.sendKeys(pwd);
		return pwd;
		
	}
  public void clickOnLoginButton() {
	  
	  Login.click();
  }


}
