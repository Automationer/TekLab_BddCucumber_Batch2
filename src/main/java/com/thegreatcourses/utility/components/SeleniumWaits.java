package com.thegreatcourses.utility.components;

import com.thegreatcourses.utility.Browser;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static com.thegreatcourses.base.BasePage.getDriver;

public class SeleniumWaits {


    public void waitUntilClickable(WebElement element) {

        WebDriverWait wait = new WebDriverWait(Browser.driver(), 15);

        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    public void waitUntilVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Browser.driver(), 15);

        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public Alert waitUntilAlert() {

        WebDriverWait wait = new WebDriverWait(Browser.driver(), 15);

        return wait.until(ExpectedConditions.alertIsPresent());
    }

    public void waitUntilPresent(By by) {
        WebDriverWait wait = new WebDriverWait(Browser.driver(), 15);

        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void waitForIframeAndSwitchToIt(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Browser.driver(), 15);
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
    }

    public void waitUntilTextToBePresent(WebElement element, String expected) {
        WebDriverWait wait = new WebDriverWait(Browser.driver(), 15);
        wait.until(ExpectedConditions.textToBePresentInElement(element, expected));
    }

    public WebElement fluentlyWait(WebElement element) {

        Wait<WebDriver> wait = new FluentWait<>(Browser.driver())
                .withTimeout(30, TimeUnit.SECONDS) // set the timeout
                .pollingEvery(5, TimeUnit.SECONDS) // set the interval between every 2 tries
                .ignoring(NoSuchElementException.class); // don't throw this exception

        // Then wait for the specified element
        return wait.until(driver1 -> element);
    }

    public void waitForPageLoad(int time, TimeUnit timeUnit) {
        getDriver().manage().timeouts().pageLoadTimeout(time, timeUnit);
    }

    public void waitImplicitly(int time, TimeUnit timeUnit) {
        getDriver().manage().timeouts().implicitlyWait(time, timeUnit);
    }

    public static void waitForPageLoadComplete() {
        Wait<WebDriver> wait = new WebDriverWait(Browser.driver(), 30);
        wait.until(driver1 -> String
                .valueOf(((JavascriptExecutor) driver1)
                        .executeScript("return document.readyState")).equals("complete"));
    }

}
