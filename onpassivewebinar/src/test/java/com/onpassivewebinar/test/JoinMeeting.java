package com.onpassivewebinar.test;

import org.testng.annotations.Test;

import com.onpassivewebinar.pom.JoinMeetingPage;
import com.onpassivewebinar.pom.LoginPage;
import com.onpassivewebinar.utilities.BaseClass;
import com.onpassivewebinar.utilities.CommonLibrary;
import com.onpassivewebinar.utilities.FileLibrary;

public class JoinMeeting extends BaseClass{

	@Test
	public void jointheMeeting() throws Exception {
		LoginPage login = new LoginPage(driver);
		JoinMeetingPage joinMeeting = new JoinMeetingPage(driver);
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
		Thread.sleep(2000);
		//my events page
		//cl.javaScriptClick(joinMeeting.getJoinEvent());
		joinMeeting.setJoinEvent();
		//String eventName = "LetsMeetOnline11";
		Thread.sleep(2000);
		cl.scrollPage(joinMeeting.getJoinButton());
		Thread.sleep(2000);
		cl.javaScriptClick(joinMeeting.getJoinButton());
		Thread.sleep(2000);

	}

}
