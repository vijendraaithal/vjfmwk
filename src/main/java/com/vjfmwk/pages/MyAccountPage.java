package com.vjfmwk.pages;

import com.vjfmwk.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage extends BasePage {
    public WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    private String MY_DASHBOARD_LABEL = "//h1"; //xpath
    private String LOGGED_IN_USER_CONTENT = "hello"; // className

    public String getAccountHolerDetails() {
        return driver.findElement(By.className(LOGGED_IN_USER_CONTENT)).getText();
    }

}
