import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class file_upload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\MITUL\\Downloads\\How to Handle Frames in Selenium WebDriver.png");
		driver.findElement(By.id("file-submit")).click();
	}

}
