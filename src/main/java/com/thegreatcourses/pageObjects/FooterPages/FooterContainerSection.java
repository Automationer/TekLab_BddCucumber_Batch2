package com.thegreatcourses.pageObjects.FooterPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.thegreatcourses.base.BasePage.getDriver;

public class FooterContainerSection {

    public FooterContainerSection() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(css = ".footer-categories-list.clearfix li a")
    List<WebElement> courseCategoryLinks_footerContainer;

    @FindBy(xpath = "(//ul[@class='footer-categories-list'])[1]/li/a")
    List<WebElement> moreLinks_footerContainer;

    @FindBy(xpath = "(//ul[@class='footer-categories-list'])[2]/li/a")
    List<WebElement> helpLinks_footerContainer;

    public List<WebElement> getCourseCategoryLinks_footerContainer() {
        return courseCategoryLinks_footerContainer;
    }

    public List<WebElement> getMoreLinks_footerContainer() {
        return moreLinks_footerContainer;
    }

    public List<WebElement> getHelpLinks_footerContainer() {
        return helpLinks_footerContainer;
    }

}
