package com.vjfmwk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountOptionsPage {

    public WebDriver driver;

    private String LOGIN_LINK = "[title='Log In']";
    private String MY_WISH_LIST_LINK = "[title='My Wishlist']";
    private String ACCOUNT_LINK = "[data-target-element='#header-account']";
    public AccountOptionsPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickLogIn() {
        driver.findElement(By.cssSelector(LOGIN_LINK)).click();
        return new LoginPage(driver);
    }

    public MyWishlistPage clickMyWishlist() {
        driver.findElement(By.cssSelector(MY_WISH_LIST_LINK)).click();
        return new MyWishlistPage(driver);
    }

    public void clickAccount() {
        driver.findElement(By.cssSelector(ACCOUNT_LINK)).click();
    }


}
