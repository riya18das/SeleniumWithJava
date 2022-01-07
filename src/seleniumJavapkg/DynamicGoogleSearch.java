package seleniumJavapkg;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicGoogleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Riya\\Automation\\Drivers\\chrome96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement searchBox= (WebElement) jse.executeScript("return document.querySelector('ntp-app').shadowRoot.querySelector('ntp-realbox').shadowRoot.querySelector('div#inputWrapper > input#input')");
		String js = "arguments[0].setAttribute('value', 'Testing')";
		((JavascriptExecutor)driver).executeScript(js, searchBox);
	}

}
