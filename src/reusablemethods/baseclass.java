package reusablemethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class baseclass {

public	WebDriver driver;
	@BeforeClass
	public void openbrowser() {
		
		
		System.setProperty("webdriver.ie.driver","C:\\drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		
		
	}
	@BeforeMethod
	public void url() {
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		
		
	}
	@AfterClass
	public void Closebrowser() {
		
		driver.close();
		
	}
}
