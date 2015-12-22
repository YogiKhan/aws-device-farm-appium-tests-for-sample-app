/*
 * Copyright 2014-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package Pages;

import java.lang.Thread;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.Dimension;

/**
 * A login page
 */
public class SamplePage extends BasePage {
    /**
     * The login button
     */

    private final double START_OFFSET = 0.9;
    private final double END_OFFSET = 0.05;
    private final int SWIPE_DURATION = 1000;

    public TabViewPage tabViewPage;
    @AndroidFindBy(id = "sliding_menu")
    private MobileElement menuIcon;


    @AndroidFindBy(id = "swipeText")
    private MobileElement swipeText;

    @AndroidFindBy(id = "sign_in")
    private MobileElement signInButton;

//
//    @AndroidFindBy(id = "login_button")
//    private MobileElement loginButton;

    public SamplePage(AppiumDriver driver) {
        super(driver);
    }

//    /**
//     * The user name input
//     */
//    @AndroidFindBy(id = "username_text_input")
//    private MobileElement userNameField;
//
//    /**
//     * The password input
//     */
//    @AndroidFindBy(id = "password_text_input")
//    private MobileElement passwordField;
//
//
//
//    /**
//     * Tries to login with a set of credentials
//     *
//     * @param userName the username
//     * @param password the password

    public void swipe () {

        Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width * START_OFFSET);
        int endx = (int) (size.width * END_OFFSET);
        int starty = size.height / 2;

        try {
            Thread.sleep(10000);
            driver.swipe(startx, starty, endx, starty, SWIPE_DURATION);
            Dimension size1 = driver.manage().window().getSize();
            int startx1 = (int) (size1.width * START_OFFSET);
            int endx1 = (int) (size1.width * END_OFFSET);
            int starty1 = size1.height / 2;
            Thread.sleep(10000);
            driver.swipe(startx1, starty1, endx1, starty1, SWIPE_DURATION);
            Dimension size2 = driver.manage().window().getSize();
            int startx2 = (int) (size2.width * START_OFFSET);
            int endx2 = (int) (size2.width * END_OFFSET);
            int starty2 = size2.height / 2;
            Thread.sleep(10000);
            driver.swipe(startx2, starty2, endx2, starty2, SWIPE_DURATION);
            Dimension size3 = driver.manage().window().getSize();
            int startx3 = (int) (size3.width * START_OFFSET);
            int endx3 = (int) (size3.width * END_OFFSET);
            int starty3 = size3.height / 2;
            Thread.sleep(10000);
            driver.swipe(startx3, starty3, endx3, starty3, SWIPE_DURATION);
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void clickMenu(){
        menuIcon.click();
    }

    public void clickSignIn(){
        signInButton.click();
    }

    public void loginIn(){
         try {
             driver.findElementByXPath("//android.view.View[1]/android.widget.FrameLayout[2]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[2]/android.view.View[5]/android.widget.EditText[1]").sendKeys("demouser8");
             //android.view.View[1]/android.widget.FrameLayout[2]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[2]/android.view.View[7]/android.widget.EditText[1]
             driver.findElementByXPath("//android.view.View[1]/android.widget.FrameLayout[2]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[2]/android.view.View[7]/android.widget.EditText[1]").sendKeys("password1");

             Thread.sleep(10000);
             driver.findElementByXPath("//android.view.View[1]/android.widget.FrameLayout[2]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[2]/android.view.View[8]/android.view.View[1]/android.widget.Button[1]").click();
             Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        userNameField.sendKeys(userName);
//        passwordField.sendKeys(password);
//        loginButton.click();
    }

//    /**
//     *
//     * @return the login message
//     */
//    public String getMessage(){
//        return driver.findElementById("login_alt_message_textView").getText();
//    }
//
//    /**
//     * Checks to see if back at login page
//     *
//     * @return is back at login
//     */
//    public boolean checkIfBackAtLogin(){
//        return loginButton.isDisplayed() && userNameField.isDisplayed() && passwordField.isDisplayed();
//    }
//
//    /**
//     * Presses the logout/try again button
//     */
//    public void pressAltButton(){
//        driver.findElementById("alt_button").click();
//    }
}
