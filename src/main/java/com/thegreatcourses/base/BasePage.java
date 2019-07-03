package com.thegreatcourses.base;


import org.openqa.selenium.WebDriver;

public class BasePage {

    private static WebDriver driver;

    public static void setDriver(WebDriver theDriver) {
        driver = theDriver;
    }

    public static WebDriver getDriver() {
        return driver;
    }

}
