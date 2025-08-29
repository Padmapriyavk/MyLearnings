package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);

			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().window().maximize();

			driver.findElement(By.id("username")).sendKeys("demosalesmanager");

			driver.findElement(By.id("password")).sendKeys("crmsfa");

			driver.findElement(By.className("decorativeSubmit")).click();

			driver.findElement(By.partialLinkText("CRM")).click();

		    	driver.findElement(By.linkText("Leads")).click();
		    	
		    	driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya_LeadFirstName");

			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Priya_LeadLastName");
			
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Priya_LeadCompanyName");
			driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Title");
			
			

			driver.findElement(By.className("smallSubmit")).click();

			System.out.println(driver.getTitle());
            driver.close();
	}



	}


