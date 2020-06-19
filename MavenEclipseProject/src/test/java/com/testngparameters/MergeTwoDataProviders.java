package com.testngparameters;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MergeTwoDataProviders {

	
	@Test(dataProvider="mergedDataProvider")
	public void usingTwoDataProviders(HashMap<String, String> data) {
		
		System.out.println("FirstName is:" + data.get("FirstName"));
		System.out.println("LastName is:" + data.get("LastName"));
		System.out.println("Location is:" + data.get("Location"));
		
		System.out.println("Email is:" + data.get("Email"));
		System.out.println("Phone is:" + data.get("Phone"));
	}
	
	
  @DataProvider(name="mergedDataProvider")
 public static Object[][] mergedDataProvider()
 {
	  HashMap<String,String> dp3 = new HashMap<String,String>();
	  dp3.putAll((HashMap<String, String>) dataProviderOne()[0][0]);
	  dp3.putAll((HashMap<String, String>) dataProviderTwo()[0][0]);
	 
	  Object[][] o= new Object[1][];
	  o[0]=new Object[] {dp3};
	  
	  return o;
 } 
  
  @DataProvider(name= "dataProviderOne")
  public static Object[][] dataProviderOne(){
	  Object[][]o=new Object[1][];
	  HashMap<String,String> dp1=new HashMap<String,String>();
	  
	  dp1.put("FirstName","Krishna");
	  dp1.put("LastName","Singh");
	  dp1.put("Location","Kolkata");	
	  
	  Object[][] o1= new Object[1][];
	  o1[0]=new Object[] { dp1 };
	  
	  return o1;
  }
  
  @DataProvider(name="dataProviderTwo")
  public static Object[][]dataProviderTwo(){
	  Object[][]o=new Object[1][];
	  HashMap<String,String> dp2=new HashMap<String,String>();
	  
	  dp2.put("Email","rk@gmail.com");
	  dp2.put("Phone","1234567890");

	  Object[][] o1= new Object[1][];
	  o1[0]=new Object[] { dp2 };
	  return o1;
  }
	  
}

  
 
	

