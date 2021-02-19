package com.bridgelabz.pages;

import com.bridgelabz.BaseTest.Base;
import com.bridgelabz.util.DataRead;
import org.openqa.selenium.By;
import java.util.logging.Logger;

public class Login extends Base {

    public static void LoginToApplication() throws InterruptedException {

        Logger log = Logger.getLogger("devpinoyLogger");
        String username = DataRead.getProperty("username");
        String password = DataRead.getProperty("password");

        driver.findElement(By.className("nav__button-secondary")).click();
        Thread.sleep(1000);
        log.info("Clicking on SignIn Button");
        driver.findElement(By.id("username")).sendKeys(username);
        Thread.sleep(1000);
        log.info("Entering username");
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(1000);
        log.info("Entering Password");
        driver.findElement(By.className("login__form_action_container")).click();
        Thread.sleep(2000);
        log.info("Clicking on submit button");

    }
}