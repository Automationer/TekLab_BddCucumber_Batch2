package com.thegreatcourses.pageObjects.HeaderPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

import static com.thegreatcourses.base.BasePage.getDriver;

public class MyDigitalLibraryPage {

    public MyDigitalLibraryPage() {
        PageFactory.initElements(getDriver(), this);
    }

    private By leftNavBar = By.cssSelector(".vert-navigation");
    private By header = By.cssSelector("div div h1");

    public By getLeftNavBar() {
        return leftNavBar;
    }

    public By getHeader() {
        return header;
    }

    public List<String> getHeaderMessages() {
        List<String> list = new ArrayList<>();
        list.add("All Your Courses are here. Stream online or on the go via our apps.");
        list.add("All Your Audio Courses are here. Stream online or on the go via our apps.");
        list.add("All Your Video Courses are here. Stream online or on the go via our apps.");
        list.add("Streaming FAQ");
        list.add("Downloading FAQ");
        list.add("Select your Video and Audio File Formats.");
        return list;
    }

}
