package com.bridgelabz.pages;

import com.bridgelabz.BaseTest.Base;
import org.openqa.selenium.By;

import java.awt.*;
import java.awt.event.InputEvent;

public class FileUpload extends Base {

    public static void fileUploadInApplication() throws InterruptedException, AWTException {

        Login.LoginToApplication();
        //Uploading file using robot class
        Robot robot = new Robot();
        //WebElement clickPhotoVideo = driver.findElement(By.xpath("//*[@id='ember45']/div[5]/div[1]/div[1]/div/div/button"));
        robot.mouseMove(209, 280);
        Thread.sleep(2000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(3000);
//        robot.mouseMove(215, 280);
//        Thread.sleep(5000);
        driver.findElement(By.className("pv-top-card__edit-photo-button")).click();
        Thread.sleep(5000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(10000);
    }
}
