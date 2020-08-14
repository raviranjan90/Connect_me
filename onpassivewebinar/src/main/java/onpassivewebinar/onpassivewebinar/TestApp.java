package onpassivewebinar.onpassivewebinar;

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
		driver.findElement(By.xpath("//li[@class='nav-item']//a[contains(text(),' Login ')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='input-group mb-3']//input[@type='text']")).sendKeys("ravii.ranjan49@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='input-group mb-3']//input[@type='password']")).sendKeys("Onp@ssive90");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary op-log-in-button']")).click();
		Thread.sleep(3000);

		WebElement element=driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c83-9']"));
		Point pt = element.getLocation();
		JavascriptExecutor je =(JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollIntoView()", element);
		//Actions act = new Actions(driver);
		//act.moveToElement(element);
		//System.out.println(pt);
		//JavascriptExecutor je =(JavascriptExecutor)driver;
		//je.executeScript("window.scrollBy" +pt);

		driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c83-9']")).click();
		Thread.sleep(2000);
		List<WebElement> list_option = driver.findElements(By.xpath("//span[@class='mat-option-text']"));
		for (int i=0;i<=list_option.size()-1;i++)
		{
			System.out.println(list_option.get(i).getText());

		}


	}
}
