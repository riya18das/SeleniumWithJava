package seleniumJavapkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdownHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Riya\\Automation\\Drivers\\chrome96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		//List<WebElement> list= driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//li//a//label"));
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='Angular']")).click();
		
		
		
//		  System.out.println(list.size());
//		  
//		  for(int i=0;i<list.size();i++) { System.out.println(list.get(i).getText());
//		  list.get(i).click(); }
		 
		
//		for(int i=0;i<list.size();i++) {
//		System.out.println(list.get(i).getText());
//			if(list.get(i).getText().contains("Angular")) {
//				list.get(i).click();
//				break;
//			}
		}
		
	}

