package com.crm.qa.Utilities;

import com.crm.qa.Constants.Constants;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Xls_Reader Xls_Reader = new Xls_Reader(Constants.TEST_DATA_SHEET_PATH);
		int couny=Xls_Reader.getRowCount("Contacts");
		//System.out.println(couny);
		String data=Xls_Reader.getCellData("Contacts", 0, 1);
		String data1=Xls_Reader.getCellData("Contacts", 1, 1);
		System.out.println(data);
		System.out.println(data1);
		Xls_Reader.setCellData("Contacts", "2", 2, "Mahendra");
	}

}
