import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class Invoke_Browser {

	public static void main(String[] args) throws InterruptedException {
		
		
		// invoking the browser
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		
		// to close the browser, we have two different methods
		
		//driver.close();  // it will close the current session of browser
		
		driver.quit();  // it will close all the session of browser/ it will quit the chromedriver itself.
		
		
		
		
		
		
		
		

	}

}
