package com.thegreatcourses.utility.components;

import org.openqa.selenium.WebElement;

public interface Typable<T> {

    T $(WebElement element, String text);

}
