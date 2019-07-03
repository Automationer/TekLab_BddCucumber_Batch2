package com.thegreatcourses.utility.components;

import org.openqa.selenium.WebElement;

public interface Droppable<T> {

    T $(WebElement element);

}
