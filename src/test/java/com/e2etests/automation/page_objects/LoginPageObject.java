package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class LoginPageObject {
	public  ConfigFileReader configFileReader ; 
	

	// recherche des elements
	@FindBy(how = How.ID, using = "user-name")
	public static WebElement username;

	@FindBy(how = How.ID, using = "password")
	public static WebElement Password;
	
	@FindBy(how = How.ID, using = "login-button")
	public static WebElement login;
	
	@FindBy(how = How.XPATH, using = "//span[@class='title']")
	public static WebElement title;
	
	@FindBy(how = How.XPATH, using = "//div[@id='login_button_container']//form//h3")
	public static WebElement messageErreur;
	// Methodes 
	public LoginPageObject () {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader=new ConfigFileReader();
	}
	
	public void connectToApp() {
		Setup.getDriver().get(configFileReader.getProperties("url"));
	}
	
	public void saisieUserName(String usr) {
		username.sendKeys(usr);
	}
	public void saisiePassword(String pwd) {
		Password.sendKeys(pwd);
	}
		
		public void clickBtn() {
			login.click();
		}
		
	public void fillUsername() {
	username.sendKeys(configFileReader.getProperties("username"));
	
}
	public void fillPassword() {
		Password.sendKeys(configFileReader.getProperties("password"));
	}
}