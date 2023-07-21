package testnglogin; //package//

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login { //class//

	
	public WebDriver odriver;
	
	@Test(priority=1)
	
	void url() throws InterruptedException {
		odriver = new ChromeDriver();
		odriver.get("https://app.hubspot.com/login");
		odriver.manage().window().maximize();
		odriver.manage().deleteAllCookies();
		Thread.sleep(4000);
	}
	
	@Test(priority=2)
	
	 void username() {
		By id = By.id("username");
		
		  WebElement email = odriver.findElement(id);
		  email.sendKeys("sivakumarcreators@gmail.com");
	}
	
	@Test(priority=3)
	
	void close() {
	odriver.quit();
		
	}
}
