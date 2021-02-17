package com.bridgelabz.pages;

import com.bridgelabz.BaseTest.Base;
import org.openqa.selenium.By;

import java.awt.*;
import java.awt.event.InputEvent;

public class SignOut extends Base {

    public void signOutFromApplication() throws InterruptedException, AWTException {

        Login.LoginToApplication();
        //finding element using locators
        driver.findElement(By.xpath("//header/div[2]/nav[1]/ul[1]/li[6]/div[1]/button[1]/span[1]")).click();
        Thread.sleep(3000);
        Robot robot = new Robot();
        robot.mouseMove(849, 447);
        Thread.sleep(2000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(3000);
    }
}
