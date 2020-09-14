package com.onpassivewebinar.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvitePeoplePage {

	public InvitePeoplePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//scroll to participants
	@FindBy(xpath="//span[text()='Participants']")
	private WebElement participantsText;
	public WebElement getParticipantsText() {
		return participantsText;
	}
	public void setParticipantsText() {
		participantsText.click();
	}
	// participants button
	@FindBy(xpath="//a[@id='home-tab']")
	private WebElement participantsButton;
	public WebElement getParticipantsButton() {
		return participantsButton;
	}
	public void setParticipantsButton() {
		participantsButton.click();
	}
	//scroll till facebook icon at bottom
	@FindBy(xpath="//i[@class='fa fa-facebook']")
	private WebElement facebookIcon;
	public WebElement getFacebookIcon() {
		return facebookIcon;
	}
	public void setFacebookIcon() {
		facebookIcon.click();
	}
	//click copy and Paste
	@FindBy(xpath="(//h6[text()='Copy and paste'])[1]")
	private WebElement copyAndPasteButton;
	public WebElement getcopyAndPaste() {
		return copyAndPasteButton;
	}
	public void setcopyAndPaste() {
		copyAndPasteButton.click();
	}
	//input email id
	@FindBy(xpath="//input[@id='mat-chip-list-input-0']")
	private WebElement inputEmailId;
	public WebElement getInputEmailId() {
		return inputEmailId;
	}
	public void setInputEmailId(String email) {
		inputEmailId.sendKeys(email);
	}
	//click outside
	@FindBy(xpath = "(//h1[text()='Enter your contacts'])[1]")
	private WebElement clickOutside;
	public WebElement getclickOutside() {
		return clickOutside;
	}
	public void setClickOutside() {
		clickOutside.click();
	}
	//click checkbox
	@FindBy(xpath="(//div[@class='mat-checkbox-inner-container'])[1]")
	private WebElement checkbox;
	public WebElement getCheckbox() {
		return checkbox;
	}
	public void setCheckbox() {
		checkbox.click();
	}
	// finish adding contacts
	@FindBy(xpath="//div[@class='text-center ng-star-inserted']//button[@type='button']")
	private WebElement finishAddingContactButton;
	public WebElement getFinishContactButton() {
		return finishAddingContactButton;
	}
	public void setFinishContactButton() {
		finishAddingContactButton.click();
	}
	
}
