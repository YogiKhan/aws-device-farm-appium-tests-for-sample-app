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

package Tests;


import Pages.SamplePage;
import Tests.AbstractBaseTests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Tests for a login page
 */
public class SampleTest extends TestBase {


    private SamplePage samplePage;

    @Override
    public String getName() {
        return "Sample Page";
    }

    /**
     * Creates a login
     */
    @BeforeTest
    @Override
    public void setUpPage() {
        samplePage = new SamplePage(driver);
    }

    /**
     * Tests logging in with valid credentials by verifying if the login message is correct
     */

//    @Test
//    public void clickIniswipe(){
//        samplePage.swipe();
//    }


    @Test
    public void clickMenu(){
         samplePage.clickMenu();
    }

    @Test
    public void clickSignIn(){
        samplePage.clickSignIn();
        try {
            Thread.sleep(40000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void clickTsignIn(){
        samplePage.loginIn();
    }

//    public void loginSuccessFully(){
//        loginPage.loginIn(CORRECT_USER_NAME, CORRECT_PASSWORD);
//        Assert.assertEquals(loginPage.getMessage(), LOGIN_SUCCESS_MESSAGE);
//    }
//
//    /**
//     * Tests logging in with invalid credentials by verifying if the error message is correct
//     */
//    @Test
//    public void loginFail() {
//        loginPage.loginIn(FAIL_USER_NAME, FAIL_PASSWORD);
//        Assert.assertEquals(loginPage.getMessage(), LOGIN_FAIL_MESSAGE);
//    }
//
//    /**
//     * After each test method, logout or try again
//     */
//    @AfterMethod
//    public void logOut(){
//        loginPage.pressAltButton();
//        Assert.assertTrue(loginPage.checkIfBackAtLogin());
//    }
}
