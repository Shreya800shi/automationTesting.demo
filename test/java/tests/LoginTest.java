package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeTest
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);
        loginPage = new LoginPage(driver);
    }

    @Test
    public void validLoginTest() {

        loginPage.openLoginPage();
        loginPage.enterUsername("student");
        loginPage.enterPassword("Password123");
        loginPage.clickLogin();

        // Validation
        String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    @AfterTest
    public void tearDown() {
        // driver.quit();
    }
}
