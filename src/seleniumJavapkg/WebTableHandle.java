package seleniumJavapkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Riya\\Automation\\Drivers\\chrome96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		// //*[@id="customers"]/tbody/tr[2]/td[1]
		// //*[@id="customers"]/tbody/tr[3]/td[1]
		
		String beforeXpath = "//*[@id=\"customers\"]/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		List<WebElement> list= driver.findElements(By.xpath("//table[@id='customers']//tbody//tr"));
		int num=list.size();
		System.out.println(num);
		for(int i=2;i<=num;i++) {
			String actualXpath=beforeXpath+i+afterXpath;
			String companyName=driver.findElement(By.xpath(actualXpath)).getText();
			System.out.println(companyName);
		}
		

	}

}
