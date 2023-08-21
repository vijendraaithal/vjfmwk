package com.vjfmwk.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomDriver {
    public WebDriver driver;
    public JavascriptExecutor jse;

    public CustomDriver(WebDriver driver) {
        this.driver = driver;
        jse = (JavascriptExecutor) driver;
    }

    public void refresh() {
        driver.navigate().refresh();
        System.out.println("The current browser location was refreshed");
    }

    public String getTitle() {
        String pageTitle = driver.getTitle();
        System.out.println("Title of the page is " + pageTitle);
        return pageTitle;
    }

    public By getByType(String locator) {
        By by = null;
        String locatorType = locator.split("$")[0];
        String locatorValue = locatorType.split("$")[1];
        try {
            if (locatorType.contains("id")) {
                by = By.id(locatorValue);
            } else if (locatorType.contains("name")) {
                by = By.name(locatorValue);
            } else if (locatorType.contains("css")) {
                by = By.cssSelector(locatorValue);
            } else if (locatorType.contains("xpath")) {
                by = By.xpath(locatorValue);
            } else if (locatorType.contains("link")) {
                by = By.linkText(locatorValue);
            } else if (locatorType.contains("tag")) {
                by = By.tagName(locatorValue);
            } else if (locatorType.contains("partialLink")) {
                by = By.partialLinkText(locatorValue);
            } else if (locatorType.contains("class")) {
                by = By.className(locatorValue);
            } else {
                System.out.println("Locator Type not supported");
            }
        } catch (Exception e) {
            System.out.println("By type is not found with locator: " + locator);
        }
        return by;
    }

    public WebElement getElement(String locator, String info) {
        WebElement element = null;
        By byType = getByType(locator);
        try {
            element = driver.findElement(byType);
            System.out.println("Element " + info + " found with locator: " + locator);
        } catch (Exception e) {
            System.out.println("Element Not Found with locator: " + locator);
            e.printStackTrace();
        }
        return element;
    }
}