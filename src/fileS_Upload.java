import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileS_Upload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(4000);
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\MITUL\\Downloads\\file_upload.png");
		driver.findElement(By.id("file-submit")).click();
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		

	}

}
