package com.onpassiveChatandFileShare.test;

import org.testng.annotations.Test;

import com.onpassivewebinar.pom.AudioConferencePage;
import com.onpassivewebinar.pom.ChatAndFileSharePage;
import com.onpassivewebinar.pom.LoginPage;
import com.onpassivewebinar.pom.ScheduleEventPage;
import com.onpassivewebinar.utilities.BaseClass;
import com.onpassivewebinar.utilities.CommonLibrary;
import com.onpassivewebinar.utilities.FileLibrary;

public class CreateChatandFileShare extends BaseClass{
	
	@Test
	public void createEvent() throws Exception {
		LoginPage login = new LoginPage(driver);
		ScheduleEventPage se = new ScheduleEventPage(driver);
		FileLibrary fl = new FileLibrary();
		CommonLibrary cl = new CommonLibrary();
		ChatAndFileSharePage chatandfile = new ChatAndFileSharePage(driver);
		
		chatandfile.setFeatures();
		Thread.sleep(2000);
		chatandfile.setChatAndFileShare();
		Thread.sleep(2000);
		
		cl.scrollPage(chatandfile.getFacebooktab());
		chatandfile.setCreateRoom();
		Thread.sleep(2000);
		String userName = fl.getCellData(LOGINEXCEL_PATH, "Sheet1", 1, 0);
		login.setTextloginUserName(userName);
		Thread.sleep(2000);
		String password = fl.getCellData(LOGINEXCEL_PATH, "Sheet1", 1, 1);
		login.setTextloginpassword(password);
		Thread.sleep(2000);
		login.setClickLogin();
		//Create Event
		se.settxtEvent("Chat_Meeting1");
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
		se.settypeAgenda("Agenda for Chat meeting");
		Thread.sleep(2000);
		cl.scrollPage(se.getClickcCancel());
		Thread.sleep(2000);
		se.setClickCreateButton();
		Thread.sleep(2000);

		
		
	}

}
