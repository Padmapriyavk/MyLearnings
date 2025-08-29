package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
    public static void main(String[] args) {
	//Instantiate the browser driver
	ChromeDriver driver = new ChromeDriver();
	//Load the url
	driver.get("http://www.facebook.com/");
	//Maximize
	driver.manage().window().maximize();
	//close the browser
	driver.close();
		
}
}
