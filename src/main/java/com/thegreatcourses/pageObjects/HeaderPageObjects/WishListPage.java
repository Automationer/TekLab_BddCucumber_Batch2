package com.thegreatcourses.pageObjects.HeaderPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

import static com.thegreatcourses.base.BasePage.getDriver;

public class WishListPage {

    public WishListPage() {
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
        list.add("Settings");
        list.add("Your Recent Orders");
        list.add("Wish List");
        list.add("Your Email Preferences");
        list.add("Stored Payment Methods");
        list.add("Manage Devices");
        return list;
    }

}
