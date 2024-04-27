import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_hanling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		//driver.findElement(By.id("checkBoxOption2")).click();  -- this is for selecting 1 checkbox
		
		// Now we will see how to select all the checkboxes
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@id='checkbox-example']//label/input"));
		System.out.println(checkboxes);
		
		int sizes = checkboxes.size();
		System.out.println(sizes);
		
		
		for (int i=0;i<sizes;i++)
		{
			checkboxes.get(i).click();
			Thread.sleep(2000);
		}

	}

}
