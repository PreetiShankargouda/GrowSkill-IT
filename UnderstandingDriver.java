package seleniumFirst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class UnderstandingDriver {

	public static void main(String[] args) {
		WebDriver driver = null;
		
		String browserName ="Chrome";
		
		switch(browserName)
		{
		case "Chrome":

			driver = new ChromeDriver();
			break;
		case "Safari":
			driver = new SafariDriver();
			break;
		default: System.out.println("Invalid browser name provided");
		}
		
		driver.get("https://www.google.com");
		driver.close();
		

	}

}
