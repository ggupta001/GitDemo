import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_calendar2 {

	public static void main(String[] args) {
		
		//Date:- 10th July 2029
		
		String Date="10";
		String Month="September";
		String Year="2029";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		
		String month_year= driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(month_year);
		String month=month_year.split(" ")[0];
		String year=month_year.split(" ")[1];
		
		while (!(month.equals(Month)&& year.equals(Year))) {
			
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			 month_year= driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			System.out.println(month_year);
			 month=month_year.split(" ")[0];
			 year=month_year.split(" ")[1];
		}
		
		
		driver.findElement(By.xpath("//a[text()='"+Date+"']")).click();
	
	}

}
