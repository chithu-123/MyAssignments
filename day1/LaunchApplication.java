package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		
	}

}
