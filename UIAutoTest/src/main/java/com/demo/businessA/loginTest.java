package com.demo.businessA;

import com.demo.baseFrame.UseBrowser;
import com.demo.pageObject.LoginPageObject;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class loginTest {
    LoginPageObject page = new LoginPageObject();
    UseBrowser browser = new UseBrowser();
    WebDriver driver;


    @Test
    public void test_login(){
        page.email_Box(driver,"15800783221");
        page.password_Box(driver,"wlj1234");
        page.click_button(driver);

    }

    @BeforeSuite
    public void beforeSuite() throws InterruptedException {
        driver = browser.setupChrome("https://www.imooc.com");
        page.login_button(driver);
        Thread.sleep(1000);
    }

    @AfterSuite
    public void afterSuite(){
        browser.teardownBrowser();
    }
}

