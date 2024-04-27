import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("learning");
		
		driver.findElement(By.id("signInBtn")).click();

	}

}
