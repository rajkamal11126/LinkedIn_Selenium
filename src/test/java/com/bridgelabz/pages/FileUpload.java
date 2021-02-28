package com.bridgelabz.pages;

import com.bridgelabz.BaseTest.Base;
import org.openqa.selenium.support.PageFactory;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.logging.Logger;

public class FileUpload extends Base {

    public static void fileUploadInApplication() throws InterruptedException, AWTException {
        Logger log = Logger.getLogger("Logger");
        Login login = PageFactory.initElements(driver, Login.class);
        login.LoginToApplication();
        Thread.sleep(1000);
        Robot robot = new Robot();
        robot.mouseMove(440, 300);
        log.info("Clicking on photo button");
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(1000);
        log.info("Entering photo name");
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_PERIOD);
        robot.keyPress(KeyEvent.VK_J);
        robot.keyPress(KeyEvent.VK_P);
        robot.keyPress(KeyEvent.VK_G);
        log.info("Clicking Enter");
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        robot.mouseMove(900, 570);
        log.info("Clicking on done button");
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
        robot.mouseMove(900, 580);
        log.info("Clicking on post button");
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5000);
        log.info("Photo post successfully...");
    }
}
