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

    private String MY_DASHBOARD_LABEL = "xpath=>//h1";
    private String LOGGED_IN_USER_CONTENT = "class=>hello";

    public String getAccountHolderDetails() {
        return getElement(LOGGED_IN_USER_CONTENT, "Get account holder name").getText();
    }

}
