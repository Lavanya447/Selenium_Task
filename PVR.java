package Test2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVR {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\\\webdriver\\\\chromedriver_win\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(20 ,TimeUnit.SECONDS);
		//driver.switchTo().alert().dismiss();
		WebElement country = driver.findElement(By.xpath("//*[@id=\"main__wrapper\"]/app-root/app-full-layout/nav/div/div[1]/div/div/div[2]/div[1]/div[2]/p-autocomplete/span/input"));
		country.clear();
		country.sendKeys("Bengaluru");
		driver.findElement(By.xpath("//*[@id=\"main__wrapper\"]/app-root/app-full-layout/nav/div/div[1]/div/div/div[2]/div[1]/div[2]/p-autocomplete/span/div/ul/li/div/div")).click();
		WebElement search = driver.findElement(By.xpath("//*[@id=\"main__wrapper\"]/app-root/app-full-layout/nav/div/div[1]/div/div/div[2]/div[1]/div[1]/p-autocomplete/span/input"));
		search.sendKeys("forum mall");
		Thread.sleep(3000);
		List<WebElement> searchlist= driver.findElements(By.xpath("//*[@id=\"main__wrapper\"]/app-root/app-full-layout/nav/div/div[1]/div/div/div[2]/div[1]/div[1]/p-autocomplete/span/div/ul/li/div"));
		for(WebElement list:searchlist) {
			System.out.println(list.getText());
			if(list.getText().equalsIgnoreCase("pvr, forum mall, koramangala"));
			{
				list.click();
			}
			break;
		}
		
		

	}

}
