package com.onpassivewebinar.test;
/*
 * 
 * @author ravi
 */
import org.testng.annotations.Test;

import com.onpassivewebinar.pom.SignupPage;
import com.onpassivewebinar.utilities.BaseClass;
import com.onpassivewebinar.utilities.CommonLibrary;
import com.onpassivewebinar.utilities.FileLibrary;

public class ValidSignin extends BaseClass{

	@Test
	public void loginPage() throws Exception {
		SignupPage login = new SignupPage(driver);
		CommonLibrary commonLib= new CommonLibrary();
		FileLibrary fl = new FileLibrary();
		login.setBtnSignUp();
		Thread.sleep(4000);

		String first = fl.getCellData(SIGINEXCEL_PATH, "Sheet1", 1, 0);
		login.settxtFirstName(first);
		String sName = fl.getCellData(SIGINEXCEL_PATH, "Sheet1", 1, 1);
		login.settxtSecondName(sName);
		String lName = fl.getCellData(SIGINEXCEL_PATH, "Sheet1", 1, 2);
		login.settxtLastName(lName);
		String email = fl.getCellData(SIGINEXCEL_PATH, "Sheet1", 1, 3);
		login.setTxtEmail(email);
		String phone1 = fl.getCellData(SIGINEXCEL_PATH, "Sheet1", 1, 4);
		login.setTxtNumber(phone1);
		String phone2 = fl.getCellData(SIGINEXCEL_PATH, "Sheet1", 1, 5);
		login.setTxtNumber2(phone2);
		String add1 = fl.getCellData(SIGINEXCEL_PATH, "Sheet1", 1, 6);
		login.setTxtadd1(add1);
		String add2 = fl.getCellData(SIGINEXCEL_PATH, "Sheet1", 1, 7);
		login.setTxtadd2(add2);
		commonLib.select(login.getCountry(), "India");
		Thread.sleep(2000);
		commonLib.select(login.getState(), "Karnataka");
		Thread.sleep(2000);
		commonLib.select(login.getCity(), "Bengaluru");
		Thread.sleep(2000);
		String zip = fl.getCellData(SIGINEXCEL_PATH, "Sheet1", 1, 11);
		login.setTxtZip(zip);
		String userN = fl.getCellData(SIGINEXCEL_PATH, "Sheet1", 1, 8);
		login.setTxtUserName(userN);
		String password = fl.getCellData(SIGINEXCEL_PATH, "Sheet1", 1, 9);
		login.setTxttxtPass1(password);
		String cpassword = fl.getCellData(SIGINEXCEL_PATH, "Sheet1", 1, 10);
		login.setTxttxtPass2(cpassword);
	}
}
