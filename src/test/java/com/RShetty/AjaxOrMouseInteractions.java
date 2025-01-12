package com.RShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AjaxOrMouseInteractions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//        driver.get("https://www.amazon.in/");
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.cssSelector("div[class='mouse-hover'] #mousehover "))).build().perform();
        //        a.moveToElement(driver.findElement(By.xpath("//span[text()='Account & Lists']"))).build().perform();
    }
}
