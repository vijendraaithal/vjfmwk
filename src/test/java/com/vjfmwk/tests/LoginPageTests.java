package com.vjfmwk.tests;

import com.vjfmwk.base.BaseTest;
import com.vjfmwk.base.WebDriverFactory;
import com.vjfmwk.utilities.Util;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTest {
    WebDriver driver;
    String baseURL;

    @BeforeClass
    public void setUp() {
    }

    @Test
    public void validateBlankSubmit() {
        accountOptionsPage.clickAccount();
        accountOptionsPage.clickLogOut();
        accountOptionsPage.clickAccount();
        accountOptionsPage.clickLogIn();
        loginPage.blankSubmit();
        boolean result = loginPage.verifyValidationMessage();
        Assert.assertTrue(result, "Validation Message is NOT proper");
    }

    @AfterClass
    public void tearDown() {
    }
}
