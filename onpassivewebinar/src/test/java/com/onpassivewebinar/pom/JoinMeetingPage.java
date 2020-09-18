package com.onpassivewebinar.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JoinMeetingPage {

	public JoinMeetingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='nav-link']")
	private WebElement joinEvent;
	public WebElement getJoinEvent() {
		return joinEvent;
	}
	
	public void setJoinEvent() {
		joinEvent.click();
	}
	//@FindBy(xpath="//*[@id=\"mat-tab-content-5-0\"]/div/app-op-event-lists/table/tbody/tr[3]/td[3]/div/div[1]/a")
	@FindBy(xpath="(//a[contains(text(),'Join')])")
	private WebElement joinButton;
	public WebElement getJoinButton() {
		return joinButton;
	}
	public void setJoinButton() {
		joinButton.click();
	}
	
}
