package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators (USING ID)
    By username = By.id("username");
    By password = By.id("password");
    By submitBtn = By.id("submit");

    // Actions
    public void openLoginPage() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    public void enterUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(submitBtn).click();
    }
}
