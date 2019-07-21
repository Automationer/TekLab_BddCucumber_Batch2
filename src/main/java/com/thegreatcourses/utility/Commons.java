package com.thegreatcourses.utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

import static com.thegreatcourses.base.BasePage.getDriver;
import static com.thegreatcourses.utility.components.SeleniumWaits.waitForPageLoadComplete;
import static org.assertj.core.api.Assertions.assertThat;

public class Commons {

    public void login(WebElement username, WebElement password, Keys submit, String... credentials) { // varArgs
        username.sendKeys(credentials[0]);
        password.sendKeys(credentials[1], submit);
        waitForPageLoadComplete();
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

    public void waitFor(int i) {
        try {
            Thread.sleep(i * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}














