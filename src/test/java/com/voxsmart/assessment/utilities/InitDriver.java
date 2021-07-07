package com.voxsmart.assessment.utilities;

import com.sun.xml.bind.v2.TODO;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class InitDriver {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        String browser = System.getenv("browser");
        if(browser.equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.setPageLoadStrategy(PageLoadStrategy.NONE);
            options.addArguments("--start-maximized");
            driver = new ChromeDriver(options);
        }else if(browser.equalsIgnoreCase("Firefox")){ //
            // TODO Firefox Driver
        }else{
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.setPageLoadStrategy(PageLoadStrategy.NONE);
            options.addArguments("--start-maximized");
            driver = new ChromeDriver(options);
        }

        return driver;
    }
    public static void quitDriver(){
        driver.quit();
    }

}
