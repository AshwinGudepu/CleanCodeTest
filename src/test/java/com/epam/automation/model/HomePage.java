package com.epam.automation.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage {

	@FindBy(xpath = "//button[@aria-label='Switch account context']/span")
	private WebElement linkLoggedInUser;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public String getLoggedInUserName() {
		return linkLoggedInUser.getText();
	}

	public Integer hasUserLoggedIn() {
		if (linkLoggedInUser.getText() != "") {
			return 1;
		} else {
			return -1;
		}
	}
}
