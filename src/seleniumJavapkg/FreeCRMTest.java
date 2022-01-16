package seleniumJavapkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeCRMTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Riya\\Automation\\Drivers\\chrome96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://freecrm.com");
		driver.findElement(By.xpath("//a[contains(@class,'btn btn-primary btn')]")).click();

	}

}
