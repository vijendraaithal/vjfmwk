package com.vjfmwk.pages;

import com.vjfmwk.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountOptionsPage extends BasePage {

    public WebDriver driver;

    private final String LOGIN_LINK = "css=>[title='Log In']";
    private final String MY_WISH_LIST_LINK = "css=>[title='My Wishlist']";
    private final String ACCOUNT_LINK = "css=>[data-target-element='#header-account']";
    private final String LOGOUT_LINK = "css=>[title='Log Out']";
    public AccountOptionsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public LoginPage clickLogIn() {
        elementClick(LOGIN_LINK,"Clicking Login Button");
        return new LoginPage(driver);
    }

    public LandingPage clickLogOut() {
        elementClick(LOGOUT_LINK, "Clicking Logout Link");
        return new LandingPage(driver);
    }

    public MyWishlistPage clickMyWishlist() {
        elementClick(MY_WISH_LIST_LINK, "Click MyWishlist link");
        return new MyWishlistPage(driver);
    }

    public void clickAccount() {
        elementClick(ACCOUNT_LINK, "Clicking Account Link");
    }
}