package com.thegreatcourses.utility;

import com.thegreatcourses.utility.EnumTypes.BrowserType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Browser implements WebDriver {

    private BrowserType browserType;
    private final int timeout = 30;
    private final String chromeDriverPath = "/Users/yilizatiabudusaimaiti/IdeaProjects/TekLabAutomation/TheGreatCourses/src/main/resources/chromedriver";
    private final String firefoxDriverPath = "/Users/yilizatiabudusaimaiti/IdeaProjects/TheGreatCourses/src/main/resources/geckodriver";
    private static WebDriver driver;

    public Browser(BrowserType browserType) {
        this.browserType = browserType;
        createDriver(browserType);
        driver().manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
    }

    private WebDriver createDriver(BrowserType browserType) {
        switch (browserType) {
            case CHROME:
                driver = chromeDriver();
                break;

            case FIREFOX:
                driver = firefoxDriver();
                break;
            default:
                throw new RuntimeException("invalid browser name");
        }
        return driver();
    }

    private WebDriver chromeDriver() {
        if (!new File(chromeDriverPath).exists())
            throw new RuntimeException("chromedriver does not exist!");
        try {
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            return new ChromeDriver();
        } catch (Exception ex) {
            throw new RuntimeException("couldn't create chrome driver");
        }
    }

    private WebDriver firefoxDriver() {
        if (!new File(chromeDriverPath).exists()) {
            throw new RuntimeException("firefoxdriver does not exist");
        }
        System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
        return new FirefoxDriver();
    }

    protected static WebDriver driver() {
        return driver;
    }

    @Override
    public void get(String s) {
        driver().get(s);
    }

    @Override
    public String getCurrentUrl() {
        return driver().getCurrentUrl();
    }

    @Override
    public String getTitle() {
        return driver().getTitle();
    }

    @Override
    public List<WebElement> findElements(By by) {
        return driver().findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        return driver().findElement(by);
    }

    @Override
    public String getPageSource() {
        return driver().getPageSource();
    }

    @Override
    public void close() {
        driver().close();
    }

    @Override
    public void quit() {
        driver().quit();
    }

    @Override
    public Set<String> getWindowHandles() {
        return driver().getWindowHandles();
    }

    @Override
    public String getWindowHandle() {
        return driver().getWindowHandle();
    }

    @Override
    public TargetLocator switchTo() {
        return driver().switchTo();
    }

    @Override
    public Navigation navigate() {
        return driver().navigate();
    }

    @Override
    public Options manage() {
        return driver().manage();
    }

    public String toString() {
        return this.browserType.toString();
    }
}
