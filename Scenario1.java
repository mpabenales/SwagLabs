package practice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//wait time before proceeding to next line of code (generally applied)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//open website
		driver.get("https://www.saucedemo.com/");
		
		//login using standard_user
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		Thread.sleep(1000); //delay before proceeding to logout
		
		//logout
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000); //delay before actual logout
		driver.findElement(By.linkText("Logout")).click();
		
		Thread.sleep(1000); //delay before closing browser
		driver.quit();

	}

}
