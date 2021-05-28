package Test2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Swigy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\\\webdriver\\\\chromedriver_win\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		
		//Login
		
		/*driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/div/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9036328826"); */
		
	
		// for location alertpop-up
		
		/*driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[2]/div/div[2]")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@id=\"all_restaurants\"]/div/div[2]/div[1]/div/div[1]/div[1]/a/div/div[1]/div[1]/img")).click();
		*/
		
		//for enter specific address
		WebElement location =driver.findElement(By.id("location"));
		location.sendKeys("Hsr");
		Thread.sleep(3000);
		List<WebElement> lol=  driver.findElements(By.className("_2W-T9"));
		for(WebElement l1:lol ){
			System.out.println(l1.getText());
			if(l1.getText().equalsIgnoreCase("HSR Layout, Bengaluru, Karnataka, India")) {
				l1.click();
				break;	
			}
		}
		Thread.sleep(5000);
		//for no of restaurants
		
		String number = driver.findElement(By.xpath("//*[@id=\"all_restaurants\"]/div/div[1]/div/div/div/div[1]")).getText();
		System.out.println(number);
		//Print the restaurant names & navigating to the restaurent
		
		List<WebElement> list=driver.findElements(By.className("nA6kb"));
		for(WebElement r1:list) {
			System.out.println(r1.getText());
		}
		list.get(5).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"menu-content\"]/div[1]/div[1]/div/div/div[1]/div/a[1]/div")).click();
		String listoftheitems=driver.findElement(By.xpath("//*[@id=\"h-1950595611\"]/div[1]")).getText();
		System.out.println("Number of items is ********" +listoftheitems);
		//Add items to the cart
		String item1 ="3";
		driver.findElement(By.xpath("//*[@id=\"h-1950595611\"]/div[2]/div["+item1+"]/div[1]/div/div[2]/div[2]/div/div[1]")).click();
		String item2 ="4";
		driver.findElement(By.xpath("//*[@id=\"h-1950595611\"]/div[2]/div["+item2+"]/div[1]/div/div[2]/div[2]/div/div[1]")).click();
		String item3 ="6";
		driver.findElement(By.xpath("//*[@id=\"h-1950595611\"]/div[2]/div["+item3+"]/div[1]/div/div[2]/div[2]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"modal-placeholder\"]/div[3]/div/div[2]/div/div[3]/div[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"menu-content\"]/div[2]/div/div[3]/div[3]")).click();
		Thread.sleep(3000);
		//total amount
		String amount=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div[5]/div[2]/div[2]/span/span[2]")).getText();
		System.out.println("Subtotal amount is*****"+amount);
		//delivery charges
		String deliverycharges = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div[5]/div[3]/div[2]/span")).getText();
		System.out.println("Deliverycharges ******"+ deliverycharges);
		//gst charges
		String taxes= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div[5]/div[5]/div[2]/span/span[2]")).getText();
		System.out.println("GST is ******"+taxes);
		//Total amount
		String totalamount = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[2]/div/div[3]/div[2]")).getText();
		System.out.println("The total amount******"+totalamount);

	}

}
