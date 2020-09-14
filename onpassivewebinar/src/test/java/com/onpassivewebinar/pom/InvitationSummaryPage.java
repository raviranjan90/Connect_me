package com.onpassivewebinar.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvitationSummaryPage {
	
	public InvitationSummaryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),' Send Invitation ')]")
	private WebElement sendInvitation;
	public WebElement getSendInvitation() {
		return sendInvitation;
	}
	public void setSendInvitation() {
		sendInvitation.click();
	}
	
}
