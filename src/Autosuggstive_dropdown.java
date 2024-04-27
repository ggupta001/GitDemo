import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggstive_dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ame");
		Thread.sleep(2000);
		
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));// ['1','2','3']
		System.out.println(options.size());
		
		for (WebElement option : options )
		{
			if (option.getText().equalsIgnoreCase("Suriname"))
			option.click();
			
		}

	}

}
