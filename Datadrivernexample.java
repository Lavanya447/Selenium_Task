package Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadrivernexample {
	//create the data provider from data
	@Test(dataProvider="testdata")
	public void Testdtt(String uname,String password)
	
	{
		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(uname);	
		driver.findElement(By.xpath("//*[@id=\"passContainer\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"passContainer\"]")).sendKeys(password);
	}
		//Data provider which actually feed data from the our test
		@DataProvider
		Object[][] testdata(){
			Object[][] facebookdata= new Object[2][2];
			facebookdata [0][0] ="test1";
			facebookdata [0][1] ="test2";
			facebookdata [1][0] ="test3";
			facebookdata [1][1] ="test4";
			return facebookdata;
			
			
			
		
	}

}
