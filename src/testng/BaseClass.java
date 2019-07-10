package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	public ChromeDriver driver;
	
	@Parameters({"username","password"})
	@BeforeMethod
	public void login(String uName,String pass) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys(uName);
		driver.findElementById("password").sendKeys(pass);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();

	}
	
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();

	}
	
	

}
