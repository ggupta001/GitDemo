import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalendar {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		
	String Year ="2025";
	String Month ="12";
	String Date = "29";

	driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']")).click();
	driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
	driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
	driver.findElement(By.xpath("//button[text()='"+Year+"']")).click();
	
	driver.findElements(By.xpath("//button[@class='react-calendar__tile react-calendar__year-view__months__month']")).get(Integer.parseInt(Month)-1).click();	
	driver.findElement(By.xpath("//abbr[text()='"+Date+"']")).click();
	
	}

}
