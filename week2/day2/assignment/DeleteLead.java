package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args){
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
	    
	    driver.findElement(By.xpath("//a[text() = 'Find Leads']")).click();
	    
	    driver.findElement(By.xpath("//ul[@class = 'x-tab-strip x-tab-strip-top']/li[2]//a[2]")).click();
	    
	    driver.findElement(By.xpath("//input[@name = 'phoneNumber']")).sendKeys("8764689293");
	    
	    driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
	   
	    String leadId = driver.findElement(By.xpath("//table[@class = 'x-grid3-row-table']/tbody/tr[1]/td[@class = 'x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div/a")).getText();
	  
	    driver.findElement(By.xpath("//table[@class = 'x-grid3-row-table']/tbody/tr[1]/td[@class = 'x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div/a")).click();
	    
	    driver.findElement(By.xpath("//a[@class = 'subMenuButtonDangerous' and text() = 'Delete']")).click();
	  
	    driver.findElement(By.xpath("//a[text() = 'Find Leads']")).click();
	    
	    driver.findElement(By.xpath("//label[text() = 'Lead ID:']/parent::div/div[1]/input")).sendKeys(leadId);
	    
	    driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
	 
	    String isLeadDeleted = driver.findElement(By.xpath("//div[@class = 'x-toolbar x-small-editor']/div")).getText();
	 
	    System.out.println(isLeadDeleted);
	  
	    driver.close();
}
}

	