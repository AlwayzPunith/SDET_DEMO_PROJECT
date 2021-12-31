package com.crm.OrgTest;

import org.testng.annotations.Test;

public class OrgTest {

	@Test(groups = "SmokeTest")
	public void OrgTest()
	{
		System.out.println("Organazation Test");
	}
	
	@Test(groups = "RegressionTest")
	public void OrgModifyTest()
	{
		System.out.println("Organazation Modify Test");
	}
}
