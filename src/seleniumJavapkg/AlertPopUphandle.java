package seleniumJavapkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUphandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Riya\\Automation\\Drivers\\chrome96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("44332");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		System.out.println(alertMessage);
		if(alertMessage.equals("Do you really want to delete this Customer?")) {
			System.out.println("Correct Alert");
		}
		else {
			System.out.println("Incorrect Alert");
		}
		alert.accept();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert.accept();
	}

}
