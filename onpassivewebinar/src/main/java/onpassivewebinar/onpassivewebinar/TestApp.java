package onpassivewebinar.onpassivewebinar;
/*
 * 
 * @author ravi
 */


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestApp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver .manage().window().maximize();
		driver.get("https://connectmedev.onpassive.com/home.do");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='nav-item ng-star-inserted']//a[contains(text(),'Login')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ravii.ranjan49@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='input-group mb-3']//input[@type='password']")).sendKeys("Onp@ssive90");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary op-log-in-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='event-name']")).sendKeys("30AugMEET");
		Thread.sleep(3000);
		WebElement roomtype = driver.findElement(By.xpath("//div[contains(text(),'Time Schedule')]"));
		Point pt1 = roomtype.getLocation();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+pt1);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='mat-input-2']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//button[@class='btn btn-link ngb-dp-arrow-btn'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn btn-link ngb-dp-arrow-btn'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='btn-light ng-star-inserted'])[20]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='chevron ngb-tp-chevron bottom'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='chevron ngb-tp-chevron bottom'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' Set date and time ']")).click();



		driver.findElement(By.xpath("//input[@id='mat-input-3']")).click();
		Thread.sleep(2000);
		String  time_zone = "Asia/Kolkata";
		String t2 = "Asia/Dhaka";
		List<WebElement> list_option = driver.findElements(By.xpath("//mat-option[@class='mat-option mat-focus-indicator ng-star-inserted']//span[@class='mat-option-text']"));
		for (int i=0;i<=list_option.size()-1;i++)
		{
			//System.out.println(list_option.get(i).getText());
			//Thread.sleep(2000);
			if(list_option.get(i).getText() == time_zone) {
				Thread.sleep(2000);
				list_option.get(i).click();
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Password')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Onpassive90@");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='comments']")).sendKeys("hello");
		Thread.sleep(2000);
		WebElement cancel= driver.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
		Point pt2= cancel.getLocation();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy"+pt2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Create and invite')]")).click();


	}
}
