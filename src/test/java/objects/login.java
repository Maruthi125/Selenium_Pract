package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {

	WebDriver driver;

	public login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//header/div[1]/div[1]/ul[1]/li[2]/a[1]")

	private WebElement sgnin;

	@FindBy(xpath = "//input[@id='email']")

	private WebElement email;

	@FindBy(id = "pass")

	private WebElement password;

	@FindBy(id = "send2")

	private WebElement signin;

	public WebElement email() {
		return email;

	}
	
	public WebElement sgnin() {
		return sgnin;

	}
	public WebElement password() {
		return password;

	}

	public WebElement signin() {
		return signin;
	}
}
