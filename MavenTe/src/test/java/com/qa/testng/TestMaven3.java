package com.qa.testng;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMaven3 {
@Test
public void display()
{
	System.out.println("test success from3");
	Assert.assertTrue(true);
}
@Test
public void display1()
{
	System.out.println("test success from3");
	System.out.println("test success from3");
	Assert.assertTrue(true);
}


}
