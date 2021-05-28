package Test2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class redbussearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\\\webdriver\\\\chromedriver_win\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.redbus.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//body/section[@id='rh_main']/div[@id='mBWrapper']/main[1]/section[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"dest\"]")).sendKeys("hyderabad");
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[2]/div/ul/li[1]")).click();
		driver.findElement(By.cssSelector("div.rb-calendar:nth-child(22) table.rb-monthTable.first.last tbody:nth-child(1) tr:nth-child(7) > td.current.day:nth-child(5)")).click();
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		String results= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/h3")).getText();
		System.out.println("Search results****** "+ results);
		
		
	}
}

	

