package com.bridgelabz.pages;

import com.bridgelabz.BaseTest.Base;
import org.openqa.selenium.By;
import java.awt.*;
import java.awt.event.InputEvent;
import java.util.logging.Logger;

public class FileUpload extends Base {

    public static void fileUploadInApplication() throws InterruptedException, AWTException {

        Logger log = Logger.getLogger("Logger");
        Login.LoginToApplication();
        //Uploading file using robot class
        Robot robot = new Robot();
        robot.mouseMove(209, 280);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        log.info("Clicking on profile pic");
        Thread.sleep(3000);
        driver.findElement(By.className("pv-top-card__edit-photo-button")).click();
        log.info("Clicking on edit photo button");
        Thread.sleep(5000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(10000);
    }
}
