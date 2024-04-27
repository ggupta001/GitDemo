import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_handling {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Stepcampus");
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		// note:-  any alert type we can hand;e with this lie of code, if ok/confirm is there --> .accept() and if cancle,no--> .dismiss()

	}

}
