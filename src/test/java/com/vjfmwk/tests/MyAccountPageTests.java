package com.vjfmwk.tests;

import com.vjfmwk.pages.*;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class MyAccountPageTests {
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
    public void validateSuccessfulLogin() {
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickAccountLink();
        AccountOptionsPage accountOptionsPage = new AccountOptionsPage(driver);
        LoginPage loginPage = accountOptionsPage.clickLogIn();
        MyAccountPage myAccountPage = loginPage.signInWith("vijendra.aithal@gmail.com", "Abcd1234!");
        String accountHolder = myAccountPage.getAccountHolerDetails();
        MatcherAssert.assertThat("", accountHolder.equalsIgnoreCase("Hello, Vijendra Aithal!"));
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
