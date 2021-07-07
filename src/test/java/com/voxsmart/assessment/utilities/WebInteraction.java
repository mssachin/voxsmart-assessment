package com.voxsmart.assessment.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WebInteraction {

    private static final WebDriver driver = InitDriver.getDriver();

    public static void clickElement(By locator){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).click();
    }

    public static void jsScrollToElement(By locator){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static List<WebElement> getNumberOfElements(By locator){
        WebDriverWait wait = new WebDriverWait(driver, 30);
       return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public static void navigateTo(String url){
        driver.get(url);
    }
}
