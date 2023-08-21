package com.vjfmwk.tests;

import com.vjfmwk.base.BaseTest;
import com.vjfmwk.pages.*;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class MyAccountPageTests extends BaseTest {
    WebDriver driver;
    String baseURL;

    @BeforeClass
    public void setUp() {
    }

    @Test
    public void verifyPageTitle() {
        Assert.assertTrue(myAccountPage.verifyTitle("My Account"));
    }

    @Test
    public void validateSuccessfulLogin() {
        String accountHolder = myAccountPage.getAccountHolderDetails();
        MatcherAssert.assertThat("", accountHolder.equalsIgnoreCase("Hello, Vijendra Aithal!"));
    }

    @AfterClass
    public void tearDown() {
    }
}
