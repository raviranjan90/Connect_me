package com.onpassivewebinar.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScheduleEvent {
	
	public void ScheduleEvent(WebDriver driver) {
		PageFactory .initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='event-name']")
	private WebElement typeEventName;
	public WebElement getEventName() {
		return typeEventName;
	}
	
	public void setEventname(String event) {
		typeEventName.sendKeys(event);
	}
	
	@FindBy(xpath="//div[@class='mat-form-field-infix ng-tns-c83-8']//input[@id='mat-input-2']")
	private WebElement dateTime;
	public WebElement getdatetime() {
		return dateTime;
	}
	
	public void setdatetime(String time) {
		dateTime.sendKeys(time);
	}
}
