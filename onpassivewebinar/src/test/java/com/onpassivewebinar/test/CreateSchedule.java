package com.onpassivewebinar.test;

import org.testng.annotations.Test;

import com.onpassivewebinar.pom.LoginPage;
import com.onpassivewebinar.pom.ScheduleEventPage;
import com.onpassivewebinar.utilities.BaseClass;
import com.onpassivewebinar.utilities.CommonLibrary;
import com.onpassivewebinar.utilities.FileLibrary;

/*
 * 
 * @author ravi
 */
public class CreateSchedule extends BaseClass{
	//create page
	@Test
	public void createEvent() throws Exception {
		LoginPage login = new LoginPage(driver);
		ScheduleEventPage se = new ScheduleEventPage(driver);
		FileLibrary fl = new FileLibrary();
		CommonLibrary cl = new CommonLibrary();
		login.setBtnLogin();
		Thread.sleep(3000);
		//driver.findElement(login.getTextloginUserName().sendKeys("ravi"));
		//Login Page
		String useremail = fl.getCellData(LOGINEXCEL_PATH, "Sheet1", 1, 0);
		login.setTextloginUserName(useremail);
		Thread.sleep(2000);
		String userpass = fl.getCellData(LOGINEXCEL_PATH, "Sheet1", 1, 1);
		login.setTextloginpassword(userpass);
		Thread.sleep(2000);
		login.setClickLogin();
		//creating event 
		se.settxtEvent("OnlineMeet3");
		Thread.sleep(2000);
		cl.scrollPage(se.gettxtTimeSchedule());
		Thread.sleep(2000);
		se.setDateTime();
		Thread.sleep(2000);
		se.setNextMonth();
		Thread.sleep(2000);
		se.setMonthDay();
		Thread.sleep(2000);
		se.setHourup();
		Thread.sleep(2000);
		se.setHourup();
		Thread.sleep(2000);
		se.setMinutedown();
		Thread.sleep(2000);
		se.setMinutedown();
		Thread.sleep(2000);
		se.setDurationHourdown();
		Thread.sleep(2000);
		se.setDurationMinutedown();
		Thread.sleep(2000);
		se.setDurationMinutedown();
		Thread.sleep(2000);
		se.setDateAndTimeButton();
		Thread.sleep(2000);
		//se.setTimeZone();
		
		se.setpasswordselect();
		se.settypePassword("Onpassive90@");
		Thread.sleep(2000);
		se.settypeAgenda("Important online meeting for you all");
		Thread.sleep(2000);
		cl.scrollPage(se.getClickcCancel());
		Thread.sleep(2000);
		se.setClickCreateButton();
		Thread.sleep(2000);
		
		
		
	}
}
