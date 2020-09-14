package com.onpassivewebinar.pom;
/*
 * 
 * @author ravi
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	
	public SignupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//li[@class='nav-item']//a[contains(text(),'Sign Up')]")
	private WebElement btnLogin;

	public WebElement getBtnSignUp() {
		return btnLogin;
	}
	public void setBtnSignUp() {
		btnLogin.click();
	}


	@FindBy(xpath="(//div[@class='col-md-6']//input[@type='text'])[1]")
	private WebElement txtFirstName;
	public WebElement gettxtFirstName() {
		return txtFirstName;
	}
	public void settxtFirstName(String name) {
		txtFirstName.sendKeys(name);
	}
	

	@FindBy(xpath="(//div[@class='col-md-6']//input[@type='text'])[2]")
	private WebElement txtSecondName;
	public WebElement gettxtSecondName() {
		return txtSecondName;
	}
	public void settxtSecondName(String sName) {
		txtSecondName.sendKeys(sName);
	}

	@FindBy(xpath="(//div[@class='col-md-6']//input[@type='text'])[3]")
	private WebElement txtLastName;
	public WebElement gettxtlastName() {
		return txtLastName;
	}
	public void settxtLastName(String lName) {
		txtLastName.sendKeys(lName);
	}
	
	@FindBy(xpath="//div[@class='col-md-6']//input[@type='email']")
	private WebElement txtEmail;
	public WebElement getTxtEmail() {
		return txtEmail;
	}
	public void setTxtEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	@FindBy(xpath="(//div[@class='col-md-6']//input[@type='number'])[1]")
	private WebElement txtNumber;
	public WebElement getTxtNumber() {
		return txtNumber;
	}
	public void setTxtNumber(String phonnumber) {
		txtNumber.sendKeys(phonnumber);
	}
	@FindBy(xpath="(//div[@class='col-md-6']//input[@type='number'])[2]")
	private WebElement txtNumber2;
	public WebElement getTxtNumber2() {
		return txtNumber2;
	}
	public void setTxtNumber2(String phonnumber2) {
		txtNumber2.sendKeys(phonnumber2);
	}
	
	@FindBy(xpath="(//div[@class='col-md-6']//input[@type='text'])[4]")
	private WebElement txtAdd1;
	public WebElement getTxtadd1() {
		return txtAdd1;
	}
	public void setTxtadd1(String add1) {
		txtAdd1.sendKeys(add1);
	}
	@FindBy(xpath="(//div[@class='col-md-6']//input[@type='text'])[5]")
	private WebElement txtAdd2;
	public WebElement getTxtadd2() {
		return txtAdd2;
	}
	public void setTxtadd2(String add2) {
		txtAdd2.sendKeys(add2);
	}
	
	@FindBy(xpath="(//div[@class='col-md-6']//select)[1]")
	private WebElement selectCountry;
	public WebElement getCountry() {
		return selectCountry;
	}
	public void setCountry() {
		selectCountry.click();
	}
	@FindBy(xpath="(//div[@class='col-md-6']//select)[2]")
	private WebElement selectState;
	public WebElement getState() {
		return selectState;
	}
	public void setState() {
		selectState.click();
	}
	
	@FindBy(xpath="(//div[@class='col-md-6']//select)[3]")
	private WebElement selectCity;
	public WebElement getCity() {
		return selectCity;
	}
	public void setCity() {
		selectCity.click();
	}

	@FindBy(xpath="(//div[@class='col-md-6']//input[@type='text'])[6]")
	private WebElement txtZip;
	public WebElement getTxtZip() {
		return txtZip;
	}
	public void setTxtZip(String zip) {
		txtZip.sendKeys(zip);
	}
	@FindBy(xpath="//div[@class='row op-user-name']//input[@type='text']")
	private WebElement txtUserName;
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public void setTxtUserName(String userName) {
		txtUserName.sendKeys(userName);
	}
	
	@FindBy(xpath="(//div[@class='row op-user-name']//input[@type='password'])[1]")
	private WebElement txtPass1;
	public WebElement getTxtPass1() {
		return txtPass1;
	}
	
	public void setTxttxtPass1(String pass1) {
		txtPass1.sendKeys(pass1);
	}
	@FindBy(xpath="(//div[@class='row op-user-name']//input[@type='password'])[2]")
	private WebElement txtPass2;
	public WebElement getTxtPass2() {
		return txtPass2;
	}
	
	public void setTxttxtPass2(String pass2) {
		txtPass2.sendKeys(pass2);
	}
	

}
