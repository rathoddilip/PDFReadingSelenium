package com.selenium.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {

    public static WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///home/arjun/Downloads/Core_Java_with_SCJP_OCJP_Notes_By_Durga.pdf");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
