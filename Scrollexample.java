package Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\\\webdriver\\\\chromedriver_win\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		JavascriptExecutor je= (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//*[@id=\"mCSB_8_container\"]/p[4]"));
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		System.out.println(element.getText());
		Thread.sleep(200);
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/p[1]"));
		je.executeScript("arguments[0].scrollIntoView(true);",element2);
		System.out.println(element2.getText());
		
		
	}

}
