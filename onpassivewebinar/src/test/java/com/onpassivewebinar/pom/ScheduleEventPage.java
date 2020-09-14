package com.onpassivewebinar.pom;
/*
 * 
 * @author ravi
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onpassivewebinar.test.CreateSchedule;

public class ScheduleEventPage {

	public ScheduleEventPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// type event
	@FindBy(xpath="//input[@id='event-name']")
	private WebElement txtEvent;
	public WebElement gettxtEvent() {
		return txtEvent;
	}
	public void settxtEvent(String eventName) {
		txtEvent.sendKeys(eventName);
	}

	// select time schedule(Default)
	@FindBy(xpath="//div[contains(text(),'Time Schedule')]")
	private WebElement txtTimeSchedule;
	public WebElement gettxtTimeSchedule() {
		return txtTimeSchedule;
	}
	public void settxtTimeSchedule() {
		txtTimeSchedule.click();
	}
	// select permanent meeting
	@FindBy(xpath="//div[text()='Permanent']")
	private WebElement txtPermanent;
	public WebElement getPermanentMeeting() {
		return txtPermanent;
	}
	public void setpermanentmeeting() {
		txtPermanent.click();
	}

	// click date time
	@FindBy(xpath="//input[@id='mat-input-2']")
	private WebElement clickDateTime;
	public WebElement getDateTime() {
		return clickDateTime;
	}
	public void setDateTime() {
		clickDateTime.click();
	}

	// click next month arrow
	@FindBy(xpath="(//button[@class='btn btn-link ngb-dp-arrow-btn'])[2]")
	private WebElement clickNextMonth;
	public WebElement getNextMonth() {
		return clickNextMonth;
	}
	public void setNextMonth() {
		clickNextMonth.click();
	}
	// click back month arrow 
	@FindBy(xpath="(//button[@class='btn btn-link ngb-dp-arrow-btn'])[1]")
	private WebElement clickBackMonth;
	public WebElement getPreviousMonth() {
		return clickBackMonth;
	}
	public void setPrevious() {
		clickBackMonth.click();
	}
	//select month day(select day)
	@FindBy(xpath="(//div[@class='btn-light ng-star-inserted'])[11]")
	private WebElement selectMonthDay;
	public WebElement getMonthDay() {
		return selectMonthDay;
	}
	public void setMonthDay() {
		selectMonthDay.click();
	}
	// hour select
	@FindBy(xpath="(//span[@class='chevron ngb-tp-chevron'])[1]")
	private WebElement startHourArrowUp;
	public WebElement getHourup() {
		return startHourArrowUp;
	}
	public void setHourup() {
		startHourArrowUp.click();
	}
	@FindBy(xpath="(//span[@class='chevron ngb-tp-chevron bottom'])[1]")
	private WebElement startHourArrowDown;
	public WebElement getHourdown() {
		return startHourArrowDown;
	}
	public void setHourdown() {
		startHourArrowDown.click();
	}
	//minutes select
	@FindBy(xpath="(//span[@class='chevron ngb-tp-chevron'])[2]")
	private WebElement startMinuteArrowUp;
	public WebElement getMinuteup() {
		return startMinuteArrowUp;
	}
	public void setMinuteup() {
		startMinuteArrowUp.click();
	}
	@FindBy(xpath="(//span[@class='chevron ngb-tp-chevron bottom'])[2]")
	private WebElement startMinuteArrowDown;
	public WebElement getMinutedown() {
		return startMinuteArrowDown;
	}
	public void setMinutedown() {
		startMinuteArrowDown.click();
	}
	// Duration hour
	@FindBy(xpath="(//span[@class='chevron ngb-tp-chevron'])[3]")
	private WebElement startDurationHourArrowUp;
	public WebElement getDurationHourup() {
		return startDurationHourArrowUp;
	}
	public void setDurationHourup() {
		startDurationHourArrowUp.click();
	}
	@FindBy(xpath="(//span[@class='chevron ngb-tp-chevron bottom'])[3]")
	private WebElement startDurationHourArrowDown;
	public WebElement getDurationHourdown() {
		return startDurationHourArrowDown;
	}
	public void setDurationHourdown() {
		startDurationHourArrowDown.click();
	}
	// Duration minute
	@FindBy(xpath="(//span[@class='chevron ngb-tp-chevron'])[4]")
	private WebElement startDurationMinuteArrowUp;
	public WebElement getDurationMinuteup() {
		return startDurationMinuteArrowUp;
	}
	public void setDurationMinuteup() {
		startDurationMinuteArrowUp.click();
	}
	@FindBy(xpath="(//span[@class='chevron ngb-tp-chevron bottom'])[4]")
	private WebElement startDurationMinuteArrowDown;
	public WebElement getDurationMinutedown() {
		return startDurationMinuteArrowDown;
	}
	public void setDurationMinutedown() {
		startDurationMinuteArrowDown.click();
	}
	// click "set date and time button"
	@FindBy(xpath="//button[text()=' Set date and time ']")
	private WebElement clickSetDateAndTime;
	public WebElement getDateAndTimeButton() {
		return clickSetDateAndTime;
	}
	public void setDateAndTimeButton() {
		clickSetDateAndTime.click();
	}
	//Select Time Zone
	@FindBy(xpath="//input[@id='mat-input-3']")
	private WebElement clickTimeZone;
	public WebElement getTimeZone() {
		return clickTimeZone;
	}
	public void setTimeZone() {
		clickTimeZone.click();
	}
	//select Password
	@FindBy(xpath="//div[contains(text(),'Password')]")
	private WebElement selectPassword;
	public WebElement getpasswordselect() {
		return selectPassword;
	}
	public void setpasswordselect() {
		selectPassword.click();
	}
	// type password
	@FindBy(xpath="//input[@id='password']")
	private WebElement typePassword;
	public WebElement gettypePassword() {
		return typePassword;
	}
	public void settypePassword(String password) {
		typePassword.sendKeys(password);;
	}

	// Type Agenda
	@FindBy(xpath="//textarea[@id='comments']")
	private WebElement typeAgenda;
	public WebElement gettypeAgenda() {
		return typeAgenda;
	}
	public void settypeAgenda(String agenda) {
		typeAgenda.sendKeys(agenda);
	}
	//cancel Button
	@FindBy(xpath="//span[contains(text(),'Cancel')]")
	private WebElement cancelButton;
	public WebElement getClickcCancel() {
		return cancelButton;
	}
	public void setClickCancel() {
		cancelButton.click();
	}
	//create and invite Button
	@FindBy(xpath="//span[contains(text(),'Create and invite')]")
	private WebElement createAndInviteButton;
	public WebElement getClickCreateButton() {
		return createAndInviteButton;
	}
	public void setClickCreateButton() {
		createAndInviteButton.click();
	}

}
