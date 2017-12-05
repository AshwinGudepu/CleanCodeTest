package com.epam.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.epam.automation.model.AbstractPage;

public class StartPage extends AbstractPage {

    @FindBy(xpath = "//a[text()='Sign in']")
    private WebElement signInButton;    
    
    public StartPage(WebDriver driver) {
    	super(driver);
    } 

    public SignInPage invokeSignIn() {
    	signInButton.click();
        return new SignInPage(driver);
    }
}
