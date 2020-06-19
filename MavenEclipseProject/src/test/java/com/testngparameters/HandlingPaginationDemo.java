package com.testngparameters;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingPaginationDemo {

	public WebDriver driver;
	
@Test
	public void HandlingPage()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
		
		  List<WebElement> namesElements = driver.findElements(By.xpath("//*[@id=\"example\"]/tbody/tr/td[1]"));
		 List<String> names = new ArrayList<String>();
		for(WebElement namesElement: namesElements)
		{
		 names.add(namesElement.getText());
		}
		
		String nextButtonClassName = driver.findElement(By.id("example_next")).getAttribute("class");
		while(!nextButtonClassName.contains("disabled"))
		{
			driver.findElement(By.id("example_next")).click();
			namesElements =driver.findElements(By.xpath("//*[@id=\"example\"]/tbody/tr/td[1]"));
			
			for(WebElement namesElement:namesElements)
			{
				names.add(namesElement.getText());
			}
			
			nextButtonClassName = driver.findElement(By.id("example_next")).getAttribute("class");
		}
		
		for(String name:names)
		{
			System.out.println(name);
		}
		
		int totalNames =names.size();
		System.out.println("Total number of names :"+ totalNames);
		String displayedCount = driver.findElement(By.id("example_info")).getText().split(" ")[5];
		System.out.println("Total number of displayed names count:" +displayedCount);
		Assert.assertEquals(displayedCount,String.valueOf(totalNames));
	}
}
