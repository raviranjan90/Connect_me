package com.onpassivewebinar.test;
/*
 * 
 * @author ravi
 */
import org.testng.annotations.Test;


import com.onpassivewebinar.pom.LoginPage;
import com.onpassivewebinar.pom.ScheduleEventPage;
import com.onpassivewebinar.utilities.BaseClass;
import com.onpassivewebinar.utilities.CommonLibrary;
import com.onpassivewebinar.utilities.FileLibrary;

public class ValidLogin extends BaseClass{

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
		Thread.sleep(2000);
		String userpass = fl.getCellData(LOGINEXCEL_PATH, "Sheet1", 1, 1);
		login.setTextloginpassword(userpass);
		Thread.sleep(2000);
		login.setClickLogin();
		
		//return new ScheduleEventPage(driver);

	}
}
