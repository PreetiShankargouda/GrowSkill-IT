package seleniumFirst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
