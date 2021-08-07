package com.nopCommerceV2.testCases;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.utils.FileUtil;
import com.nopCommerce.utility.ReadConfig;

public class BaseClass {
	
	//ReadConfig readconfig=new ReadConfig();
	// when excute my test case first readconfig object will created
	//when call the get application url,it will go and excute this method(getapplicationURl)
	//

	//public String baseURL=readconfig.getApplicationURL();
	//public String username=readconfig.getUseremail();
	//public String password=readconfig.getPassword();
	//public static WebDriver driver;
	
	
	   public String baseURL="http://admin-demo.nopcommerce.com/";
		public String username="admin@yourstore.com";
		public String password="admin";
		public static WebDriver driver;
		
		
	
	
	public static Logger logger; //Added logger
	 
	@BeforeClass
	//@Parameters("browser")
	//public void setup(String br)
	public void setup()
	
	{
		
		
		//System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
		//=new FirefoxDriver();
		
		logger = Logger.getLogger("eCommerce"); //Added logger
		PropertyConfigurator.configure("Log4j.properties");//Added logger
	
		//if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe" );
		driver=new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver",readconfig.getchromePath());
		//driver=new ChromeDriver();
		
		
		
		
		//else if(br.equals("firefox")) {
			
			
		}
		
		
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
		
	}
	/*public void captureScreen(WebDriver driver, String tname)  {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}*/
	
	
		
}



