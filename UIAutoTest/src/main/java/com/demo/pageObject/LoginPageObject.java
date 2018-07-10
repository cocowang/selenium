package com.demo.pageObject;

import com.demo.elementPath.PageElementPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject extends PageElementPath {

    public void login_button(WebDriver driver){
        driver.findElement(By.linkText(login_link_text)).click();
    }

    public void email_Box(WebDriver driver, String key_word){
        driver.findElement(By.name(userName_box_name)).clear();
        driver.findElement(By.name(userName_box_name)).sendKeys(key_word);

    }

    public void password_Box(WebDriver driver, String key_word){
        driver.findElement(By.name(password_box_name)).clear();
        driver.findElement(By.name(password_box_name)).sendKeys(key_word);

    }

    public void click_button(WebDriver driver){
        driver.findElement(By.xpath(login_button_xpath)).click();
    }

}
