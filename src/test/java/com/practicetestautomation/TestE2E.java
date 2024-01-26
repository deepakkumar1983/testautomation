package com.practicetestautomation;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestE2E {


    @Test
    public void e2eTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/dks/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        LoginPage login = new LoginPage(driver);


        login.typeUserName("student");
        login.password("Password123");
        login.submitBtn();
        login.checkSuccessMessageTitle("Logged In Successfully");
        login.checkSuccessMessageTag("Congratulations student. You successfully logged in!");

        
        driver.close();
    }
}