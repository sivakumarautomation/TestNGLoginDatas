package testnglogin; //package//

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage { //class//
	
	//@BeforeSuite,@BeforeTest,@BeforeClass,@BeforeMethod,@Test,
	//@AfterMethod,@AfterClass,@AfterTest,@AfterTest//
	
	public WebDriver odriver;
	
	//Test Case//
	@Test 
		void openUrl() throws InterruptedException {
		odriver = new ChromeDriver();
		odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		odriver.manage().window().maximize();
		odriver.manage().deleteAllCookies();
		Thread.sleep(4000);
	}
     
	@Test 
	
	void topics() {
		String Url = odriver.getCurrentUrl();
		System.out.println(Url);
		
		String title = odriver.getTitle();
		System.out.println(title);
	}
	
	@Test 
	
	
	void username() {
		    By user = By.name("username");
		    WebElement un = odriver.findElement(user);
		    un.sendKeys("Admin");
	}
	
	@Test
	
	void password() {
		   By pass=By.name("password");
		   WebElement pd = odriver.findElement(pass);
		   pd.sendKeys("admin123");
	}
	
	
}
