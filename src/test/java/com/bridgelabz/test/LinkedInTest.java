package com.bridgelabz.test;

import com.bridgelabz.BaseTest.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

import static com.bridgelabz.pages.FileUpload.fileUploadInApplication;
import static com.bridgelabz.pages.Login.LoginToApplication;
import static com.bridgelabz.pages.SignOut.signOutFromApplication;


public class LinkedInTest extends Base {


    @Test(priority = 1)
    public void LoginToLinkedInApplication() {
        try {
            LoginToApplication();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String my_title = driver.getTitle();
        String expected_title = "Feed | LinkedIn";
        Assert.assertEquals(my_title,expected_title);

    }

    @Test(priority = 2)
    public void FileUploadInApplication()  {
        try {
            fileUploadInApplication();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        String my_title = driver.getTitle();
        String expected_title = "Raj Kamal | LinkedIn";
        Assert.assertEquals(my_title,expected_title);

    }

    @Test(priority = 3)
    public void SignOutInApplication() {
        try {
            signOutFromApplication();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (AWTException e) {
            e.printStackTrace();
        }

    }
}
