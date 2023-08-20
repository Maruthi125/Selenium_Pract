package test.PFluma;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.login;

public class loggingin {
	
		
	
	@Test	
	public void log() throws InterruptedException{
			
			WebDriverManager.chromedriver().setup();
			 WebDriver driver = new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 driver.manage().window().maximize();
			 driver.get("https://magento.softwaretestingboard.com/");
			 
			 Thread.sleep(3000);
			 
			 login login = new login(driver);
			 login.sgnin().click();
			 login.email().sendKeys("msaggu@gmail.com");
			 login.password().sendKeys("Test@1234");
			 login.signin().click();
			

}
}