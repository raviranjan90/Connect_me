package onpassivewebinar.onpassivewebinar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollDown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver .manage().window().maximize();
		driver.get("https://www.gofounders.net");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='main input-effect']//input[@id='email']")).sendKeys("vijayakumar.y@onpassive.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='main input-effect']//input[@id='password']")).sendKeys("Qwerty@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(3000);
		System.out.println("here1");
		
		WebElement connect = driver.findElement(By.xpath("//span[contains(text(),'Connect')]"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(connect));
	
		Point pt =connect.getLocation();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+ pt);
		System.out.println("here2");
		Thread.sleep(2000);
		
		connect.click();
	}
}
