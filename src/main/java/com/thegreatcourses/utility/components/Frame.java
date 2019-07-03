package com.thegreatcourses.utility.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.thegreatcourses.base.BasePage.getDriver;

public class Frame implements IFrame<Frame> {


    @Override
    public Frame switchToIFrame(WebElement element) {
        getDriver().switchTo().frame(element);
        return self();
    }

    @Override
    public Frame switchToIFrame(By idCss) {
        return self();
    }

    @Override
    public Frame switchBackToDefault() {
        getDriver().switchTo().defaultContent();
        return self();
    }

    private Frame self() {
        return this;
    }

}
