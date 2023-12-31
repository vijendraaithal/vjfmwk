package com.vjfmwk.pages;

import com.vjfmwk.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage extends BasePage {

    public WebDriver driver;
    private String ACCOUNT_LINK = "css=>[data-target-element='#header-account']";

    public LandingPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickAccountLink() {
        elementClick(ACCOUNT_LINK, "Clicking Account Link");
    }

}
