package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;

public class internal {

	WebDriver driver;

	public internal(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[contains(text(),'M")

	private WebElement men;

	@FindBy(xpath = "//a[contains(text(),'Tops')]")

	private WebElement tops;

	@FindBy(id = "option-label-size-143-item-168")

	private WebElement size;

	@FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]")

	private WebElement Addcart;

	@FindBy(xpath = "//span[contains(text(),'Add to Cart')]")

	private WebElement Addcart2;

	@FindBy(xpath = "//span[contains(text(),'Men')]")

	private WebElement move1;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]")

	private WebElement hoodie;

	public WebElement hoodie() {
		return hoodie;
	}

	@FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]")

	private WebElement addcart;

	public WebElement addcart() {
		return addcart;

	}

	@FindBy(xpath = "//div[@id='option-label-size-143-item-167']")

	private WebElement sizes;

	public WebElement sizes() {
		return sizes;
	}

	@FindBy(xpath = "//button[@id='product-addtocart-button']")

	private WebElement acart1;

	public WebElement acart1() {
		return acart1;
	}

	@FindBy(xpath = "//div[@id='option-label-color-93-item-53']")

	private WebElement color;

	public WebElement color() {
		return color;

	}

	@FindBy(xpath = "//header/div[2]/div[1]/a[1]/span[2]/span[1]")

	private WebElement prcd;

	public WebElement prcd() {
		return prcd;
	}

	@FindBy(id = "top-cart-btn-checkout")

	private WebElement checkout;

	public WebElement checkout() {
		return checkout;

	}

	@FindBy(xpath = "//body/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[1]/fieldset[1]/div[1]/div[1]/input[1]")

	private WebElement emailprcd;

	public WebElement emailprcd() {
		return emailprcd;

	}

	@FindBy(id = "customer-password")

	private WebElement cp;

	public WebElement cp() {
		return cp;

	}

	@FindBy(xpath = "//span[contains(text(),'Login')]")

	private WebElement cl;

	public WebElement cl() {
		return cl;

	}

	@FindBy(xpath = "//li[contains(@data-bind,'fadeVisible: visible()')]//div[contains(@data-role,'content')]//div//div//div[1]//div[1]//input[1]")

	private WebElement street;

	public WebElement street() {
		return street;
	}

	@FindBy(xpath = "//body//div//div[contains(@data-bind,\"scope:'checkout'\")]//div//div[4]//div[1]//input[1]")

	private WebElement city;

	public WebElement city() {
			return city;
	}

	@FindBy(xpath = "//div[5]//div[1]//select[1]")

	private WebElement citydrop;

	public WebElement citydrop() {
		return citydrop;
		
		
	}

	@FindBy(xpath = "//div[7]//div[1]//input[1]")

	private WebElement postal;

	public WebElement postal() {
		return postal;
		
		
	}

	@FindBy(xpath = "//div[9]//div[1]//input[1]")

	private WebElement phoned;

	public WebElement phoned() {
		return phoned;
		
	}

	@FindBy(xpath = "//input[@value='tablerate_bestway']")

	private WebElement radio;

	public WebElement radio() {
		return radio;	
		
	}

	@FindBy(xpath = "//span[contains(text(),'Next')]")

	private WebElement nextt;

	public WebElement nextt() {
		return nextt;	
		
		
	}

	@FindBy(xpath = "//span[contains(text(),'Place Order')]")

	private WebElement placeorder;

	public WebElement placeorder() {
		return nextt;
		
		
		
		
		
		
		

	}
}
