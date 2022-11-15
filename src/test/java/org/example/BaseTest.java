package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils
{
    @BeforeMethod
    public void OpenBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");

        //object created for Chrome Driver
        driver = new ChromeDriver();

        // for maximize screen
        driver.manage().window().maximize();

        // driver.get command is used for to open an Url and it will wait till whole page gets loaded
        driver.get("https://demo.nopcommerce.com/");
    }
    @AfterMethod
    public void CloseBroswer()  // to close the browser
    {
        driver.close();
    }
}