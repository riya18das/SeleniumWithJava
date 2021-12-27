package seleniumJavapkg;

import java.util.concurrent.TimeUnit;
import java.sql.DriverManager;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleMouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\Riya\\Automation\\Drivers\\chrome96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		//JavascriptExecutor js = (JavascriptExecutor) DriverManager.getWebDriver();
		//js.executeScript("arguments[0].click();", element);
		//Thread.sleep(6000);
		//switch to Alert box
		/*Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		if (alertMessage.equals("Alert")){
			System.out.println("Correct alert");
		}
		else {
			System.out.println("Incorrect alert");	
	}
		alert.accept();	*/
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@aria-label='Menu Holiday']"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//a//span[text()='Special Trains']"))).build().perform();
		driver.findElement(By.xpath("(//span[@class='list_text' and text()='Tourist Train'])[1]")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
