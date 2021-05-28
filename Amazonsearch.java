package Test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazonsearch {
	Actions action;
	
	//creating constructor
	public Amazonsearch(WebDriver driver) {
		action = new Actions(driver);
		
	}
	//create methods
	public void pressenter(WebDriver driver) {
		action.sendKeys(Keys.ENTER).build().perform();
		
	}
	public void scrolldown(WebDriver driver) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,300)", "");
	}
	public void performmousehover(WebElement element) {
		action.moveToElement(element).build().perform();
		
	}
	public void productclickusingjs(WebElement element, WebDriver driver) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click;", element);
	}
	public void addclickusingjs(WebElement element, WebDriver driver) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click;", element);
	} 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\\\webdriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		//validate login
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("lavanya.a447@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("lavanya@123");
		driver.findElement(By.xpath("//*[@id=\"auth-signin-button\"]")).click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
				
		//creating object
	
		Amazonsearch objsearch = new Amazonsearch(driver);
	    WebElement inputsearch = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		inputsearch.sendKeys("Samsung mobile");
		objsearch.pressenter(driver);
		//objsearch.scrolldown(driver);
		//Need to add the dynamic xpath
		String row ="4";
		WebElement product =driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[3]/div[2]/div["+row+"]/div[1]/span[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/a[1]"));
        product.click();
        //objsearch.productclickusingjs(product, driver);
		WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		addtocart.click();
		
		WebElement proceedtocheckout = driver.findElement(By.xpath("//*[@id=\"hlb-ptc-btn-native\"]"));
		proceedtocheckout.click();
		//checkout-process
		WebElement country = driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-countryCode-dropdown-nativeId\"]"));
		Select dropdowncountry = new Select(country);
		dropdowncountry.selectByVisibleText("India");
		driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressFullName\"]")).sendKeys("lavanya");
		driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressPhoneNumber\"]")).sendKeys("9876543210");
		driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressPostalCode\"]")).sendKeys("560063");
		driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressLine1\"]")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressLine2\"]")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-landmark\"]")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressCity\"]")).sendKeys("Bangalore");
		WebElement Region = driver.findElement(By.id("address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId"));
		Select dropdownregion = new Select(Region);
		dropdownregion.selectByVisibleText("KARNATAKA");
		driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-form-submit-button\"]/span/input")).click();
		//Selecting payment option
		driver.findElement(By.cssSelector("#pp-n9cfxt-107")).click();
		
		
		
		

	}
}


