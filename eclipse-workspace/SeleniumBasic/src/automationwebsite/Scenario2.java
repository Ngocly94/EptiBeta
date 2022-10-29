package automationwebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/ngocc/Documents/AutomationTest/03Tool/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://zingnews.vn/");
		System.out.println("Mở thành công");
		driver.findElement(By.class("<a href=\"/the-gioi.html\" title=\"Thế giới\">Thế giới</a>")).click();
		
		
		
		
	}
}