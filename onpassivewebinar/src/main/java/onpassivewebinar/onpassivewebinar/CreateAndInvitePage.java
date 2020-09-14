package onpassivewebinar.onpassivewebinar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class CreateAndInvitePage {

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
		driver.findElement(By.xpath("//input[@id='event-name']")).sendKeys("meeting48");
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
		driver.findElement(By.xpath("(//div[@class='btn-light ng-star-inserted'])[25]")).click();
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
		Thread.sleep(2000);
		
		WebElement participabts = driver.findElement(By.xpath("//span[text()='Participants']"));
		Point move = participabts.getLocation();
		JavascriptExecutor exe=(JavascriptExecutor)driver;
		exe.executeScript("window.scrollBy"+move);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='home-tab']")).click();
		Thread.sleep(3000);
		
		WebElement fb_scroll = driver.findElement(By.xpath("//i[@class='fa fa-facebook']"));
		Point fb = fb_scroll.getLocation();
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy"+fb);
		Thread.sleep(2000);
		

		driver.findElement(By.xpath("(//h6[text()='Copy and paste'])[1]")).click();
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='mat-chip-list-input-0']")).sendKeys("ravi.ranjan@onpassive.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//h1[text()='Enter your contacts'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='mat-chip-list-input-0']")).sendKeys("ravii.ranjan49@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//h1[text()='Enter your contacts'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='mat-checkbox-inner-container'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='text-center ng-star-inserted']//button[@type='button']")).click();
		Thread.sleep(2000);
		
		WebElement send_invite =driver.findElement(By.xpath("//span[contains(text(),' Send Invitation ')]"));
		Point move_down = send_invite.getLocation();
		JavascriptExecutor javaexe =(JavascriptExecutor)driver;
		javaexe.executeScript("window.scrollBy"+ move_down);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),' Send Invitation ')]")).click();
		Thread.sleep(2000);
		
		WebElement my_event = driver.findElement(By.xpath("//a[@id='op-logo']//img[@class='img-fluid']"));
		Point move_up = my_event.getLocation();
		JavascriptExecutor javaExecutor =(JavascriptExecutor)driver;
		javaExecutor.executeScript("window.scrollBy"+ move_up);
		Thread.sleep(4000);
		
		WebElement myEvent = driver.findElement(By.xpath("//a[@class='nav-link']"));
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.visibilityOf(myEvent));
//		myEvent.click();
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", myEvent);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()=' Join '])[14]")).click();
		////*[@id="mat-tab-content-8-0"]/div/app-op-event-lists/table/tbody/tr[10]/td[3]/div/div[1]/a
		
	}

}
