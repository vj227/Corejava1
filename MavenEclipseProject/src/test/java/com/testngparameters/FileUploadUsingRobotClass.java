package com.testngparameters;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadUsingRobotClass {
 public WebDriver driver;
 
 @Test
 public void fileUpload() throws Exception {
	 Robot rbt=new Robot();
	 
	 WebDriverManager.firefoxdriver().setup();
	 driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("http://demo.automationtesting.in/Register.html");

	 driver.findElement(By.id("imagesrc")).click();
	
/*	 rbt.setAutoDelay(2000);
	 
	 StringSelection stringselection=new StringSelection("D:\\mna\\urt.txt");
	 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
	 
	 rbt.setAutoDelay(1000);
	 
	 rbt.keyPress(KeyEvent.VK_CONTROL);
	 rbt.keyPress(KeyEvent.VK_V);
	 
	 rbt.keyRelease(KeyEvent.VK_CONTROL);
	 rbt.keyRelease(KeyEvent.VK_V);
	 
	 rbt.setAutoDelay(1000);
	 
	 rbt.keyPress(KeyEvent.VK_ENTER);
	 rbt.keyRelease(KeyEvent.VK_ENTER);  */
	 
 }
 
}
