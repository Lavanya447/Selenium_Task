package Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

public class redbuslogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\webdriver\\chromedriver_win.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.manage().deleteAllCookies();
        driver.findElement(By.cssSelector("#i-icon-profile")).click();

       
        
    }
}