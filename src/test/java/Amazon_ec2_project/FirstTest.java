package Amazon_ec2_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class FirstTest {

	@Test
	public void OpenBrowser() {
		WebDriver driver;
		System.setProperty("webDriver.chrome.driver"," /usr/bin/google-chrome");
		ChromeOptions option =new ChromeOptions();
		option.addArguments("headless");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("--------------------");
		System.out.println(driver.getTitle());
//		Assert.assertTrue("page title is not correct",driver.getTitle().equals("Google"));
		Assert.assertTrue(driver.getTitle().equals("Google"),"page title is not correct");
	}
}
