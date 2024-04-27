import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTab {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		Set <String> windows1 = driver.getWindowHandles();
		System.out.println(windows1);
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		Set <String> windows2 = driver.getWindowHandles();
		System.out.println(windows2);
		
		Iterator <String> it = windows2.iterator();// it has knowledge of all the tabs
		String ParentID = it.next();
		String ChildID = it.next();
		
		
		driver.switchTo().window(ChildID);
		
		
		String text=driver.findElement(By.xpath("//strong/a")).getText();
		System.out.println(text);

	}

}
