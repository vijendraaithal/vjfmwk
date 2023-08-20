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
        driver.findElement(By.cssSelector("[data-target-element='#header-account']")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterClass
    public void tearDown() {

    }
}
