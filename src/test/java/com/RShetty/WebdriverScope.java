package com.RShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverScope {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Printing total number of links in webpage
        System.out.println("Total links in Webpage : " + driver.findElements(By.tagName("a")).size());

        // Optimised way of Limiting WebDriver scope to Footer section only.
        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));

        /// Optimised way of counting number of links present in footer only
        System.out.println("Total links in Footer only : " + footerDriver.findElements(By.tagName("a")).size());

        // Optimised way of Limiting WebDriver scope to Footer's 1st column[Discount coupons] only.
        WebElement ColumnDriver1 = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

        /// Optimised way of counting number of links present in footer's 1st column[Discount coupons] only
        System.out.println("Total links in Footer's 1st column[Discount coupons] : " + ColumnDriver1.findElements(By.tagName("a")).size());

    }
}
