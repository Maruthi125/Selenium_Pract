package test.PFluma;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.creataccount;

public class Creation {
	
	@Test	
	public void LOGIN(){
			
			WebDriverManager.chromedriver().setup();
			 WebDriver driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 driver.get("https://magento.softwaretestingboard.com/");
			 
			 
			 creataccount creataccount = new creataccount(driver);
			 creataccount.caccount().click();
			 creataccount.fname().sendKeys("mar");
			 creataccount.lname().sendKeys("saggu");
			 creataccount.email().sendKeys("msaggu@gmail.com");
			 creataccount.password().sendKeys("Test@1234");
			 creataccount.confirmpswd().sendKeys("Test@1234");
			 creataccount.cbutton().click();
	}

}
