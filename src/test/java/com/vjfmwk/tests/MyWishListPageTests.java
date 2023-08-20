package com.vjfmwk.tests;

import com.vjfmwk.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class MyWishListPageTests {

    WebDriver driver;
    String baseURL;
    LandingPage landingPage;
    LoginPage loginPage;
    AccountOptionsPage accountOptionsPage;
    MyWishlistPage wishlistPage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        baseURL = "http://demo-store.seleniumacademy.com/";
        driver.get(baseURL);
        landingPage = new LandingPage(driver);
        landingPage.clickAccountLink();
        accountOptionsPage = new AccountOptionsPage(driver);
        accountOptionsPage.clickLogIn();
        loginPage = new LoginPage(driver);
        loginPage.signInWith("vijendra.aithal@gmail.com", "Abcd1234!");
        accountOptionsPage.clickAccount();
        wishlistPage = accountOptionsPage.clickMyWishlist();
    }

    @Test
    public void validatePageTitle() {
        String pageTitle = wishlistPage.getPageTitle();
        Assert.assertEquals(pageTitle.toLowerCase(), "My Wishlist".toLowerCase());
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
