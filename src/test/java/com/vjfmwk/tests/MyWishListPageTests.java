package com.vjfmwk.tests;

import com.vjfmwk.base.BaseTest;
import com.vjfmwk.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class MyWishListPageTests extends BaseTest {

    WebDriver driver;
    String baseURL;
    MyWishlistPage wishlistPage;

    @BeforeClass
    public void setUp() {
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
    }
}
