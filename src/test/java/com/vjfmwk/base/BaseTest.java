package com.vjfmwk.base;

import com.vjfmwk.pages.AccountOptionsPage;
import com.vjfmwk.pages.LandingPage;
import com.vjfmwk.pages.LoginPage;
import com.vjfmwk.pages.MyAccountPage;
import com.vjfmwk.tests.MyAccountPageTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    protected String baseURL;
    protected LandingPage landingPage;
    protected LoginPage loginPage;
    protected AccountOptionsPage accountOptionsPage;
    protected MyAccountPage myAccountPage;
    @BeforeClass
    public void commonSetUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        baseURL = "http://demo-store.seleniumacademy.com/";
        driver.get(baseURL);
        landingPage = new LandingPage(driver);
        landingPage.clickAccountLink();
        accountOptionsPage = new AccountOptionsPage(driver);
        loginPage = accountOptionsPage.clickLogIn();
        myAccountPage = loginPage.signInWith("vijendra.aithal@gmail.com", "Abcd1234!");
    }

    @AfterClass
    public void commonTearDown() {
        driver.quit();
    }
}
