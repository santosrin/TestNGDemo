package com.san.testclasses;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_SeleniumParametersParallelExample {
 WebDriver driver;
 String baseURL;

 @BeforeClass
 @Parameters({"browser"})
    public void setUp(String browser) {
     baseURL = "https://letskodeit.teachable.com/";
     if(browser.equalsIgnoreCase("firefox")) {
         WebDriverManager.firefoxdriver().setup();
         driver = new FirefoxDriver();
     } else if(browser.equalsIgnoreCase("chrome")) {
         WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
     }
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.get(baseURL);
 }

 @Test
    public void testLogin() throws InterruptedException {
     driver.findElement(By.xpath("//a[@class='navbar-link fedora-navbar-link']")).click();
     driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("test@gmail.com");
     driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("test");
     driver.findElement(By.xpath("//input[@name='commit']")).click();
 }

 @AfterClass
    public void cleanUp() {
     driver.quit();
 }
}
