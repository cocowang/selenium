package com.demo.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElementByXpath {
    public static WebElement getInputByValue(WebDriver driver,String value){
        return driver.findElement(By.xpath("//input[@value='" + value+"' or @VALUE='" + value+"']"));
    }

}
