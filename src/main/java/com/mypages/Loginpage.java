package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.mybase.Basepage;

public class Loginpage extends Basepage{
	
	public void dologin()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		System.out.println("Login button clickked");
		driver.findElement(By.id("email")).sendKeys("test420@gmail.com");
		System.out.println("user entered id");
		driver.findElement(By.id("passwd")).sendKeys("Test12345");
		System.out.println("user entered password");
		driver.findElement(By.id("SubmitLogin")).click();
		System.out.println("Login successfull");
		String text=driver.findElement(By.xpath("//h1[contains(text(),'My account')]")).getText();
	    System.out.println(text);
		System.out.println("Login page text verified");
	    driver.findElement(By.id("header_logo")).click();
		 driver.findElement(By.xpath("(//div[@id='block_top_menu']/descendant::a[contains(text(),'T-shirts')])[2]")).click();
		String proname=driver.findElement(By.xpath("//a[contains(text(),'Faded Short Sleeve T-shirts')]")).getText();
		System.out.println(proname);
	    String Price=driver.findElement(By.xpath("(//span[contains(@class,'price product-price')])[1]")).getText();
	    System.out.println(Price);
	    String Availability=driver.findElement(By.xpath("//span[contains(@class,'available-now')]")).getText();
	    System.out.println(Availability);
		
		
	}
	
	public void teardown()
	{
		driver.quit();
	}
	

}
