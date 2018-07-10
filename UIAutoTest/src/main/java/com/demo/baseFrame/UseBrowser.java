package com.demo.baseFrame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseBrowser {
    public WebDriver driver;

    public WebDriver setupChrome(String test_url){
        System.setProperty("webDriver.chrome.driver","/Users/coco/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get(test_url);
        return driver;
    }

    public void teardownBrowser(){
        driver.close();
    }
}
