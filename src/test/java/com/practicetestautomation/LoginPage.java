package com.practicetestautomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Objects;


public class LoginPage {

    WebDriver driver;

    By userName = By.id("username");
    By password = By.id("password");
    By submitBtn = By.id("submit");

    By successMessageTitle = By.className("post-title");
    By successMessageTag = By.tagName("strong");


    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    public void typeUserName(String uID) {
        driver.findElement(userName).sendKeys(uID);
    }

    public void password(String passw) {
        driver.findElement(password).sendKeys(passw);
    }

    public void submitBtn() {
        driver.findElement(submitBtn).click();

    }

    public void checkSuccessMessageTitle(String title) {
        String successMessage = driver.findElement(successMessageTitle).getText();
        assert Objects.equals(successMessage, title);
    }

    public void checkSuccessMessageTag(String title) {
        String successMessage = driver.findElement(successMessageTag).getText();
        assert Objects.equals(successMessage, title);
    }


}