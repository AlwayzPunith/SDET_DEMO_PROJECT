package com.crm.ContactTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class contactTest {
	public WebDriver driver;
	@Test(groups = "SmokeTest")
	
	public void contactTest()
	{
		//WebDriver driver;
		String BROWSER=System.getProperty("browser");
	    String URL=System.getProperty("url");
	    
	   if(BROWSER.equals("chrome"))
	   {
		   driver=new ChromeDriver();
	   }
	   if(BROWSER.equalsIgnoreCase("firefox"))
	   {
		   driver=new FirefoxDriver();
	   }
	   
	   driver.get(URL);
		System.out.println("Contact Test");

	}
	
	@Test(groups = "RegressionTest")
	public void ModifyContactTest()
	{
		System.out.println("Modify Contact Test");

	}
}
