package com.crm.qa.TestCases;

import com.crm.qa.BaseClass.TestBase;

public class Test {

	public static void main(String[] args) {

		TestBase s= new TestBase();
		 String a=s.property.getProperty("Browser");
		 String a=s.System.getProperty("Browser");
		 System.out.println(a);
	}

}
