package Test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazontask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\\\webdriver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Get the amazon website
		driver.get("https://www.amazon.com/");
		//get the page title
		System.out.println(driver.getTitle());
		//Validation login
		//validate login 
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("lavanya.a447@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("lavanya@123");
		driver.findElement(By.xpath("//*[@id=\"auth-signin-button\"]")).click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		

	}

}
