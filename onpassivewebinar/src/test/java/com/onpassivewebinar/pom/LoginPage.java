package com.onpassivewebinar.pom;
/*
 * 
 * @author ravi
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//li[@class='nav-item ng-star-inserted']//a[contains(text(),'Login')]")
	private WebElement btnLogin;
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	public void setBtnLogin() {
		btnLogin.click();
	}
	
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement textUserName;
	public WebElement getTextloginUserName() {
		return textUserName;
	}
	public void setTextloginUserName(String username) {
		textUserName.sendKeys(username);
	}
	
	@FindBy(xpath="//div[@class='input-group mb-3']//input[@type='password']")
	private WebElement textpassword;
	public WebElement getTextloginpassword() {
		return textpassword;
	}
	public void setTextloginpassword(String loginpassword) {
		textpassword.sendKeys(loginpassword);
	}
	
	@FindBy(xpath="//button[@class='btn btn-primary op-log-in-button']")
	private WebElement loginButton;
	public WebElement getClickLogin() {
		return loginButton;
	}
	public void setClickLogin() {
		loginButton.click();
	}

}
