package com.thegreatcourses.utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

import static com.thegreatcourses.base.BasePage.getDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class Commons {

    public void waitAbit(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public void waitAbit() {
        try {
            Thread.sleep(1500);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public WebElement waitUntilClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 15);
        WebElement waitElement = null;
        for (int i = 0; i < 2; i++) {
            waitElement = wait.until(ExpectedConditions.elementToBeClickable(element));
            waitAbit(1);
        }
        return waitElement;
    }

    public void click(WebElement clickable) {
        clickable.click();
        waitForPageLoadComplete();
    }

    public void enter(WebElement text_box, String input) {
        text_box.sendKeys(input);
    }

    public void login(WebElement username, WebElement password, Keys submit, String... credentials) { // varArgs
        username.sendKeys(credentials[0]);
        password.sendKeys(credentials[1], submit);
        waitForPageLoadComplete();
    }

    private static void waitForPageLoadComplete() {
        Wait<WebDriver> wait = new WebDriverWait(Browser.driver(), 30);
        wait.until(driver1 -> String
                .valueOf(((JavascriptExecutor) driver1)
                        .executeScript("return document.readyState")).equals("complete"));
    }

    public void verifyWithTitle(String expected) {
        String actual = getDriver().getTitle();
        assertThat(actual).isEqualTo(expected);
    }


    public void verifyHeader(String expected, WebElement header) {
        assertThat(expected).isEqualTo(header.getText());
    }

    public void verifyText(String expected, String actual) {
        assertThat(expected).isEqualTo(actual);
    }

    public WebElement findBy(By by) {
        return getDriver().findElement(by);
    }

    public void switchToNewTab(String originalTab) {
        Object[] handles = getDriver().getWindowHandles().toArray();
        for (int i = 0; i < handles.length; i++) {
            if (!handles[i].equals(originalTab)) {
                getDriver().switchTo().window(handles[i].toString());
            }
        }
    }

    public void captureScreenshot(String fileName) {
        File src = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
        String destination = "/Users/yilizatiabudusaimaiti/IdeaProjects/TheGreatCourses/images/";
        try {
            FileUtils.copyFile(src, new File(destination + fileName + ".png"));
        } catch (IOException e) {
            System.out.println("------>>>>><<<<<<>>>>>> Screenshot is not taken");
        }

    }


    public void selectDropDownByValue(WebElement dropDown, String value) {
        Select select = new Select(dropDown);
        select.selectByValue(value);
    }


    public void switchToIframe(WebElement frameElement) {
        getDriver().switchTo().frame(frameElement);
        waitAbit(2);
    }

    public void stepOutOfFrame() {
        getDriver().switchTo().defaultContent();
        waitAbit(2);
    }

    public void highlight(WebElement element) {

        for (int i = 0; i < 2; i++) {
            try {
                JavascriptExecutor js = (JavascriptExecutor) getDriver();
                js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: black; border: 4px solid red;");
                Thread.sleep(500);
                js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }

        }

    }

}














