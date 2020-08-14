package com.onpassivewebinar.test;

import org.testng.annotations.Test;

import com.onpassivewebinar.pom.LoginPage;
import com.onpassivewebinar.utilities.BaseClass;
import com.onpassivewebinar.utilities.CommonLibrary;
import com.onpassivewebinar.utilities.FileLibrary;

public class ValidLogin extends BaseClass{
	
	//private static final String LOGINEXCEL_PATH = null;

	@Test
	public void loginUser() throws Exception {
		LoginPage login = new LoginPage(driver);
		FileLibrary fl = new FileLibrary();
		CommonLibrary cl = new CommonLibrary();
		login.setBtnLogin();
		Thread.sleep(3000);
		//driver.findElement(login.getTextloginUserName().sendKeys("ravi"));
		
		String useremail = fl.getCellData(LOGINEXCEL_PATH, "Sheet1", 1, 0);
		login.setTextloginUserName(useremail);
		
		String userpass = fl.getCellData(LOGINEXCEL_PATH, "Sheet1", 1, 1);
		login.setTextloginpassword(userpass);
		
		login.setClickLogin();
		
	}
}
