package com.bridgelabz.pages;

import com.bridgelabz.BaseTest.Base;
import com.bridgelabz.util.DataRead;
import org.openqa.selenium.By;

public class Login extends Base {

    public static void LoginToApplication() throws InterruptedException {

        String username = DataRead.getProperty("username");
        String password = DataRead.getProperty("password");
        driver.findElement(By.className("nav__button-secondary")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("username")).sendKeys(username);
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(By.className("login__form_action_container")).click();
        Thread.sleep(2000);

    }
}