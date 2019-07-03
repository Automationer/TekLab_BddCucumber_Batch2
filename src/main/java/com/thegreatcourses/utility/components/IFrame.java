package com.thegreatcourses.utility.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface IFrame<T> {

    T switchToIFrame(WebElement element);

    T switchToIFrame(By idCss);

    T switchBackToDefault();
}
