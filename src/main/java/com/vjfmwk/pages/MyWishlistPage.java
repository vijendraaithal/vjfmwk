package com.vjfmwk.pages;

import com.vjfmwk.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyWishlistPage extends BasePage {
    public WebDriver driver;

    private String PAGE_HEADER_TAG = "tag=>h1";
    private String EMPTY_WISHLIST_TEXT = "class=>wishlist-empty";

    public MyWishlistPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public String getPageTitle() {
        String pageTitle = getElement(PAGE_HEADER_TAG,"Page Heading").getText();
        return pageTitle;
    }

    public String getEmptyWishListText() {
        String actualText = getElement(EMPTY_WISHLIST_TEXT, "Emply Wishlist Text").getText();
        return actualText;
    }

}