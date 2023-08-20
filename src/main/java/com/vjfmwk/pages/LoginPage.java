package com.vjfmwk.pages;

import com.vjfmwk.base.BasePage;
import com.vjfmwk.utilities.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public WebDriver driver;
    private String EMAIL_INPUT = "email";
    private String PASSWORD_INPUT = "pass";
    private String LOGIN_BUTTON = "send";
    private String VAL_MSG_EMAIL = "advice-required-entry-email";
    private String VAL_MSG_PASSWORD = "advice-required-entry-pass";

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void enterEmail(String username) {
        driver.findElement(By.id(EMAIL_INPUT)).clear();
        driver.findElement(By.id(EMAIL_INPUT)).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(By.id(PASSWORD_INPUT)).clear();
        driver.findElement(By.id(PASSWORD_INPUT)).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(By.name(LOGIN_BUTTON)).click();
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
        boolean emailMessage = Util.verifyTextContains(driver.findElement(By.id(VAL_MSG_EMAIL)).getText(),"This is a required field.");
        boolean passwordMessage = Util.verifyTextContains(driver.findElement(By.id(VAL_MSG_PASSWORD)).getText(),"This is a required field.");
        return emailMessage && passwordMessage;
    }
}
