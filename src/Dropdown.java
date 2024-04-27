import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// this command is for maximizing the window
		
		
		driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise/");
		   //going back:--
		 Thread.sleep(2000);
		driver.navigate().back();
		 Thread.sleep(2000);
		driver.navigate().forward();
		
		
		//driver.get("https://rahulshettyacademy.com/loginpagePractise/");
//		Thread.sleep(2000);
//		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("learning");
//		Thread.sleep(2000);
//		WebElement staticdropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
//		Select dropdown = new Select(staticdropdown);
//		//dropdown.selectByIndex(1);  
//		//dropdown.selectByVisibleText("Teacher");
//		dropdown.selectByValue("consult");
	   
		
		//driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise/")
		
		Thread.sleep(2000);
		
		
		
	
		

	}

}
