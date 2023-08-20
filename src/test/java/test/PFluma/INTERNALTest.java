package test.PFluma;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.internal;

public class INTERNALTest {
	
	ExtentReports extent;

	
	
	
	@BeforeMethod
	public void Configure(){
		
		String reportpath = System.getProperty("user.dir")+"\\reports\\index.html";
		
		ExtentSparkReporter reporter  = new  ExtentSparkReporter(reportpath);
		reporter.config().setReportName("Luma");
		reporter.config().setDocumentTitle("Luma Test Results");
		 extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Operating System", "Windows 10");
		extent.setSystemInfo("Tested By", "Maruthi");

	}
		
	
	@Test
	public void intrn() throws InterruptedException {
		
		ExtentTest eTest = extent.createTest("Test1 started");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		eTest.info("Browser launched");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		eTest.info("Website launched launched");


		Thread.sleep(2000);
		
		WebElement move = driver.findElement(By.xpath("//span[contains(text(),'Men')]"));

		Actions actions = new Actions(driver);
		actions.moveToElement(move).build().perform();
		eTest.info("move action performed");

		Thread.sleep(2000);
		WebElement move1 = driver.findElement(By.xpath("//a[@id='ui-id-17']"));

		actions.moveToElement(move1).build().perform();

		Thread.sleep(2000);
		WebElement move2 = driver.findElement(By.xpath(
				"//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[2]/a[1]/span[1]"));

		actions.moveToElement(move2).build().perform();

		Thread.sleep(2000);

		internal internal = new internal(driver);
		internal.hoodie().click();

		Thread.sleep(3000);

		WebElement scroll = driver.findElement(
				By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/a[1]/span[1]/span[1]/img[1]"));

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("arguments[0].scrollIntoView(true)", scroll);

		Thread.sleep(3000);
		WebElement move3 = driver.findElement(
				By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/a[1]/span[1]/span[1]/img[1]"));

		actions.moveToElement(move3).build().perform();

		Thread.sleep(1000);
		internal.addcart().click();
		
		
		Thread.sleep(2000);


		WebElement scroll2 = driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')]"));

		JavascriptExecutor jse1 = (JavascriptExecutor) driver;

		jse1.executeScript("arguments[0].scrollIntoView(true)", scroll2);


		Thread.sleep(2000);
		internal.sizes().click();

		Thread.sleep(1000);
		internal.color().click();

		Thread.sleep(5000);
		internal.acart1().click();
		Thread.sleep(4000);
		internal.prcd().click();
		Thread.sleep(2000);
		internal.checkout().click();

		Thread.sleep(9000);
		internal.emailprcd().sendKeys("msaggu@gmail.com");
		Thread.sleep(2000);
		internal.cp().sendKeys("Test@1234");
		internal.cl().click();
		Thread.sleep(2000);
		internal.nextt().click();
		Thread.sleep(4000);
		internal.placeorder().click();
		
		 
	}
	
	@AfterMethod
	public void tearDown() {
		extent.flush();
		;
	

}

}

