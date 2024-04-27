import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fill_Form1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("learning");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//span[@class='radiotextsty']"));
		for( WebElement option : options)
		{
			String op= option.getText();
			System.out.println(op);
			if(op.equalsIgnoreCase("User"))
			{
				System.out.println("entered here");
			   driver.findElement(By.xpath("//span[@class='checkmark']")).click();
			   System.out.println("entered here111");
			}
		}
		//driver.close();
	
//		driver.findElement(By.cssSelector("input[id='terms']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("signInBtn")).click();
//		Thread.sleep(4000);
//		System.out.println(driver.getTitle());
		//System.out.println(driver.findElement(By.xpath("//div[contains(@class,'alert')]")).getText());
	}

}
