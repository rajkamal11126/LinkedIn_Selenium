package com.bridgelabz.test;

import com.bridgelabz.BaseTest.Base;
import com.bridgelabz.pages.SignOut;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

import static com.bridgelabz.pages.FileUpload.fileUploadInApplication;
import static com.bridgelabz.pages.Login.LoginToApplication;


public class LinkedInTest extends Base {

    String my_title = driver.getTitle();
    @Test(priority = 1)
    public void LoginToLinkedInApplication() throws InterruptedException {
        LoginToApplication();
        String expected_title = "Feed | LinkedIn";
        Assert.assertEquals(my_title,expected_title);

    }

    @Test(priority = 2)
    public void FileUploadInApplication() throws AWTException, InterruptedException {
        fileUploadInApplication();
        String expected_title = "Raj Kamal | LinkedIn";
        Assert.assertEquals(my_title,expected_title);

    }

    @Test(priority = 3)
    public void SignOutInApplication() throws AWTException, InterruptedException {
        SignOut signOut = new SignOut();
        signOut.signOutFromApplication();

    }
}
