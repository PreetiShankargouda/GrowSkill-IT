package seleniumFirst;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(3000);
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		
		driver.findElement(By.className("submit-button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		Thread.sleep(3000);
		System.out.println("driver.getCurrenturl()");
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("btn btn_secondary")).click();
		Thread.sleep(3000);
		System.out.println("driver.getCurrenturl()");
		
		List<WebElement> listOfElements = driver.findElements(By.tagName("a"));
		System.out.println(listOfElements.size());
		Thread.sleep(3000);
		
		driver.findElement(By.id("menu-item")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Logout")).click();	
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
