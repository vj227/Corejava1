package com.testngparameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parameters {
	
	public WebDriver  driver;
	
	
	@Test
    @Parameters({"url","search"})
	public void yahooLoginTest(String url,String search) {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.findElement(By.id("gsc-i-id1")).clear();
		driver.findElement(By.id("gsc-i-id1")).sendKeys(search);
		driver.findElement(By.xpath("//button[@class='gsc-search-button gsc-search-button-v2']")).click();
		driver.close();
	}
	
	
	


}
