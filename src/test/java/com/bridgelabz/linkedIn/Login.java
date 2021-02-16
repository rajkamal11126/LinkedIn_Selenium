package com.bridgelabz.linkedIn;

import com.bridgelabz.BaseTest.Base;
import com.bridgelabz.util.DataRead;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends Base {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.linkedin.com/home");
        String username = DataRead.getProperty("username");
        String password = DataRead.getProperty("password");
        driver.findElement(By.className("nav__button-secondary")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("username")).sendKeys(username);
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(By.className("login__form_action_container")).click();
        Thread.sleep(1000);

    }
}