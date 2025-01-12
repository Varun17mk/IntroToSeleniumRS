package com.RShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.name("enter-name")).sendKeys("Nurav");
        driver.findElement(By.id("alertbtn")).click();

        //Switching to  handle alerts which are not part of html page

        //to accept
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        // to accept or dismiss
        driver.findElement(By.id("confirmbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
//        driver.switchTo().alert().accept(); //accept
        driver.switchTo().alert().dismiss(); //dismiss
    }
}
