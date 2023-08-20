package com.vjfmwk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

    public WebDriver driver;
    private String ACCOUNT_LINK = "[data-target-element='#header-account']";

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAccountLink() {
        driver.findElement(By.cssSelector(ACCOUNT_LINK)).click();
    }

}
