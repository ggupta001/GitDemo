import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("ss@gmail.com");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(2000);
	     System.out.println(driver.findElement(By.xpath("//h2[@class='_8eso']")).getText());
		//driver.close();
	
		
	}
}