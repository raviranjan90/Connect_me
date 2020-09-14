package com.onpassivewebinar.test;

import org.testng.annotations.Test;

import com.onpassivewebinar.pom.InvitationSummaryPage;
import com.onpassivewebinar.pom.InvitePeoplePage;
import com.onpassivewebinar.pom.LoginPage;
import com.onpassivewebinar.pom.ScheduleEventPage;
import com.onpassivewebinar.utilities.BaseClass;
import com.onpassivewebinar.utilities.CommonLibrary;
import com.onpassivewebinar.utilities.FileLibrary;

public class InvitationSummary extends BaseClass{
	
	@Test
	public void totalInvitedPeople() throws Exception {
		LoginPage login = new LoginPage(driver);
		ScheduleEventPage se = new ScheduleEventPage(driver);
		InvitePeoplePage invitepeople = new InvitePeoplePage(driver);
		InvitationSummaryPage invitationSummary = new InvitationSummaryPage(driver);
		FileLibrary fl = new FileLibrary();
		CommonLibrary cl = new CommonLibrary();
		login.setBtnLogin();
		Thread.sleep(3000);
		//Login Page
		String useremail = fl.getCellData(LOGINEXCEL_PATH, "Sheet1", 1, 0);
		login.setTextloginUserName(useremail);
		Thread.sleep(2000);
		String userpass = fl.getCellData(LOGINEXCEL_PATH, "Sheet1", 1, 1);
		login.setTextloginpassword(userpass);
		Thread.sleep(2000);
		login.setClickLogin();
		//creating event
		String event_Name = fl.getCellData(EVENT_PATH, "Sheet1", 2, 0);
		se.settxtEvent(event_Name);
		//se.settxtEvent("OnlineMeet9");
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
		String meetingPassword = fl.getCellData(PASSWORD_AGENDA_PATH, "Sheet1", 1, 0); 
		se.settypePassword(meetingPassword);
		//se.settypePassword("Onpassive90@");
		Thread.sleep(2000);
		String agenda = fl.getCellData(PASSWORD_AGENDA_PATH, "Sheet1", 1, 1);
		se.settypeAgenda(agenda);
		//se.settypeAgenda("Important online meeting for you all");
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
		// Invitation summary
		cl.scrollPage(invitationSummary.getSendInvitation());
		Thread.sleep(2000);
		invitationSummary.setSendInvitation();
		Thread.sleep(2000);

	}

}
