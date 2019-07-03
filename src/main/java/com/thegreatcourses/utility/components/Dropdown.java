package com.thegreatcourses.utility.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown implements Droppable<Dropdown> {

    private static WebElement dropdown;

    @Override
    public Dropdown $(WebElement element) {
        dropdown = element;
        return self();
    }

    public void selectByValue(String value) {
        Select select = new Select(dropdown);
        select.selectByValue(value);
    }

    public void selectByText(String text) {
        Select select = new Select(dropdown);
        select.deselectByVisibleText(text);
    }

    public void selectByTitle(String title) {
        List<WebElement> options = dropdown.findElements(By.tagName("option"));
        for (WebElement temp : options) {
            String titleAttr = temp.getAttribute("title");
            if (titleAttr.equalsIgnoreCase("Virginia")) {
                temp.click();
            }
        }
    }

    private Dropdown self() {
        return this;
    }

}
