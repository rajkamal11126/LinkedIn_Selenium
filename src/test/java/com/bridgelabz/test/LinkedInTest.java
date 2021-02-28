package com.bridgelabz.test;

import com.bridgelabz.BaseTest.Base;
import com.bridgelabz.pages.Login;
import com.bridgelabz.pages.SignOut;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.awt.*;
import static com.bridgelabz.pages.FileUpload.fileUploadInApplication;

public class LinkedInTest extends Base {

    @Test(priority = 1)
    public void loginToApplication(){
        Login login = PageFactory.initElements(driver, Login.class);
        try {
           login.LoginToApplication();
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
        SignOut signOut = PageFactory.initElements(driver, SignOut.class);
        try {
            signOut.signOutFromApplication();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
