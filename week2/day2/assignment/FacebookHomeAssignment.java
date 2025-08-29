package week2.day2.assignment;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class FacebookHomeAssignment {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		ChromeOptions options= new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://en-gb.facebook.com/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
driver.findElement(By.linkText("Create new account")).click();

		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("TestFirstName1");

		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("TestSurName1");
		
		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("Test1@gmail.com");
		
		Select selectDay = new Select(driver.findElement(By.xpath("//select[@name = 'birthday_day']")));
		
		Select selectMonth = new Select(driver.findElement(By.xpath("//select[@name = 'birthday_month']")));
		
		Select selectYear = new Select(driver.findElement(By.xpath("//select[@name = 'birthday_year']")));
		
		selectDay.selectByVisibleText("16");
		
		selectMonth.selectByVisibleText("Aug");
		
		selectYear.selectByVisibleText("1990");
		
		driver.findElement(By.xpath("//label[text() = 'Female']/input")).click();
		
		driver.findElement(By.xpath("//input[@id  = 'password_step_input']")).sendKeys("TestPassword@123");
		
		//driver.findElement(By.name("websubmit")).click();
		
		//driver.close();
	}

}
