package com.bridgelabz.pages;

import com.bridgelabz.BaseTest.Base;
import com.bridgelabz.util.DataRead;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.logging.Logger;

public class Login extends Base {

    @FindBy(className = "nav__button-secondary")
    WebElement signInButton;

    @FindBy(id = "username")
    WebElement userName;

    @FindBy(id = "password")
    WebElement Password;

    @FindBy(className = "login__form_action_container")
    WebElement submit;

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public void LoginToApplication() throws InterruptedException {
        Logger log = Logger.getLogger("Logger");
        String username = DataRead.getProperty("username");
        String password = DataRead.getProperty("password");

        signInButton.click();
        Thread.sleep(1000);
        log.info("Clicking on SignIn Button");
        userName.sendKeys(username);
        Thread.sleep(1000);
        log.info("Entering username");
        Password.sendKeys(password);
        Thread.sleep(1000);
        log.info("Entering Password");
        submit.click();
        Thread.sleep(2000);
        log.info("Clicking on submit button");
    }
}