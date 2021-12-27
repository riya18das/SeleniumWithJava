package seleniumJavapkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\Riya\\Automation\\Drivers\\chrome96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		//Thread.sleep(5000);
		
		List <WebElement> linklist= driver.findElements(By.tagName("a"));
		//size of link list
		System.out.println(linklist.size());
		//to get the text of all the links
		for(int i=0;i<linklist.size();i++) {
			String linkText = linklist.get(i).getText();
			System.out.println(linkText);
		}
	}

}
