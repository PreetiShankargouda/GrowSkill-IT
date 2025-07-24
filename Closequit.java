package seleniumFirst;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closequit {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles.size());
		 
		Iterator<String> it = handles.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		
		System.out.println(childWindow);
		System.out.println(driver.getTitle());
		driver.close();
		System.out.println(parentWindow);
		System.out.println(driver.getTitle());
		
		driver.close();
		
		
		

	}

}
