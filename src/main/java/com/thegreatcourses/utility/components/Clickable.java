package com.thegreatcourses.utility.components;

import org.openqa.selenium.WebElement;

public interface Clickable<T> {

    T $(WebElement element);

}
