package com.mybase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basepage {
	public WebDriver driver;
	public WebDriverWait wait;
	
	
	public WebDriver setup(String name)
	{
		if(name.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--headless");
			driver=new ChromeDriver(); 
		}
		else if(name.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions fo=new FirefoxOptions();
			fo.addArguments("--headless");
			driver=new FirefoxDriver();
		}
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	

}
