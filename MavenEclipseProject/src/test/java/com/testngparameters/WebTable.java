package com.testngparameters;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
  public WebDriver driver;
  
  @Test
  public void WebTable()
  {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			//*[@id="customers"]/tbody/tr[2]/td[1]
			//*[@id="customers"]/tbody/tr[3]/td[1]
			List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
			int rowCount=rows.size();
			System.out.println(" total row in web table :" + rowCount);
			
			String beforeXpath="//*[@id=\"customers\"]/tbody/tr[";
			String  afterXpath="]/td[1]";
			
	
			
			for(int i=2;i<=rowCount;i++)
			{
				String actualXpath = beforeXpath+i+afterXpath;
				WebElement element = driver.findElement(By.xpath(actualXpath));
				System.out.println(element.getText());
				if(element.getText().equals("Ernst Handel")) {
					
               System.out.println("company name: "+ element.getText()+ "is found");
               break;
				}
			}
			
			System.out.println("===========");
			
			//*[@id="customers"]/tbody/tr[2]/td[2]
			
		String afterXpathContact = "]/td[2]";
		for(int i=2;i<=rowCount;i++) {
			
			
			String actualXpathContact = beforeXpath+i+afterXpathContact;
			WebElement element = driver.findElement(By.xpath(actualXpathContact));
			System.out.println(element.getText());
		}
		
			
			
			
  }
  
	
	
}
