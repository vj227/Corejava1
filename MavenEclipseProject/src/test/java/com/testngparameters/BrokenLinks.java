package com.testngparameters;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {
	

	
	public static void main() throws IOException {
	
	{
		
    	WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.tutorialspoint.com/index.htm");
	List<org.openqa.selenium.WebElement> links = driver.findElements(By.linkText("a"));
	
	System.out.println(links.size());
	
	for(int i=0;i<links.size();i++)
	{
		//by using href attribute we can get url of required link
		org.openqa.selenium.WebElement element = links.get(i);
		
		String url = element.getAttribute("href");
		
		URL link= new URL(url);
		// create a connection using url object link
		
		HttpURLConnection httpConn =(HttpURLConnection) link.openConnection();
		
		// used to establish a connection
	
		httpConn.connect();
		int rescode = httpConn.getResponseCode(); //return response codes above 400 then it is broken link
		if(rescode>400)
		{
			System.out.println(url+"-"+ "is broken link");
		}
		else
		{
			System.out.println(url+"-"+ "is valid link");
		}
	}
		
		
		
	}
	
	}
}
