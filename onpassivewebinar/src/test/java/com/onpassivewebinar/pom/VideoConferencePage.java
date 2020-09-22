package com.onpassivewebinar.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VideoConferencePage {

	public VideoConferencePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[contains(text(),'Video Conference')]")
	private WebElement audioConferenceOption;
	public WebElement getAudioConference() {
		return audioConferenceOption;
	}
	public void setAudioConference() {
		audioConferenceOption.click();
	}

	@FindBy(xpath="(//span[@class='mat-button-wrapper'])[1]")
	private WebElement createRoomButton;
	public WebElement getCreateRoom() {
		return createRoomButton;
	}
	public void setCreateRoom() {
		createRoomButton.click();
	}

	@FindBy(xpath="(//span[@class='mat-button-wrapper'])[2]")
	private WebElement joinRoomButton;
	public WebElement getJoinRoom() {
		return joinRoomButton;
	}
	public void setJoinRoom() {
		joinRoomButton.click();
	}
	
}
