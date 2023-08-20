package com.vjfmwk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountOptionsPage {

    public WebDriver driver;

    private String LOGIN_LINK = "[title='Log In']";
    public AccountOptionsPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickLogIn() {
        driver.findElement(By.cssSelector(LOGIN_LINK)).click();
        return new LoginPage(driver);
    }
}
