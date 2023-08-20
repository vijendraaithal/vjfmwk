package com.vjfmwk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyWishlistPage {
    public WebDriver driver;

    private String PAGE_HEADER_TAG = "h1";

    public MyWishlistPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        String pageTitle = driver.findElement(By.tagName(PAGE_HEADER_TAG)).getText();
        return pageTitle;
    }

    public String getEmptyWishListText() {
        String actualText = driver.findElement(By.className("wishlist-empty")).getText();
        return actualText;
    }

}
