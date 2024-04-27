import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_button {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='user']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("okayBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='admin']")).click();
		

	}

}
