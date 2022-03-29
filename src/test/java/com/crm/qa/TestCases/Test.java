package com.crm.qa.TestCases;

import com.crm.qa.BaseClass.TestBase;

public class Test extends TestBase{

	public static void main(String[] args) {

		//TestBase s= new TestBase();
		 String a=property.getProperty("Browser");

		 System.out.println(a);
	}

}
