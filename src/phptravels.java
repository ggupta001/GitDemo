import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class phptravels {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.phptravels.net/");
		driver.findElement(By.xpath("//span[text()='Hotels']")).click();
		driver.findElement(By.xpath("//span[@title=' Search by City']")).click();
		driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("Delhi");
		
	}

}
