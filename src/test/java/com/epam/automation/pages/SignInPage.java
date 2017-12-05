package com.epam.automation.pages;

import com.epam.automation.model.AbstractPage;
import com.epam.automation.model.HomePage;
import com.epam.automation.model.User;
import java.util.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends AbstractPage {

	@FindBy(id = "login_field")
	private WebElement loginField;

	@FindBy(id = "password")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@value='Sign in']")
	private WebElement buttonSubmit;

	public SignInPage(WebDriver driver) {
		super(driver);
	}

	public HomePage signIn(String username, String password) {
		loginField.sendKeys(username);
		passwordField.sendKeys(password);
		buttonSubmit.click();
		return new HomePage(driver);
	}

	public boolean isReadyToSignIn() {
		try {
			buttonSubmit.isDisplayed();
			return true;
		} catch (NoSuchElementException nse) {
			return false;
		}
	}

	public HomePage signIn(User user) {
		return this.signIn(user.getUsername(), user.getPassword());
	}
}
