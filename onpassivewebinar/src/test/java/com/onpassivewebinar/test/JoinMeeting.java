package com.onpassivewebinar.test;

import org.testng.annotations.Test;

import com.onpassivewebinar.pom.InvitationSummaryPage;
import com.onpassivewebinar.pom.InvitePeoplePage;
import com.onpassivewebinar.pom.JoinMeetingPage;
import com.onpassivewebinar.pom.LoginPage;
import com.onpassivewebinar.pom.ScheduleEventPage;
import com.onpassivewebinar.utilities.BaseClass;
import com.onpassivewebinar.utilities.CommonLibrary;
import com.onpassivewebinar.utilities.FileLibrary;

public class JoinMeeting extends BaseClass{

	@Test
	public void jointheMeeting() throws Exception {
		LoginPage login = new LoginPage(driver);
		ScheduleEventPage se = new ScheduleEventPage(driver);
		InvitePeoplePage invitepeople = new InvitePeoplePage(driver);
		InvitationSummaryPage invitationSummary = new InvitationSummaryPage(driver);
		JoinMeetingPage joinMeeting = new JoinMeetingPage(driver);
		FileLibrary fl = new FileLibrary();
		CommonLibrary cl = new CommonLibrary();
		login.setBtnLogin();
		Thread.sleep(3000);
		//Login Page
		//String useremail = fl.getCellData(LOGINEXCEL_PATH, "Sheet1", 1, 0);
		login.setTextloginUserName("saikat@mail.com");
		Thread.sleep(2000);
		//String userpass = fl.getCellData(LOGINEXCEL_PATH, "Sheet1", 1, 1);
		login.setTextloginpassword("test123");
		Thread.sleep(2000);
		login.setClickLogin();
		Thread.sleep(2000);
		//my events page
		cl.explicit_Wait(joinMeeting.getJoinEvent());
		cl.javaScriptClick(joinMeeting.getJoinEvent());
		//joinMeeting.setJoinEvent();
		//String eventName = "LetsMeetOnline11";
		Thread.sleep(2000);
		cl.explicit_Wait(joinMeeting.getJoinButton());
		cl.scrollPage(joinMeeting.getJoinButton());
		Thread.sleep(2000);
		cl.javaScriptClick(joinMeeting.getJoinButton());
		Thread.sleep(2000);

	}

}
