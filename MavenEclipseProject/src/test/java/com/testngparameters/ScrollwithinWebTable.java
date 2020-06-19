package com.testngparameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollwithinWebTable {

	public WebDriver driver;
	@Test 
	public void ScrollWithintheWebTable() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		
		WebElement itemsperPageDropdown = driver.findElement(By.xpath("/html/body/section/div[1]/div/div[3]/div[2]/div[1]/div[2]/select"));
		Select select= new Select(itemsperPageDropdown);
		select.selectByVisibleText("30");
		Thread.sleep(7000);
		
		EventFiringWebDriver eventFiringWebDriver=new EventFiringWebDriver(driver);
		eventFiringWebDriver.executeScript("document.querySelector('div[role=\"rowgroup\"][class*=\"ui-grid-viewport\"]').scrollTop=500");
		
	}
	
	
	
	
	
	
	
	
}
