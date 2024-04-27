import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class previousDay {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//10 March 2025;   03/10/2025
		String Date="10";
		String Month="March";
		String Year="2028";
		
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		Thread.sleep(2000);
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(2000);
		
		String month_year=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(month_year);
		
		String month=month_year.split(" ")[0].trim();
		System.out.println(month);
		String year=month_year.split(" ")[1].trim();
		System.out.println(year);
		
		
		while (!(month.equals(Month) && year.equals(Year))) {
			
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			 month_year=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			System.out.println(month_year);
			
			 month=month_year.split(" ")[0].trim();
			System.out.println(month);
			 year=month_year.split(" ")[1].trim();
			System.out.println(year);
		}
		driver.findElement(By.xpath("//a[text()='"+ Date +"']")).click();
		Thread.sleep(5000);
		//driver.close();
	}

	
	
	
	
}
