package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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

	    driver.findElement(By.linkText("Accounts")).click();

		driver.findElement(By.linkText("Create Account")).click();

		driver.findElement(By.id("accountName")).sendKeys("Priya_AccountName");

		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		Select selectIndustry = new Select(driver.findElement(By.name("industryEnumId")));
		
		selectIndustry.selectByVisibleText("Computer Software");
		
		Select selectOwnership = new Select(driver.findElement(By.name("ownershipEnumId")));
		
		selectOwnership.selectByVisibleText("S-Corporation");
		
		Select selectSource = new Select(driver.findElement(By.id("dataSourceId")));
		
		selectSource.selectByValue("LEAD_EMPLOYEE");
		
		Select selectMarketCampId = new Select(driver.findElement(By.id("marketingCampaignId")));
		
		selectMarketCampId.selectByIndex(6);
		
		Select selectState = new Select(driver.findElement(By.id("generalStateProvinceGeoId")));
		
		selectState.selectByValue("TX");
		
	   

		driver.findElement(By.className("smallSubmit")).click();

	
	
      String accountName = driver.findElement(By.id("accountName")).getAttribute("value");
    	System.out.println(accountName);
		driver.close();
}


	}


