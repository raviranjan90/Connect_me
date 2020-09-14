package onpassivewebinar.onpassivewebinar;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver .manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		WebElement from=driver.findElement(By.xpath("//span[text()='From']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", from);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("Delhi");
		//WebElement delhi = driver.findElement(By.xpath("//div[@class='react-autosuggest__container react-autosuggest__container--open']//input[@type='text']"));
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("arguments[0].value='Delhi';", delhi);
		Thread.sleep(3000);

		List<WebElement> allPlace = driver.findElements(By.xpath("//div[@class='makeFlex hrtlCenter']//p[@class='font14 appendBottom5 blackText']"));
		int size=allPlace.size();
		System.out.println(size);
		for(int i=0;i<=allPlace.size()-1;i++) {
			System.out.println(allPlace.get(i).getText());
			WebElement ele =allPlace.get(i);
			if(ele.getText().equalsIgnoreCase("Toronto, Canada")) {
				Thread.sleep(2000);
				WebElement clickele=allPlace.get(i);
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("arguments[0].click();", clickele);
				Thread.sleep(2000);
				break;
			}
		}
	}

}
