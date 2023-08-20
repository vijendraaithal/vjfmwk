package com.vjfmwk.tests;

import com.vjfmwk.base.BaseTest;
import com.vjfmwk.pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
    public void verifyPageTitle() {
        Assert.assertTrue(myAccountPage.verifyTitle("My Wishlist"));
    }

    @Test
    public void validatePageHeader() {
        String pageTitle = wishlistPage.getPageTitle();
        Assert.assertEquals(pageTitle.toLowerCase(), "My Wishlist".toLowerCase());
    }

    @Test
    public void validateEmptyWishlistInfoDisplay() {
        String emptyWishlistInfo = wishlistPage.getEmptyWishListText();
        Assert.assertEquals(emptyWishlistInfo.toLowerCase(), "you have no items in your wishlist.");
    }

    @AfterClass
    public void tearDown() {
    }
}
