package com.onpassiveAudioConference.test;

import org.testng.annotations.Test;

import com.onpassivewebinar.pom.AudioConferencePage;
import com.onpassivewebinar.pom.InvitationSummaryPage;
import com.onpassivewebinar.pom.InvitePeoplePage;
import com.onpassivewebinar.pom.JoinMeetingPage;
import com.onpassivewebinar.pom.LoginPage;
import com.onpassivewebinar.pom.ScheduleEventPage;
import com.onpassivewebinar.utilities.BaseClass;
import com.onpassivewebinar.utilities.CommonLibrary;
import com.onpassivewebinar.utilities.FileLibrary;

public class JoinMeetingAudio extends BaseClass{

	@Test
	public void joinMeeting() throws Exception {
		
		LoginPage login = new LoginPage(driver);
		ScheduleEventPage se = new ScheduleEventPage(driver);
		InvitePeoplePage invitepeople = new InvitePeoplePage(driver);
		InvitationSummaryPage invitationSummary = new InvitationSummaryPage(driver);
		JoinMeetingPage joinMeeting = new JoinMeetingPage(driver);
		FileLibrary fl = new FileLibrary();
		CommonLibrary cl = new CommonLibrary();
		AudioConferencePage acf = new AudioConferencePage(driver);
		acf.setFeatures();
		Thread.sleep(2000);
		acf.setAudioConference();
		Thread.sleep(2000);
		cl.scrollPage(acf.getFacebooktab());
		acf.setCreateRoom();
		Thread.sleep(2000);
		String userName = fl.getCellData(LOGINEXCEL_PATH, "Sheet1", 1, 0);
		login.setTextloginUserName(userName);
		Thread.sleep(2000);
		String password = fl.getCellData(LOGINEXCEL_PATH, "Sheet1", 1, 1);
		login.setTextloginpassword(password);
		Thread.sleep(2000);
		login.setClickLogin();
		
		//my events page
		cl.explicit_Wait(joinMeeting.getJoinEvent());
		
		cl.javaScriptClick(joinMeeting.getJoinEvent());
		//joinMeeting.setJoinEvent();
		//String eventName = "LetsMeetOnline11";
		Thread.sleep(2000);
		
		cl.scrollPage(joinMeeting.getJoinButton());
		Thread.sleep(2000);
		cl.javaScriptClick(joinMeeting.getJoinButton());
		Thread.sleep(2000);

	}
}
