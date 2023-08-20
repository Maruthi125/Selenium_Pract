package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class creataccount {
	
	WebDriver driver;
	public creataccount(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath = "//header/div[1]/div[1]/ul[1]/li[3]/a[1]")
	
	private WebElement caccount;
	
	@FindBy(id = "firstname")
	private WebElement fname;
	
	@FindBy(id = "lastname")
	private WebElement lname;
	
	@FindBy(id = "email_address")
	private WebElement email;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "password-confirmation")
	private WebElement confirmpswd;
	
	@FindBy(xpath="//body[1]/div[2]/main[1]/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]/span[1]")
	private WebElement cbutton;

	
	public WebElement caccount() {
		return caccount;
		
	}
	
	public WebElement fname() {
		return fname;
		
	}
	
	public WebElement lname() {
		return lname;
		
	}
	
	public WebElement email() {
		return email;
		
	}
	
	public WebElement password() {
		return password;
		
	}
	
	
	public WebElement confirmpswd() {
		return confirmpswd;
		
	}
	
	public WebElement cbutton() {
		return cbutton;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
