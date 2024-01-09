package practice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//wait time before proceeding to next line of code (generally applied)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//open website
		driver.get("https://www.saucedemo.com/");
		
		//login using locked_out_user
		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		//printing in console error message for verification
		System.out.println(driver.findElement(By.cssSelector("h3[data-test='error']")).getText());
		
		Thread.sleep(1000); //delay before closing browser
		driver.quit();

	}

}
