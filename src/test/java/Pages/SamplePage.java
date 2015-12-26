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

import java.io.File;
import java.lang.Thread;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

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

    @AndroidFindBy(id="go")
    private MobileElement GoButton;

    @AndroidFindBy(id="questionAnswerSample")
    private MobileElement questionAnswerSampleButton;

    @AndroidFindBy(id="questionAnswer")
    private MobileElement questionAnswerButton;

    @AndroidFindBy(id="hint")
    private MobileElement hintButton;

    @AndroidFindBy(id="statsButton")
    private MobileElement statsButton;

    @AndroidFindBy(id="title_text")
    private MobileElement titleText;

    @AndroidFindBy(id="moreQuestions")
    private MobileElement moreQuestions;

    @AndroidFindBy(id="fiveQuestion2")
    private MobileElement fiveQuestion2;

    @AndroidFindBy(id="continueButton")
    private MobileElement continueButton;

    @AndroidFindBy(id="sort")
    private MobileElement sort;

    @AndroidFindBy(id="date")
    private MobileElement date;



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


    public boolean takeScreenshot(final String name) {
        String screenshotDirectory = System.getProperty("appium.screenshots.dir", System.getProperty("java.io.tmpdir", ""));
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        return screenshot.renameTo(new File(screenshotDirectory, String.format("%s.png", name)));
    }

    public void clickMenu(){
        menuIcon.click();
        takeScreenshot("menu");
    }

    public void clickSignIn(){
        signInButton.click();
    }

    public void loginIn() {
        try {
            driver.findElementByXPath("//android.view.View[1]/android.widget.FrameLayout[2]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[2]/android.view.View[5]/android.widget.EditText[1]").sendKeys("demouser8");
            //android.view.View[1]/android.widget.FrameLayout[2]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[2]/android.view.View[7]/android.widget.EditText[1]
            driver.findElementByXPath("//android.view.View[1]/android.widget.FrameLayout[2]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[2]/android.view.View[7]/android.widget.EditText[1]").sendKeys("password1");

            Thread.sleep(10000);
            takeScreenshot("login");
            driver.findElementByXPath("//android.view.View[1]/android.widget.FrameLayout[2]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[2]/android.view.View[8]/android.view.View[1]/android.widget.Button[1]").click();
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void clickTodayQuestion(){
        try{
            takeScreenshot("QOTD");
            driver.findElementByXPath("//android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]").click();
            Thread.sleep(10000);
            GoButton.click();
            Thread.sleep(5000);
            takeScreenshot("questionAnswerSampleButton");
            questionAnswerSampleButton.click();
            Thread.sleep(5000);
            takeScreenshot("questionAnswerButton");
            questionAnswerButton.click();
            Thread.sleep(5000);
            takeScreenshot("hint");
            hintButton.click();


            Thread.sleep(5000);
            driver.findElementByXPath("//android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]").isDisplayed();

            Thread.sleep(5000);
            hintButton.click();

            Thread.sleep(5000);
            driver.findElementByXPath("//android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[3]").click();

            Thread.sleep(5000);

             takeScreenshot("answerPage");
            driver.findElementByXPath("//android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[3]/android.widget.Button[1]").click();
                                       //android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[3]/android.widget.Button[1]
            Thread.sleep(10000);


            //Select wrong answer

            String wronganswer = driver.findElementByXPath("//android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[2]").getAttribute("name");
            System.out.println(wronganswer);
            String correctAnswer;
            takeScreenshot("wrongAnswer");
                String answerOption = driver.findElementByXPath("//android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[4]").getAttribute("name");
                System.out.println(answerOption);

                String answerExplanation = driver.findElementByXPath("//android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[7]").getAttribute("name");
                System.out.println(answerExplanation);
            takeScreenshot("answerExplanation");
                correctAnswer= driver.findElementByXPath("//android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[9]").getAttribute("name");
                System.out.println(correctAnswer);

                String correctAnswerExplanation= driver.findElementByXPath("//android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[12]").getAttribute("name");
                System.out.println(correctAnswerExplanation);




            Thread.sleep(5000);
            takeScreenshot("stats");
            statsButton.click();

            String statusAnswer= driver.findElementByXPath("//android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[2]").getAttribute("name");
            if(wronganswer.equals(statusAnswer)){
                System.out.println("Test Passed");
            }

            String statusCorrectAnswer= driver.findElementByXPath("//android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[6]").getAttribute("name");
            String difficulty= driver.findElementByXPath("//android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[8]").getAttribute("name");
            if(wronganswer.equals(statusAnswer)){
                System.out.println("Test Passed");
            }

            System.out.println(difficulty);
            if(difficulty!=null){
                System.out.println("Test Passed");
            }

            if(driver.findElementByXPath("//android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[10]").getAttribute("name")!=null){
                System.out.println("Test Passed");
            }

            if(driver.findElementByXPath("//android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[12]").getAttribute("name")!=null){
                System.out.println("Test Passed");
            }

            if(driver.findElementByXPath("//android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.Button[1]").getAttribute("name").contains("facebook")){
                System.out.println("Test Passed");
            }

            if(driver.findElementByXPath("//android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.widget.ListView[1]/android.view.View[2]/android.widget.Button[1]").getAttribute("name").contains("twitter")){
                System.out.println("Test Passed");
            }

            if(driver.findElementByXPath("//android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[15]/android.widget.Button[1]").getAttribute("name").contains("Khan Academy")){
                System.out.println("Test Passed");
            }

            Thread.sleep(7000);
            driver.findElementByXPath("//android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.widget.ListView[1]/android.view.View[1]/android.widget.Button[1]").click();

            Thread.sleep(7000);

            statsButton.click();

            takeScreenshot("anyname");
            Thread.sleep(3000);
            String title= titleText.getText();
            if(title.equals("Question Archive")){
                System.out.println("Test Passed");
            }
            takeScreenshot("moreQuestions");
            moreQuestions.click();
            takeScreenshot("fiveQuestion2");
            Thread.sleep(4000);
            fiveQuestion2.click();

            Thread.sleep(4000);
            if(driver.findElementByXPath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]").isDisplayed())
            {
                System.out.println("Test Passed");
            }
            takeScreenshot("continueButton");
            continueButton.click();

            Thread.sleep(25000);

//            if(driver.findElementByXPath("//android.widget.RelativeLayout[1]/android.view.View[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TabHost[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[1]").isDisplayed()){
//                System.out.println("Test Passed");
//            }

             takeScreenshot("previousDate");

            String previousDate= date.getText();
            Thread.sleep(4000);
            sort.click();

            takeScreenshot("nextDate");

            Thread.sleep(4000);
            String Nextdate= date.getText();

            if(!previousDate.equals(Nextdate)){
                System.out.println("Test Passed");
            }

            date.click();

            takeScreenshot("AgainNextPage");
            Thread.sleep(10000);

            if(!titleText.equals(Nextdate)) {
                System.out.println("Test Passed");
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
