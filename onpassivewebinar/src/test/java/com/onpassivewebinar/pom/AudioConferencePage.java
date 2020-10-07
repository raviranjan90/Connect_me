package com.onpassivewebinar.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AudioConferencePage {

	public AudioConferencePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//li[@class='nav-item']//a[contains(text(),' Features ')]")
	private WebElement featuresTab;
	public WebElement getFeatures() {
		return featuresTab;
	}
	public void setFeatures() {
		featuresTab.click();
	}

	@FindBy(xpath="//button[contains(text(),'Audio Conference')]")
	private WebElement audioConferenceOption;
	public WebElement getAudioConference() {
		return audioConferenceOption;
	}
	public void setAudioConference() {
		audioConferenceOption.click();
	}
	@FindBy(xpath="//i[@class='fa fa-facebook']")
	private WebElement facebookTab;
	public WebElement getFacebooktab() {
		return facebookTab;
	}
	public void setfacebookTab() {
		facebookTab.click();
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
