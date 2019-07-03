package com.thegreatcourses.utility;

public interface IAlert<T> {

    T accept();

    T cancel();

    String getText();

}
