package com.thegreatcourses.utility.components;

import org.openqa.selenium.WebElement;

public class TextField implements Typable<TextField> {
    @Override
    public TextField $(WebElement element, String text) {
        element.sendKeys(text);
        return self();
    }

    private TextField self() {
        return this;
    }

}
