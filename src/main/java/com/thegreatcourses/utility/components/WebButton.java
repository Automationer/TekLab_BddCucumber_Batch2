package com.thegreatcourses.utility.components;

import org.openqa.selenium.WebElement;

public class WebButton implements Clickable<WebButton> {


    @Override
    public WebButton $(WebElement element) {
        element.click();
        return self();
    }

    private WebButton self() {
        return this;
    }

}
