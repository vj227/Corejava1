package com.testngparameters;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandle {
	
public	WebDriver driver;

@Test
public void alert()
{
	WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.ing.com/Home.htm");
			String p = driver.getTitle();
	     driver.findElement(By.xpath("//a[@href=\"https://www.ing.com/About-us.htm\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"https://www.ing.com/About-us/Compliance.htm\"]")).click();
		WebElement menu = driver.findElement(By.xpath("//a[@href=\"https://www.ing.com/About-us/Compliance/Reform-of-interest-rate-benchmarks.htm\"]"));
	//	Actions act=new Actions(driver);
		menu.click();
	//	act.moveToElement(menu).build().perform();
		
		
		//	Set<String> whs = driver.getWindowHandles();
		//	int count=whs.size();
		//	System.out.println(count);
		//	for(String w:whs)
		//	{
		//	if(p.equals(w))
		//	{
		//		driver.close();
			
		//	}
		//	else
	//		{
		//		
		//		driver.findElement(By.xpath("//p[contains(text(),\"I accept\")]")).click();
			
			}
	    	
}		
