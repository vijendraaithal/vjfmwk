package com.vjfmwk.pages;

import com.vjfmwk.base.BasePage;
import com.vjfmwk.utilities.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public WebDriver driver;
    private String EMAIL_INPUT = "id=>email";
    private String PASSWORD_INPUT = "id=>pass";
    private String LOGIN_BUTTON = "name=>send";
    private String VAL_MSG_EMAIL = "id=>advice-required-entry-email";
    private String VAL_MSG_PASSWORD = "id=>advice-required-entry-pass";

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void enterEmail(String username) {
        sendData(EMAIL_INPUT, username, "Entering into Email", true);
    }

    public void enterPassword(String password) {
        sendData(PASSWORD_INPUT, password, "Enterign into Password", true);
    }

    public void clickLoginButton() {
        elementClick(LOGIN_BUTTON, "Clicking Login Button in Login Page");
    }

    public MyAccountPage signInWith(String username, String password) {
        enterEmail(username);
        enterPassword(password);
        clickLoginButton();
        return new MyAccountPage(driver);
    }

    public void blankSubmit() {
        clickLoginButton();
    }

    public boolean verifyValidationMessage() {
        boolean emailMessage = Util.verifyTextContains(getElement(VAL_MSG_EMAIL,"Validation Message Element").getText(),"This is a required field.");
        boolean passwordMessage = Util.verifyTextContains(getElement(VAL_MSG_PASSWORD,"Validation Message Element").getText(),"This is a required field.");
        return emailMessage && passwordMessage;
    }
}
