package com.onpassiveAudioConference.test;

import org.testng.annotations.Test;

import com.onpassivewebinar.pom.AudioConferencePage;
import com.onpassivewebinar.pom.InvitePeoplePage;
import com.onpassivewebinar.pom.LoginPage;
import com.onpassivewebinar.pom.ScheduleEventPage;
import com.onpassivewebinar.utilities.BaseClass;
import com.onpassivewebinar.utilities.CommonLibrary;
import com.onpassivewebinar.utilities.FileLibrary;

public class InvitePeopleAudio extends BaseClass{
	
	@Test
	public void invitepeopleAudio() throws Exception {
		LoginPage login = new LoginPage(driver);
		ScheduleEventPage se = new ScheduleEventPage(driver);
		InvitePeoplePage invitepeople = new InvitePeoplePage(driver);
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
		//Create Event
		se.settxtEvent("Audio_Meet");
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
		//Set Time Zone

		se.setpasswordselect();
		se.settypePassword("Onpassive90@");
		Thread.sleep(2000);
		se.settypeAgenda("Agenda for audio meet");
		Thread.sleep(2000);
		cl.scrollPage(se.getClickcCancel());
		Thread.sleep(2000);
		se.setClickCreateButton();
		Thread.sleep(2000);

		//invite people
		cl.scrollPage(invitepeople.getParticipantsText());
		invitepeople.setParticipantsButton();;
		cl.scrollPage(invitepeople.getFacebookIcon());
		invitepeople.setcopyAndPaste();
		//invitepeople.setInputEmailId("ravii.ranjan49@gmail.com");
		String attendee1 = fl.getCellData(PARTICIPANTS_PRESENTERS_PATH,"Sheet1", 1, 0);
		invitepeople.setInputEmailId(attendee1);
		invitepeople.setClickOutside();
		String attendee2 = fl.getCellData(PARTICIPANTS_PRESENTERS_PATH,"Sheet1", 2, 0);
		invitepeople.setInputEmailId(attendee2);
		//invitepeople.setInputEmailId("saikat@mail.com");
		invitepeople.setClickOutside();
		Thread.sleep(2000);
		invitepeople.setCheckbox();
		Thread.sleep(2000);
		invitepeople.setFinishContactButton();
		Thread.sleep(2000);



	}
}
