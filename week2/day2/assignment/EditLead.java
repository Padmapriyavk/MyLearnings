package week2.day2.assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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

	    driver.findElement(By.xpath("//input[@id = 'createLeadForm_companyName']")).sendKeys("Priya_LeadCompanyName1");
	    
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_firstName']")).sendKeys("Priya_LeadFirstName1");

		driver.findElement(By.xpath("//input[@id = 'createLeadForm_lastName']")).sendKeys("Priya_LeadLastName1");
	
		driver.findElement(By.xpath("//input[@id= 'createLeadForm_firstNameLocal']")).sendKeys("PriLocal");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Priya_Department");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Priya_Description");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("priya_test@gmail.com");
		
		Select selectState = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		
		selectState.selectByValue("NY");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.xpath("//a[text() = 'Edit']")).click();
		
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		driver.findElement(By.id("updateLeadForm_description")).sendKeys("This is an Imp Note Updated");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println(driver.getTitle());

		driver.close();
	}

}
