package com.mypages;

import org.openqa.selenium.By;

import com.mybase.Basepage;

public class Homepage extends Basepage{
	
	public void Verifyhomepagemenus()
	{
	 driver.findElement(By.id("header_logo")).click();
	 driver.findElement(By.xpath("(//div[@id='block_top_menu']/descendant::a[contains(text(),'T-shirts')])[2]")).click();
	String proname=driver.findElement(By.xpath("//a[contains(text(),'Faded Short Sleeve T-shirts')]")).getText();
	System.out.println(proname);
    String Price=driver.findElement(By.xpath("(//span[contains(@class,'price product-price')])[1]")).getText();
    System.out.println(Price);
    String Availability=driver.findElement(By.xpath("//span[contains(@class,'available-now')]")).getText();
    System.out.println(Availability);
    
	}
	
	public void stop()
	{
		driver.close();
	}
    

}
