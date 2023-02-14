package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(2000);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Atos Syntel");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Chitra");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Venkatraman");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Chitra V");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Analytics");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I have a five years experience in ETL process");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("chithuec@gmail.com");
		WebElement sDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd=new Select(sDropDown);
		dd.selectByVisibleText("New York");
		driver.findElement(By.className("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("I have well knowledge in Azure");
		driver.findElement(By.name("submitButton")).click();
		driver.getTitle();
	
	}

}
