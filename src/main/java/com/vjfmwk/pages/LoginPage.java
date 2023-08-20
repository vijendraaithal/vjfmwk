package com.vjfmwk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;
    private String EMAIL_INPUT = "email";
    private String PASSWORD_INPUT = "pass";
    private String LOGIN_BUTTON = "send";

    public LoginPage(WebDriver driver) {
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
}
