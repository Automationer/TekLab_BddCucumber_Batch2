package com.thegreatcourses.pageObjects.CommonPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.thegreatcourses.base.BasePage.getDriver;

public class ChooseCourseFormatPage {

    public ChooseCourseFormatPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Video Download'])[2]")
    private WebElement videoDownload_radioBtn;

    @FindBy(xpath = "(//span[text()='DVD'])[2]")
    private WebElement dvd_radioBtn;

    @FindBy(xpath = "(//span[text()='CD Soundtrack'])[2]")
    private WebElement cdSoundtrack_radioBtn;

    @FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
    private WebElement addToCart_btn;

    private WebElement getVideoDownload_radioBtn() {
        return videoDownload_radioBtn;
    }

    private WebElement getDvd_radioBtn() {
        return dvd_radioBtn;
    }

    private WebElement getCdSoundtrack_radioBtn() {
        return cdSoundtrack_radioBtn;
    }

    public WebElement getAddToCart_btn() {
        return addToCart_btn;
    }

    public ChooseCourseFormatPage chooseCourseFormat(String format) {
        if (format.equalsIgnoreCase("video")) {
            getVideoDownload_radioBtn().click();
        }
        if (format.equalsIgnoreCase("dvd")) {
            getDvd_radioBtn().click();
        }
        if (format.equalsIgnoreCase("cd")) {
            getCdSoundtrack_radioBtn().click();
        }
        return this;
    }
}
