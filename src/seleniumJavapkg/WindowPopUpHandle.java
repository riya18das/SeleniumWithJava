package seleniumJavapkg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUpHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Riya\\Automation\\Drivers\\chrome96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		 Set<String> handles=driver.getWindowHandles();
		 Iterator<String> it = handles.iterator();
		 String parentWindowId=it.next();
		 System.out.println("Parent window id:"+parentWindowId);
		 
		 String childWindowId = it.next();
		 System.out.println("Child window id:"+childWindowId);
		 
		 driver.switchTo().window(childWindowId);
		 //System.out.println("Child window pop up title:"+driver.getTitle());
		 driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("riya18das@gmail.com");
		 driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		 driver.close();
		 
		 driver.switchTo().window(parentWindowId);
		 System.out.println("Parent window pop up title:"+driver.getTitle());
		 
		 

	}

}
