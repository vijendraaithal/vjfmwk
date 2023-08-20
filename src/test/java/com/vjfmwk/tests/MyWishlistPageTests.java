package com.vjfmwk.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class MyWishlistPageTests {
    WebDriver driver;
    String baseURL;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        baseURL = "http://demo-store.seleniumacademy.com/";
        driver.get(baseURL);
    }

    @Test
    public void testMethod() {
        landingPage.clickAccount();
        accountOptionsPage.clickLogIn();
        loginPage.signInWith("vijendra.aithal@gmail.com", "Abcd1234!");
        myAccountPage.verifyAccountHolerDetails();
        accountOptionsPage.clickMyWishlist();
        myWishlistPage.verifyItemsWishlistedCount();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
