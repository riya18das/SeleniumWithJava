package seleniumJavapkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\Riya\\Automation\\Drivers\\chrome96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@type='submit']")).click(); //clicking on sign in button
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		String alertMessage = alert.getText();
		if (alertMessage.equals("Please enter a valid user name")){
				System.out.println("Correct alert");
		}
		else {
				System.out.println("Incorrect alert");	
		}
		alert.accept();//to click on ok button
		//alert.dismiss();//to click on cancel button
	}

}
