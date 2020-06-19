package com.testngparameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalParameter {

	
	@Test
	@Parameters({"optional-value"})
	public void optionalParameterTesting(String param)
	{
		
		System.out.println(param);
	}
}
