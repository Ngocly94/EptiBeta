package automationwebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scenario1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/ngocc/Documents/AutomationTest/03Tool/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		System.out.println("Open sucessfully");
		driver.findElement(By.id("contact-link")).click();
		String expectedTitle="CUSTOMER SERVICE - CONTACT US";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.navigate().back();
		String expectedTitle1="My store";
		String actualTitle1=driver.getTitle();
		Assert.assertEquals(actualTitle1, expectedTitle1);
		driver.navigate().forward();
	}
}
